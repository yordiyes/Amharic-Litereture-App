package com.example.amharicliteretureapp

import BookAdapter
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NonFictionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nonfiction)

        //toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar2)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "NonFiction Books"

        // Enable the back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //         Sample data
        val books = listOf(

            Book(
                "ኦሪጅን",
                "ሃኒም ኤልያስ",
                R.drawable.origin,
                468,
                "\"Origin\" በዳን ብራውን የተጻፈ እና በ 2017 የታተመ ልቦለድ ነው። መጽሐፉ የሳይንስን፣ የሃይማኖት እና የኪነጥበብ ክፍሎችን አጣምሮ የያዘ በሮበርት ላንግዶን ተከታታይ \"መላእክት እና አጋንንት\" \"ዘ ዳ ቪንቺ ኮድ\" \"የጠፋው ምልክት\" እና \"ኢንፌርኖ\" በመቀጠል አምስተኛው መጽሐፍ ነው። \n" +
                        "\n" +
                        "መጽሐፉ የሳይንስ፣ ሃይማኖት እና ቴክኖሎጂ ጭብጦችን ይዳስሳል፣ እንዲሁም ስለ ሰው ልጅ የወደፊት ዕጣ ፈንታ ጥያቄዎችን ያስነሳል። በተጨማሪም በ Bilbao የሚገኘው የጉገንሃይም ሙዚየም፣ በባርሴሎና ውስጥ የሚገኘውን የሳግራዳ ቤተሰብ እና እንደ ጎያ እና ዳሊ ባሉ አርቲስቶች የተሰሩ ስራዎችን ጨምሮ በርካታ የእውነተኛ ህይወት ቦታዎችን እና የጥበብ ስራዎችን ያሳያል።\n" +
                        "\n" +
                        "በአጠቃላይ፣ \"Origin\" የምስጢርን፣ የታሪክ እና የሳይንስ ክፍሎችን አጣምሮ የያዘ በረቀቀ ሴራው፣ በቀላል መግለጫዎቹ እና ስሜትን ከፍና ዝቅ በሚያደርጉ ጭብጦች የተመሰገነ ድንቅ መጽሀፍ ነው።\n",
                111,
                "ሳይንስ"
            ),
            Book(
                "ዳግማዊ አጤሚኒልክ",
                "አፈወረቅ ገብረእየሱስ",
                R.drawable.menelik,
                115,
                "ይህ የ ታሪክ መፅሐፍ ነው።",
                1901,
                "ታሪክ"
            ),
            Book(
                "የዓድዋ ዘመቻና የአፄ ምኒሊክ አነሳስ",
                "ዳኘው ወልደስላሴ",
                R.drawable.atse,
                121,
                "ይህ የ ታሪክ መፅሐፍ ነው።",
                1974,
                "ታሪክ"
            ),
            Book(
                "ፕሌቶ የሶቅራጠስ የሕይወት መጨረሻ ቀናትና ፍልስፍና ",
                "ስንታየሁ ዘርአብሩክ",
                R.drawable.plato,
                170,
                "ይህ የ ኢ-ልብወለድ መፅሐፍ ነው።",
                2008,
                "ፍልስፍና"
            ),
            Book(
                "ባይብል ኮድ(BIBLE CODE)",
                "ሃሊም ኤልያስ",
                R.drawable.biblecode,
                296,
                "ይህ የ ኢ-ልብወለድ መፅሐፍ ነው።",
                2010,
                "ትርጉም"
            ),
            Book(
                "7 ቁጥር ",
                "መስፍን ሰለሞን ሙሀባ",
                R.drawable.sebat,
                162,
                "ይህ የ ኢ-ልብወለድ መፅሐፍ ነው።",
                2012,
                "ጠቅላላ እውቀት"
            )
        )

        // Set up RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view2)
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