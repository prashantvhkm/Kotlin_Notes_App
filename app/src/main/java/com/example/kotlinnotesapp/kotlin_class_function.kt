package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_class_function : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_class_function)

        val btnback=findViewById<Button>(R.id.back_class_function)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_contsructor::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_class_function)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_class_function)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_inheritance::class.java)
            startActivity(Intent)
        }
    }
}