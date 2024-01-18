package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_loop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_loop)

        val btnback=findViewById<Button>(R.id.back_loop)
        btnback.setOnClickListener{
            val Intent= Intent(this,kolin_array::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_loop)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_loop)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_range::class.java)
            startActivity(Intent)
        }
    }
}