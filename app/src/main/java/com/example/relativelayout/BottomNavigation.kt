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
                }

                R.id.bottom_search -> {
                    replaceFragment(SearchFragment())
                }

                R.id.bottom_add -> {
                    Toast.makeText(this, "Upload Image & Video", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.bottom_reels -> {
                    replaceFragment(ReelsFragment())
                }

                R.id.bottom_profile -> {
                    replaceFragment(ProfileFragment())
                }

            } // end when
            true
        }
        replaceFragment(HomeFragment())

//        bottomNavigation.getOrCreateBadge(R.id.bottom_reels).apply {
//            number = 5
//            isVisible = true
//        }




    }// end onCreate

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }
}