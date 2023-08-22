package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetBehavior

class BottomSheet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

        val sheet = findViewById<FrameLayout>(R.id.sheet)

        BottomSheetBehavior.from(sheet).apply {
            peekHeight = 300
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }


}