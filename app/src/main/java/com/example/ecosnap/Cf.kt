package com.example.ecosnap

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Cf: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crowd)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val amount=findViewById<EditText>(R.id.amount)
        val submit=findViewById<Button>(R.id.submit)
        val amt=amount.text
        submit.setOnClickListener(){ Toast.makeText(applicationContext, "Contributed $$amt to the cause and $amt Honor points awarded", Toast.LENGTH_LONG).show()}
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed() // Handle back button click
        return true}
}
