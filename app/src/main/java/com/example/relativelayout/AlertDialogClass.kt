package com.example.relativelayout

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AlertDialogClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        val showButton: Button = findViewById(R.id.showButton)
        showButton.setOnClickListener {
            showAlertDialog()
        }
    }

    private fun showAlertDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Check Internet")
               .setMessage("Do you want to uninstall the app?")
               .setPositiveButton("Yes"){dialog, which ->
                   Toast.makeText(this, "Successfully Uninstalled", Toast.LENGTH_SHORT).show()
               }

            .setNegativeButton("No"){dialog, which ->
                dialog.dismiss()
            }



            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()
    }
}