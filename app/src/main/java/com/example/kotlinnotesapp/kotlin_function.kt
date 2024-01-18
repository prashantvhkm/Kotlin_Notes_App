package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_function : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_function)

        val btnback=findViewById<Button>(R.id.back_function)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_range::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_function)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_function)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_oop::class.java)
            startActivity(Intent)
        }
    }
}