package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_variable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_variable)

        val btnhome=findViewById<Button>(R.id.home_variable)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnback=findViewById<Button>(R.id.back_variable)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_comment::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_variable)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_datatype::class.java)
            startActivity(Intent)
        }
    }
}