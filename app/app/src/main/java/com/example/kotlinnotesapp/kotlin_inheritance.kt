package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_inheritance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_inheritance)

        val btnback=findViewById<Button>(R.id.back_inheritance)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_class_function::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_inheritance)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }


    }
}