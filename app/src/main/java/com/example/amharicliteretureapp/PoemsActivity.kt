package com.example.amharicliteretureapp

import BookAdapter
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PoemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poems)


        val toolbar = findViewById<Toolbar>(R.id.toolbar3)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Poem books"
        // Enable the back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //         Sample data
        val books = listOf(
            Book(
                "አንድ ቀን",
                "ኪሩበል ግርማ",
                R.drawable.and_ken,
                52,
                "ይህ የ ግጥም መድብል በ ውስጡ በርካታ በ ተለያየ ዘውግ ላይ የሚያጠነጥኑ ርዕሶች ላይ ያተኮሩ ግጥሞችን የያዘ ነው::",
                2013,
                "ግጥም"
            ),
            Book(
                "ንዝረት",
                "ዘሪሁን ገመ",
                R.drawable.nzret,
                106,
                "ይህ የ ግጥም መድብል በ ውስጡ በርካታ በ ተለያየ ዘውግ ላይ የሚያጠነጥኑ ርዕሶች ላይ ያተኮሩ ግጥሞችን የያዘ ነው::",
                2000,
                "ግጥም"
            ),
            Book(
                "ጣኦስ",
                "ዙፋን ክፍሌ",
                R.drawable.taos,
                78,
                "ይህ የ ግጥም መድብል በ ውስጡ በርካታ በ ተለያየ ዘውግ ላይ የሚያጠነጥኑ ርዕሶች ላይ ያተኮሩ ግጥሞችን የያዘ ነው::",
                2000,
                "ግጥም"
            ),
            Book(
                "አልሞትኩም",
                "ኪሩበል ኩማ",
                R.drawable.almotkum,
                61,
                "ይህ የ ግጥም መድብል በ ውስጡ በርካታ በ ተለያየ ዘውግ ላይ የሚያጠነጥኑ ርዕሶች ላይ ያተኮሩ ግጥሞችን የያዘ ነው::",
                2007,
                "ግጥም"
            ),
            Book(
                "አፍላ ገጾች",
                "ዮናስ መስፍን",
                R.drawable.aflagetsoch,
                90,
                "ይህ የ ግጥም መድብል በ ውስጡ በርካታ በ ተለያየ ዘውግ ላይ የሚያጠነጥኑ ርዕሶች ላይ ያተኮሩ ግጥሞችን የያዘ ነው::",
                2000,
                "ግጥም"
            ),
            Book(
                "የመጨረሻዋ እለት",
                "አብረሃም በእውቀት",
                R.drawable.yemechereshawaelet,
                78,
                "ይህ የ ግጥም መድብል በ ውስጡ በርካታ በ ተለያየ ዘውግ ላይ የሚያጠነጥኑ ርዕሶች ላይ ያተኮሩ ግጥሞችን የያዘ ነው::",
                2000,
                "ግጥም"
            ),
            Book(
                "ጨው በረንዳ",
                "ምስራቅ ተረፈ",
                R.drawable.chewberenda,
                71,
                "ይህ የ ግጥም መድብል በ ውስጡ በርካታ በ ተለያየ ዘውግ ላይ የሚያጠነጥኑ ርዕሶች ላይ ያተኮሩ ግጥሞችን የያዘ ነው::",
                2000,
                "ግጥም"
            )
        )

        // Set up RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view3)
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