package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kolin_array : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kolin_array)

        val btnback=findViewById<Button>(R.id.back_array)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_continue::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_array)
        btnhome.setOnClickListener{
            val Intent= Intent(this,KotlinHome::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_array)
        btnnext.setOnClickListener{
            val Intent= Intent(this,kotlin_loop::class.java)
            startActivity(Intent)
        }


    }
}