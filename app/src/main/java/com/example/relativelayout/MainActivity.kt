package com.example.relativelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardProfile = findViewById<CardView>(R.id.cardProfile)
        cardProfile.setOnClickListener {
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }

        val cardHome = findViewById<CardView>(R.id.cardHome)
        cardHome.setOnClickListener {
            val intent = Intent(applicationContext, BottomNavigation::class.java)
            startActivity(intent)
        }


    }
}