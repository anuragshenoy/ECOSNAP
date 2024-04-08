package com.example.ecosnap

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class Ta: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.take)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Enable Up button
        supportActionBar?.setDisplayShowHomeEnabled(true) // Show back button
        var radioGroup = findViewById<RadioGroup>(R.id.radioGroup1)
        var button = findViewById<Button>(R.id.submit)
        button.setOnClickListener() {
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId

            if (selectedOption != -1) {
                // Retrieve the selected radio button
                val radioButton = findViewById<RadioButton>(selectedOption)
                val choice = radioButton.text
                // Display the text of the selected radio button in a toast
                Toast.makeText(this, "You've opted $choice .Thank You", Toast.LENGTH_SHORT).show()
            } else {
                // If no radio button is selected, show a message
                Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show()
            }
        }


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed() // Handle back button click
        return true
    }
}