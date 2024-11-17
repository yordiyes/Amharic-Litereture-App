package com.example.amharicliteretureapp

import android.os.Bundle
import BookAdapter
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



//         Sample data
        val books = listOf(
            Book(" ኦሮማይ", "በዓሉ ግርማ", R.drawable.oromay,372,"",2000, "ልብ ወለድ "),
            Book("የቀይ ኮከብ ጥሪ", "በዓሉ ግርማ",R.drawable.keykokeb,372,"",2000, "ልብ ወለድ "),
            Book("ከአድማስ ባሻገር", "በዓሉ ግርማ", R.drawable.admas,372, "",2000, "ልብ ወለድ "),
            Book("እመጓ", "ዓለማየሁ ዋሴ",R.drawable.emegua,270, "",2000, "ልብ ወለድ "),
            Book("ሌላሠው", "ምህረት ደበበ", R.drawable.lelasew,451, "",2000, "ልብ ወለድ "),
            Book("ዙቤይዳ", "አሌክስ አብርሃም", R.drawable.zubeyda, 251, "",2000, "ልብ ወለድ "),
            Book("ሰመመን","ሲሳይ ንጉሱ", R.drawable.sememen, 378, "",2000, "ልብ ወለድ "),
            Book("ችቦ", "አለማየሁ ዋሴ እሸቴ", R.drawable.chbo,200, "",2000, "ልብ ወለድ ")
        )

        // Set up RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view1)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(books)

    }
}