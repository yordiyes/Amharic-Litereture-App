package com.example.amharicliteretureapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        // Set a delay of 3 seconds (adjust as needed)
        Handler().postDelayed({
            // Start MainActivity after splash screen
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // To close SplashScreenActivity so it won't be in the back stack
        }, 3000)  // 3000 milliseconds = 3 seconds
    }
}