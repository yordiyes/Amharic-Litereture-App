package com.example.amharicliteretureapp

import BookAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NonFictionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nonfiction)

        // Enable opening the drawer with the toolbar icon
        val toolbar = findViewById<Toolbar>(R.id.toolbar2)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "NonFiction Books"

        //         Sample data
        val books = listOf(
            Book("ዳግማዊ አጤሚኒልክ", "አፈወረቅ ገብረእየሱስ", R.drawable.menelik,115),
            Book("ኦሪጅን", "ሃኒም ኤልያስ",R.drawable.origin,468),
            Book("የዓድዋ ዘመቻና የአፄ ምኒሊክ አነሳስ", "ዳኘው ወልደስላሴ", R.drawable.atse,121),
            Book("ፕሌቶ የሶቅራጠስ የሕይወት መጨረሻ ቀናትና ፍልስፍና ", "ስንታየሁ ዘርአብሩክ", R.drawable.plato,170),
            Book("ባይብል ኮድ(BIBLE CODE)", "ሃሊም ኤልያስ", R.drawable.biblecode,296),
            Book("7 ቁጥር ", "መስፍን ሰለሞን ሙሀባ", R.drawable.sebat,162),
        )

        // Set up RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view2)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(books)

    }
}