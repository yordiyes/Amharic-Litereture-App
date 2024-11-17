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
        supportActionBar?.title = "My Books App"

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()





//         Sample data
        val books = listOf(
            Book(" ኦሮማይ", "በዓሉ ግርማ", R.drawable.oromay,372),
            Book("የቀይ ኮከብ ጥሪ", "በዓሉ ግርማ",R.drawable.keykokeb,372),
            Book("ከአድማስ ባሻገር", "በዓሉ ግርማ", R.drawable.admas,372),
            Book("እመጓ", "ዓለማየሁ ዋሴ",R.drawable.emegua,270),
            Book("ሌላሠው", "ምህረት ደበበ", R.drawable.lelasew,451),
            Book("ዙቤይዳ", "አሌክስ አብርሃም", R.drawable.zubeyda, 251)
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