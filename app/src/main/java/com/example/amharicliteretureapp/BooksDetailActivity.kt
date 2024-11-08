package com.example.amharicliteretureapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity





import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BooksDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val scrollView=findViewById<ScrollView>(R.id.scrollview)
        val imageCover=findViewById<ImageView>(R.id.bookThumbnailDetailImageView)
        val bookName=findViewById<TextView>(R.id.bookTitleDetailTextView)
        val author=findViewById<TextView>(R.id.bookAuthorDetailTextView)
        val genre=findViewById<TextView>(R.id.genere)
        val bookDescription=findViewById<TextView>(R.id.bookDescriptionDetailTextView)
        val pages=findViewById<TextView>(R.id.pages)
    }
}