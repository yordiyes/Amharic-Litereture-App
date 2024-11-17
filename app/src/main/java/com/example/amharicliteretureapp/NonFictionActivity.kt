package com.example.amharicliteretureapp

import BookAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NonFictionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nonfiction)

        //         Sample data
        val books = listOf(
            Book("Book Title 1", "Author 1", R.mipmap.ic_launcher),
            Book("Book Title 2", "Author 2",R.mipmap.ic_launcher),
            Book("Book Title 3", "Author 3", R.mipmap.ic_launcher)
        )

        // Set up RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view2)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(books)

    }
}