package com.example.amharicliteretureapp

import BookAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PoemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poems)

        // Enable opening the drawer with the toolbar icon
        val toolbar = findViewById<Toolbar>(R.id.toolbar3)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Poem books"

        //         Sample data
        val books = listOf(
            Book("አንድ ቀን", "ኪሩበል ግርማ", R.drawable.and_ken,52, "",2000, "ግጥም"),
            Book("ንዝረት", "ዘሪሁን ገመ",R.drawable.nzret,106, "",2000, "ግጥም"),
            Book("ጣኦስ", "ዙፋን ክፍሌ", R.drawable.taos,78,"",2000, "ግጥም"),
            Book("አልሞትኩም", "ኪሩበል ኩማ",R.drawable.almotkum,61, "",2000, "ግጥም"),
            Book("አፍላ ገጾች", "ዮናስ መስፍን",R.drawable.aflagetsoch,90, "",2000, "ግጥም"),
            Book("የመጨረሻዋ እለት", "አብረሃም በእውቀት", R.drawable.yemechereshawaelet,78, "",2000, "ግጥም"),
            Book("ጨው በረንዳ", "ምስራቅ ተረፈ",R.drawable.chewberenda,71, "",2000, "ግጥም")
        )

        // Set up RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view3)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(books)

    }
}