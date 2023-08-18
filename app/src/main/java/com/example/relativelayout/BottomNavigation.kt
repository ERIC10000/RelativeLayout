package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigation : AppCompatActivity() {
    private lateinit var bottomNavigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){

                R.id.bottom_home -> {
                    replaceFragment(HomeFragment())
                    true
                }

                R.id.bottom_search -> {
                    replaceFragment(SearchFragment())
                    true
                }

                R.id.bottom_add -> {
                    Toast.makeText(this, "Upload Image & Video", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.bottom_reels -> {
                    replaceFragment(ReelsFragment())
                    true
                }

                R.id.bottom_profile -> {
                    replaceFragment(ProfileFragment())
                    true
                }

                else -> false

            } // end when
        }

        replaceFragment(HomeFragment())

    }// end onCreate

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }
}