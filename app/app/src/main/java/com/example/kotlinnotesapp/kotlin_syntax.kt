package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_syntax : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_syntax)

        val btnhome=findViewById<Button>(R.id.home_syntax)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnback=findViewById<Button>(R.id.back_syntax)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlinIntro::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_syntax)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_output::class.java)
            startActivity(Intent)
        }


        //end action button
        val btnhomeend=findViewById<Button>(R.id.home_syntaxend)
        btnhomeend.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnbackend=findViewById<Button>(R.id.back_syntaxend)
        btnbackend.setOnClickListener{
            val Intent= Intent(this,kotlinIntro::class.java)
            startActivity(Intent)
        }

        val btnnextend=findViewById<Button>(R.id.next_syntaxend)
        btnnextend.setOnClickListener{
            val Intent= Intent(this,kotlin_output::class.java)
            startActivity(Intent)
        }
    }
}