package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_when : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_when)

        val btnback=findViewById<Button>(R.id.back_when)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_ifelse::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_when)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_when)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_break::class.java)
            startActivity(Intent)
        }
    }
}