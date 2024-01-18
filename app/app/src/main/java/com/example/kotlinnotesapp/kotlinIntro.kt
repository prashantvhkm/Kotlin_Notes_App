package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlinIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_intro)

        val btnhome=findViewById<Button>(R.id.home)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }
        val btnnext=findViewById<Button>(R.id.next)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_syntax::class.java)
            startActivity(Intent)
        }

        //end button action

        val btnhomeend=findViewById<Button>(R.id.homeend)
        btnhomeend.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }
        val btnnextend=findViewById<Button>(R.id.nextend)
        btnnextend.setOnClickListener{
            val Intent= Intent(this,kotlin_syntax::class.java)
            startActivity(Intent)
        }
    }
}