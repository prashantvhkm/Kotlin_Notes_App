package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_classas_object : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_classas_object)

        val btnback=findViewById<Button>(R.id.back_classas_object)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_oop::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_classas_object)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_classas_object)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_contsructor::class.java)
            startActivity(Intent)
        }
    }
}