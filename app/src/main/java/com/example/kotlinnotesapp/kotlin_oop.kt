package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_oop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_oop)

        val btnback=findViewById<Button>(R.id.back_oop)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_function::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_oop)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_oop)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_classas_object::class.java)
            startActivity(Intent)
        }
    }
}