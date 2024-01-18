package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_break : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_break)

        val btnback=findViewById<Button>(R.id.back_break)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_when::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_break)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_break)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_continue::class.java)
            startActivity(Intent)
        }
    }
}