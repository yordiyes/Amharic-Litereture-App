package com.example.amharicliteretureapp

import BookAdapter
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FictionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiction)

        // Enable opening the drawer with the toolbar icon
        val toolbar = findViewById<Toolbar>(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Fiction Books"

        // Enable the back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


//         Sample data
        val books = listOf(
            Book(
                " ኦሮማይ",
                "በዓሉ ግርማ",
                R.drawable.oromay,
                372,
                "ደራሲ በዓሉ ግርማ በተለይ በልብ ወለድ እና በፈጠራ የሥነ ጽሑፍ ሥራዎች ከታወቁት የኢትዮጵያ የዘመኑ ደራሲዎች መካከል ተወዳጅነትና ዝናን ያተረፉ ዕውቅ ደራሲ ነበሩ። ከጻፏቸው በርካታ ድርሰቶቻቸው ውስጥ «ከአድማስ ባሻገር» የተሰኘው መጽሐፋቸው በሩስኛ ቋንቋ ተተርጉሞ በቀድሞዋ የሶቪየት ሶሽያሊስት ሕብረት ሪፑብሊክ ቀርቧል። በተጨማሪም በጋዜጠኝነት ሙያም ስማቸውን ያስጠሩ፤ ሙያቸውንም ያስከበሩ ደራሲ ነበሩ። «የዛሬይቱ ኢትዮጵያ» ጋዜጣ፤ የመነን መጽሔት፤ የአዲስ ሪፖርተር መጽሔት፤ የአዲስ ዘመን ጋዜጣ ዋና አዘጋጅ በመሆን ከመሥራታቸውም ባሻገር፤ ብዙ ወጣት ጋዜጠኞችን ለማፍራት ጥረት አድርገዋል። አዲስ ሪፖርተር የተባለውን መጽሔትም ደረጃው ከፍ እንዲልና በዓለም አቀፍ ደረጃ እንዲገመገም አድርገዋል። በጋዜጠኝነት ሙያቸው በኢትዮጵያ ራዲዮ ሠርተዋል።\n" +
                        "\n" +
                        "ደራሲ በዓሉ ግርማ ለኢትዮጵያ ሥነጽሑፍ ከፍተኛ አስተዋጽኦ ያበረከቱና ብዙ ሥራዎችን ያቀረቡ ሲሆን፤ የመጨረሻው መጽሐፋቸው «ኦሮማይ» በመባል ይታወቃል። ይኼውም መጽሐፍ በወቅቱ በነበረው የደርግ መንግሥት ሊደገፍ ባለመቻሉ በ1976 ዓ.ም. ለደራሲው ሕይወት መጥፋት መንስኤ ሊሆን በቅቷል።",
                1976,
                "ልብ ወለድ"
            ),
            Book("የቀይ ኮከብ ጥሪ", "በዓሉ ግርማ", R.drawable.keykokeb, 264, "ከዚያ በፊት በአሉ በተለያዩ የተማሪ መጽሔቶች (የጄነራል ዊንጌቱ “Chindit” እና የዩኒቨርስቲ ኮሌጁ “News and Views”) ግጥሞቹን ማቅረብ ለምዶ ነበር። ከፈጠራ ድርሰት ባሻገርም በጋዜጣና መጽሔት አዘጋጅነት (“News and Views”፣ “Addis Reporter”፣ “መነን” እና “አዲስ ዘመን”) የበርካታ አመታት ልምድ ነበረው። በኒህም አመታት በተቻለው መጠን የአዘጋጅነቱን ሚና በመጠቀም (በተለይ በ”መነን” እና “አዲስ ዘመን”) በርካታ ኪነጥበባዊ አምዶችን (ለምሳሌ “አጭር ልብወለድ”፣ “ከኪነጥበባት አካባቢ”) አስጀምሮ  ነበር።", 1973, "ልብ ወለድ"),
            Book(
                "ከአድማስ ባሻገር",
                "በዓሉ ግርማ",
                R.drawable.admas,
                183,
                "“ከአድማስ ባሻገር” የበአሉ ግርማ የመጀመሪያ የልብ ወለድ መጽሐፍ ቢሆንም በኩር የፈጠራ ሥራው አልነበረም። ከዚያ በፊት በአሉ በተለያዩ የተማሪ መጽሔቶች (የጄነራል ዊንጌቱ “Chindit” እና የዩኒቨርስቲ ኮሌጁ “News and Views”) ግጥሞቹን ማቅረብ ለምዶ ነበር። ከፈጠራ ድርሰት ባሻገርም በጋዜጣና መጽሔት አዘጋጅነት (“News and Views”፣ “Addis Reporter”፣ “መነን” እና “አዲስ ዘመን”) የበርካታ አመታት ልምድ ነበረው። በኒህም አመታት በተቻለው መጠን የአዘጋጅነቱን ሚና በመጠቀም (በተለይ በ”መነን” እና “አዲስ ዘመን”) በርካታ ኪነጥበባዊ አምዶችን (ለምሳሌ “አጭር ልብወለድ”፣ “ከኪነጥበባት አካባቢ”) አስጀምሮ  ነበር።",
                1962,
                "ልብ ወለድ"
            ),
            Book(
                "እመጓ",
                "ዓለማየሁ ዋሴ",
                R.drawable.emegua,
                270,
                "እመጓ የእኛ ዘመን ዘመናዊ ትውልድ የደረሰበትን የባህል ግጭት ማዕከል አድረጎና ቀዳሚው የሕይወት ፍልስፍናችን ከአዲሱ የሰው ልጅ የቴክኖሎጂ እድገትና ውስብስብነት ጋር ከመስማማት አልፎ ሚያመጣውን ችግር የማስወገድና የማከም አቅም ያለው መሆኑን ለማሳየት የተዘጋጀ ሚታዊ ድንቅ የጉዞ ልቦለድ መሆኑን ለመረዳት የሚያዳግት አይመስልም፡፡ በተለይም ጽዋው መንዝ ውስጥ እመጓ ይገኛል ብሎ ሲሳይን በዚሁ አሳምኖ መጨረሱ መጽሐፉ አንደኛ በአንጻረ ጽዋ የሕይወት መገኛዎች (ለምሳሌ እነ አባ አክሊሉ ዓይነት ሰዎች) ያሉት እዚህ ነው፤ ማዕከሉም (መንዝ ለኢትዮጵያ ማዕከል እንደምትሆነው) እዚሁ ነው፤ መንዝህ የሕይወት መርጫዉም፣ ተረጭውም፤ ረጪውም፣ የሚረጨውም እዚሁ ነው፡፡",
                2007,
                "ልብ ወለድ"
            ),
            Book("ሌላሠው", "ምህረት ደበበ", R.drawable.lelasew, 451, "", 2000, "ልብ ወለድ "),
            Book(
                "ዙቤይዳ",
                "አሌክስ አብርሃም",
                R.drawable.zubeyda,
                251,
                "« ዙቤይዳ» በደራሲ አሌክስ አብርሃም የተፃፈ የአጭር እና መካከለኛ ልቦለድ ስብስቦች መፅሐፍ ነው። ይህ የኢትዯጵያዊያንን ማህበራዊ ጉዳይ በጥልቀት የሚዳስስ የልብ ወለድ እና ወግ መፅሐፍ የደራሲው ሁለተኛ መፅሐፍ ነው። አሌክስ አብርሃም ባለፉት አስራ ሶስት ዓመታት በኢትዮጵያ ስነፅሁፍ ደምቆ የታየ ገጣሚ፣ የአጭር እና ረዥም ልብወለድ እንዲሁም የወግ ፀሐፊ ሲሆን፤ ከዛ በፊት በመሃበራዊ ድረ ገፅ በሚፅፋቸው ወጎች ፣ ጠንካራ ማህበራዊ ሂሶች እና ረዣዥም ግጥሞቹ በብዙ ሚሊየን አንባቢዎች ዘንድ ከፍተኛ እውቅና ያተረፈ ወጣት ደራሲ ነው።",
                2009,
                "ልብ ወለድ"
            ),
            Book("ሰመመን", "ሲሳይ ንጉሱ", R.drawable.sememen, 272, "ደራሲው ;ሲሳይ ንጉሱ ይባላል በ1977  የፃፈው መፅሀፍ ነው በውስጡም 272 ገፆች አሉት ግርዶሽ,ትንሳኤ,የቅናት ዛር እና ረቂቅ አሻራ የሚባሉም ተጨማሪ የሱ መፅሀፍት ናቸው::\n" +
                    "መፅሀፉ መቼት ያረገው ዩንቨርስቲ ላይ ሲሆን የገፀባህሪያቱም ስም አቤል;ትዕግስት;እስክንድር;ማርታ ;ቤቴልሔም;ዮናታን ናቸው:: ታሪኩ የሚያጠነጥነው የአንድ ወጣት ሰቃይ ተማሪ በአይን ፍቅር መያዝና በዛም ፍቅር ም/ት የሚሰቃየውን ስቃይ ያስቀኛል በመጨረሻም በጓደኞቹና በመምህሩ ያላሰለሰ ጥረት ለፍቅሩ እስትንፋስ ለሆነችው ልጅ እንደሚወዳት ሲናገር ያበቃል::", 1977, "ልብ ወለድ"),
            Book("ችቦ", "አለማየሁ ዋሴ እሸቴ", R.drawable.chbo, 200, "", 2000, "ልብ ወለድ ")
        )

        // Set up RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view1)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(books)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> { // Handle the back button press
                onBackPressed() // Navigate back to the previous activity
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}