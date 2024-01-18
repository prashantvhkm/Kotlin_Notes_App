package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_comment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_comment)

        val btnback=findViewById<Button>(R.id.back_comment)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_output::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_comment)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_comment)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_variable::class.java)
            startActivity(Intent)
        }


    }
}