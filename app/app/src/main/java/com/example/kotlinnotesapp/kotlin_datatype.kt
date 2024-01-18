package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlin_datatype : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_datatype)

        val btnback=findViewById<Button>(R.id.back_datatype)
        btnback.setOnClickListener{
            val Intent= Intent(this,kotlin_variable::class.java)
            startActivity(Intent)
        }

        val btnhome=findViewById<Button>(R.id.home_datatype)
        btnhome.setOnClickListener{
            val Intent=Intent(this,kotlinIntro::class.java)
            startActivity(Intent)
        }

        val btnnext=findViewById<Button>(R.id.next_datatype)
        btnnext.setOnClickListener{
            val Intent=Intent(this,kotlin_operater::class.java)
            startActivity(Intent)
        }
    }
}