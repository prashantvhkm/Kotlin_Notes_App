package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_output : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_output)

        val btnback=findViewById<Button>(R.id.back_output)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_syntax::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_output)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_output)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_comment::class.java)
            startActivity(Intent)
        }

    }

}