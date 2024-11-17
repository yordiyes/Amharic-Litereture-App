package com.example.amharicliteretureapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BooksDetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        val bookTitle = intent.getStringExtra("book_title")
        val bookAuthor = intent.getStringExtra("book_author")
        val bookCover = intent.getIntExtra("book_cover", R.mipmap.ic_launcher)
        val page_number = intent.getIntExtra("pages", R.mipmap.ic_launcher)
        val description = intent.getStringExtra("description")
        val year = intent.getIntExtra("year", R.mipmap.ic_launcher)
        val genera = intent.getStringExtra("genera")


        val scrollView=findViewById<ScrollView>(R.id.scrollview)
        val imageCover=findViewById<ImageView>(R.id.bookThumbnailDetailImageView)
        val bookName=findViewById<TextView>(R.id.bookTitle2)
        val author=findViewById<TextView>(R.id.bookAuthorDetailTextView)
        val genre=findViewById<TextView>(R.id.genere)
        val bookDescription=findViewById<TextView>(R.id.bookDescriptionDetailTextView)
        val pages=findViewById<TextView>(R.id.pages)
        val date=findViewById<TextView>(R.id.date)

        imageCover.setImageResource(bookCover)
        bookName.setText(bookTitle.toString())
        author.setText(bookAuthor.toString())
        pages.setText(page_number.toString())
        bookDescription.setText(description.toString())
        genre.setText(genera.toString())
        date.setText(year.toString())
    }
}