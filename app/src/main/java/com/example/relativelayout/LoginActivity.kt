package com.example.relativelayout

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var spinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton:Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            showAlertDialog()
        }

        // spinner
        spinner = findViewById(R.id.spinner)
        val listItems = listOf("Admin", "Staff", "Student", "Finance")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listItems)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedItem = parent.getItemIdAtPosition(position)
                Toast.makeText(applicationContext, "Selected ${listItems[position]}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }

    private fun showAlertDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Confirm Login")
            .setMessage("Are you sure, you want to login?")
            .setPositiveButton("Yes"){dialog, which ->
                Toast.makeText(this, "Logged in Successfully", Toast.LENGTH_SHORT).show()
            }

            .setNegativeButton("No"){dialog, which ->
                dialog.dismiss()
            }



        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()
    }
}