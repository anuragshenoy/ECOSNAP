package com.example.ecosnap

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Al: AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.action)
    val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val take=findViewById<Button>(R.id.TakeAction)
        val don=findViewById<Button>(R.id.Donate)
        take.setOnClickListener(){intent = Intent(this, Ta::class.java)
            startActivity(intent)}
        don.setOnClickListener(){intent = Intent(this, D::class.java)
            startActivity(intent)}
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed() // Handle back button click
        return true
    }

}