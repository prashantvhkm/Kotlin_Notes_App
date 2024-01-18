package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_operater : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_operater)


        val btnback=findViewById<Button>(R.id.back_operater)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_datatype::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_operater)
        btnhome.setOnClickListener{
            val Intent=Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_operater)
        btnnext.setOnClickListener{
            val Intent=Intent(this,kotlin_string::class.java)
            startActivity(Intent)
        }


    }
}