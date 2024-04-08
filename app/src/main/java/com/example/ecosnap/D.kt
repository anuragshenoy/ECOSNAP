package com.example.ecosnap

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class D: AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.don)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Enable Up button
        supportActionBar?.setDisplayShowHomeEnabled(true) // Show back button
        val amount=findViewById<EditText>(R.id.amount)
        val don=findViewById<Button>(R.id.donate)
        val amt=amount.text
        don.setOnClickListener(){Toast.makeText(applicationContext, "Contributed $$amt to the cause and $amt Honor points awarded", Toast.LENGTH_LONG).show()
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed() // Handle back button click
        return true}
}