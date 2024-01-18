package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_string : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_string)

        val btnhome=findViewById<Button>(R.id.home_string)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnback=findViewById<Button>(R.id.back_string)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_operater::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_string)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_boolean::class.java)
            startActivity(Intent)
        }
    }
}