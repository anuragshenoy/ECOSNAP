package com.example.ecosnap

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toolbar: Toolbar = findViewById(R.id.toolbar)
       setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Enable Up button
        supportActionBar?.setDisplayShowHomeEnabled(true) // Show back button
    val btn1=findViewById<Button>(R.id.crowdfunding)
    val btn2=findViewById<Button>(R.id.action_list)
        btn1.setOnClickListener(){intent = Intent(this, Cf::class.java)
        startActivity(intent)}
        btn2.setOnClickListener { intent=Intent(this,Al::class.java)
        startActivity(intent)}

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed() // Handle back button click
        return true
    }

}