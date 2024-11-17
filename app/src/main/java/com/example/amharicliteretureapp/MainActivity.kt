package com.example.amharicliteretureapp

import BookAdapter
import android.content.Intent
import android.os.Bundle

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.drawer_layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        drawerLayout = findViewById(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.navigation_view)

        // Handle navigation item clicks
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_fiction -> {
                    startActivity(Intent(this, FictionActivity::class.java))
                    true
                }
                R.id.nav_nonfiction -> {
                    startActivity(Intent(this, NonFictionActivity::class.java))
                    true
                }
                R.id.nav_poems -> {
                    startActivity(Intent(this, PoemsActivity::class.java))
                    true
                }
                // Handle additional categories here
                else -> false
            }
        }




        // Enable opening the drawer with the toolbar icon
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "All Books"

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()





//         Sample data
        val books = listOf(
            Book(" ኦሮማይ", "በዓሉ ግርማ", R.drawable.oromay,372,"ደራሲ በዓሉ ግርማ በተለይ በልብ ወለድ እና በፈጠራ የሥነ ጽሑፍ ሥራዎች ከታወቁት የኢትዮጵያ የዘመኑ ደራሲዎች መካከል ተወዳጅነትና ዝናን ያተረፉ ዕውቅ ደራሲ ነበሩ። ከጻፏቸው በርካታ ድርሰቶቻቸው ውስጥ «ከአድማስ ባሻገር» የተሰኘው መጽሐፋቸው በሩስኛ ቋንቋ ተተርጉሞ በቀድሞዋ የሶቪየት ሶሽያሊስት ሕብረት ሪፑብሊክ ቀርቧል። በተጨማሪም በጋዜጠኝነት ሙያም ስማቸውን ያስጠሩ፤ ሙያቸውንም ያስከበሩ ደራሲ ነበሩ። «የዛሬይቱ ኢትዮጵያ» ጋዜጣ፤ የመነን መጽሔት፤ የአዲስ ሪፖርተር መጽሔት፤ የአዲስ ዘመን ጋዜጣ ዋና አዘጋጅ በመሆን ከመሥራታቸውም ባሻገር፤ ብዙ ወጣት ጋዜጠኞችን ለማፍራት ጥረት አድርገዋል። አዲስ ሪፖርተር የተባለውን መጽሔትም ደረጃው ከፍ እንዲልና በዓለም አቀፍ ደረጃ እንዲገመገም አድርገዋል። በጋዜጠኝነት ሙያቸው በኢትዮጵያ ራዲዮ ሠርተዋል።\n" +
                    "\n" +
                    "ደራሲ በዓሉ ግርማ ለኢትዮጵያ ሥነጽሑፍ ከፍተኛ አስተዋጽኦ ያበረከቱና ብዙ ሥራዎችን ያቀረቡ ሲሆን፤ የመጨረሻው መጽሐፋቸው «ኦሮማይ» በመባል ይታወቃል። ይኼውም መጽሐፍ በወቅቱ በነበረው የደርግ መንግሥት ሊደገፍ ባለመቻሉ በ1976 ዓ.ም. ለደራሲው ሕይወት መጥፋት መንስኤ ሊሆን በቅቷል።",1976,"ልብ ወለድ"),
            Book("7 ቁጥር ", "መስፍን ሰለሞን ሙሀባ", R.drawable.sebat,162, " በዚህ ቅኝት “ሰባት ቁጥር” መጽሐፍ፣ ከሒሳብ እና/ወይም ከሃይማኖታዊ አስተምህሮ አንጻር በይዘቱ ውስጥ የተካተቱትን ነገረ ቁጥር፣ የቁጥር ጽንሰ ሐሳቦች፣ አመዳደቦችና ተዛምዶዎች ይዳሰሳሉ። ይህም ዳሳሹ ከደራሲው የበለጠ መለኪያ አለው ለማለት ሳይሆን የይዘቶቹ  አቀራረብ በአመክንዮና በሌላ ተደራሲ አተያይ ይፈተሻሉ ለማለት ነው።\n" +
                    "የዳሰሳው ዓላማ፡- ሒሳብና ቁጥር እንደ ሌሎች መንገዶች፣ ስልቶችና ቁሶች ሁሉ የሰውን ልጅ የዕለት ተዕለት ህይወት እንዲያግዙ በራሱ በሰው ልጅ የተፈጠሩ መገልገያው ናቸው። ከዚህ ያለፈ ተገላጭና ቀጥተኛ መለኮታዊም ሆነ መንፈሳዊ ትስስር የላቸውም፤ ማለትም ቅዱስም እርኩስም የሚባል ቁጥር የለም። በሳይንሳዊውም ሆነ በመንፈሳዊው አውድ፣ አፍቅሮተ/አምልኮተ ቁጥር የተወገዘና ከቁጥር አገልግሎት የማይመደብ፣ በዕውቀትነት ለማስተማርም ያልበቃ ነው። ስለሆነም የዚህ ዳሰሳ ዓላማ መጽሐፉን ማንቆለጳጰስ ወይም ማብጠልጠል\n" +
                    "ሳይሆን ቁጥርና የቁጥር ጽንሰ ሃሳብን፣ ደራሲው የተነተነበትንና ያዛመደበትን መንገድ ለደራሲው እንዲሁም ለዚህ ጽሑፍ አንባብያን  ነጥሎ ማሳየት ነው።", 2013, "ሳይንስ እና ምርምር"),
            Book("ከአድማስ ባሻገር", "በዓሉ ግርማ", R.drawable.admas,372, "“ከአድማስ ባሻገር” የበአሉ ግርማ የመጀመሪያ የልብ ወለድ መጽሐፍ ቢሆንም በኩር የፈጠራ ሥራው አልነበረም። ከዚያ በፊት በአሉ በተለያዩ የተማሪ መጽሔቶች (የጄነራል ዊንጌቱ “Chindit” እና የዩኒቨርስቲ ኮሌጁ “News and Views”) ግጥሞቹን ማቅረብ ለምዶ ነበር። ከፈጠራ ድርሰት ባሻገርም በጋዜጣና መጽሔት አዘጋጅነት (“News and Views”፣ “Addis Reporter”፣ “መነን” እና “አዲስ ዘመን”) የበርካታ አመታት ልምድ ነበረው። በኒህም አመታት በተቻለው መጠን የአዘጋጅነቱን ሚና በመጠቀም (በተለይ በ”መነን” እና “አዲስ ዘመን”) በርካታ ኪነጥበባዊ አምዶችን (ለምሳሌ “አጭር ልብወለድ”፣ “ከኪነጥበባት አካባቢ”) አስጀምሮ  ነበር።", 1962, "ልብ ወለድ"),
            Book("እመጓ", "ዓለማየሁ ዋሴ",R.drawable.emegua,270,"እመጓ የእኛ ዘመን ዘመናዊ ትውልድ የደረሰበትን የባህል ግጭት ማዕከል አድረጎና ቀዳሚው የሕይወት ፍልስፍናችን ከአዲሱ የሰው ልጅ የቴክኖሎጂ እድገትና ውስብስብነት ጋር ከመስማማት አልፎ ሚያመጣውን ችግር የማስወገድና የማከም አቅም ያለው መሆኑን ለማሳየት የተዘጋጀ ሚታዊ ድንቅ የጉዞ ልቦለድ መሆኑን ለመረዳት የሚያዳግት አይመስልም፡፡ በተለይም ጽዋው መንዝ ውስጥ እመጓ ይገኛል ብሎ ሲሳይን በዚሁ አሳምኖ መጨረሱ መጽሐፉ አንደኛ በአንጻረ ጽዋ የሕይወት መገኛዎች (ለምሳሌ እነ አባ አክሊሉ ዓይነት ሰዎች) ያሉት እዚህ ነው፤ ማዕከሉም (መንዝ ለኢትዮጵያ ማዕከል እንደምትሆነው) እዚሁ ነው፤ መንዝህ የሕይወት መርጫዉም፣ ተረጭውም፤ ረጪውም፣ የሚረጨውም እዚሁ ነው፡፡", 2007, "ልብ ወለድ"),
            Book("ሌላሠው", "ምህረት ደበበ", R.drawable.lelasew,451, "somting", 2008, "ልብ ወለድ"),
            Book("ዙቤይዳ", "አሌክስ አብርሃም", R.drawable.zubeyda, 251, "« ዙቤይዳ» በደራሲ አሌክስ አብርሃም የተፃፈ የአጭር እና መካከለኛ ልቦለድ ስብስቦች መፅሐፍ ነው። ይህ የኢትዯጵያዊያንን ማህበራዊ ጉዳይ በጥልቀት የሚዳስስ የልብ ወለድ እና ወግ መፅሐፍ የደራሲው ሁለተኛ መፅሐፍ ነው። አሌክስ አብርሃም ባለፉት አስራ ሶስት ዓመታት በኢትዮጵያ ስነፅሁፍ ደምቆ የታየ ገጣሚ፣ የአጭር እና ረዥም ልብወለድ እንዲሁም የወግ ፀሐፊ ሲሆን፤ ከዛ በፊት በመሃበራዊ ድረ ገፅ በሚፅፋቸው ወጎች ፣ ጠንካራ ማህበራዊ ሂሶች እና ረዣዥም ግጥሞቹ በብዙ ሚሊየን አንባቢዎች ዘንድ ከፍተኛ እውቅና ያተረፈ ወጣት ደራሲ ነው።", 2009, "ልብ ወለድ"),
            Book("ሰመመን","ሲሳይ ንጉሱ", R.drawable.sememen, 378,"something", 2001, "ልብ ወለድ"),
            Book("አንድ ቀን", "ኪሩበል ግርማ", R.drawable.and_ken,52,"something", 2001, "ልብ ወለድ"),
            Book("የቀይ ኮከብ ጥሪ", "በዓሉ ግርማ",R.drawable.keykokeb,372,"something", 2001, "ልብ ወለድ"),
            Book("ንዝረት", "ዘሪሁን ገመ 2",R.drawable.nzret,106,"something", 2001, "ልብ ወለድ"),
            Book("ዳግማዊ አጤሚኒልክ", "አፈወረቅ ገብረእየሱስ", R.drawable.menelik,115,"something", 2001, "ልብ ወለድ"),
            Book("ኦሪጅን", "ሃኒም ኤልያስ",R.drawable.origin,468,"something", 2001, "ልብ ወለድ"),
            Book("አልሞትኩም", "ኪሩበል ኩማ",R.drawable.almotkum,61,"something", 2001, "ልብ ወለድ"),
            Book("አፍላ ገጾች", "ዮናስ መስፍን",R.drawable.aflagetsoch,90,"something", 2001, "ልብ ወለድ"),
            Book("የዓድዋ ዘመቻና የአፄ ምኒሊክ አነሳስ", "ዳኘው ወልደስላሴ", R.drawable.atse,121,"something", 2001, "ልብ ወለድ"),
            Book("ፕሌቶ የሶቅራጠስ የሕይወት መጨረሻ ቀናትና ፍልስፍና ", "ስንታየሁ ዘርአብሩክ", R.drawable.plato,170, "somting", 2001, "ልብ ወለድ"),
            Book("ባይብል ኮድ(BIBLE CODE)", "ሃሊም ኤልያስ", R.drawable.biblecode,296, "something", 2001, "ልብ ወለድ"),
            Book("የመጨረሻዋ እለት", "አብረሃም በእውቀት", R.drawable.yemechereshawaelet,78, "something", 2001, "ልብ ወለድ"),
            Book("ጨው በረንዳ", "ምስራቅ ተረፈ",R.drawable.chewberenda,71, "something", 2001, "ልብ ወለድ"),
            Book("ችቦ", "አለማየሁ ዋሴ እሸቴ", R.drawable.chbo,200, "something", 2001, "ልብ ወለድ")
        )

        // Set up RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(books)

    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


}