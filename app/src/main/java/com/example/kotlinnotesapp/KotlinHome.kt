package com.example.kotlinnotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KotlinHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_home)


        //user button action
        val btnIntro=findViewById<Button>(R.id.Intro)
        btnIntro.setOnClickListener{
            val Intent=Intent(this,kotlinIntro::class.java)
            startActivity(Intent)
        }

        val btnsyntax=findViewById<Button>(R.id.syntax)
        btnsyntax.setOnClickListener{
            val Intent=Intent(this,kotlin_syntax::class.java)
            startActivity(Intent)
        }
        val btnoutput=findViewById<Button>(R.id.output)
        btnoutput.setOnClickListener{
            val Intent=Intent(this,kotlin_output::class.java)
            startActivity(Intent)
        }

        val btncomment=findViewById<Button>(R.id.comment)
        btncomment.setOnClickListener{
            val Intent=Intent(this,kotlin_comment::class.java)
            startActivity(Intent)
        }

        val btnvariable=findViewById<Button>(R.id.variable)
        btnvariable.setOnClickListener{
            val Intent=Intent(this,kotlin_variable::class.java)
            startActivity(Intent)
        }

        val btndatatype=findViewById<Button>(R.id.datatype)
        btndatatype.setOnClickListener{
            val Intent=Intent(this,kotlin_datatype::class.java)
            startActivity(Intent)
        }

        val btnoperater=findViewById<Button>(R.id.operator)
        btnoperater.setOnClickListener{
            val Intent=Intent(this,kotlin_operater::class.java)
            startActivity(Intent)
        }

        val btnstring=findViewById<Button>(R.id.string)
        btnstring.setOnClickListener{
            val Intent=Intent(this,kotlin_string::class.java)
            startActivity(Intent)
        }

        val btnboolean=findViewById<Button>(R.id.booleann)
        btnboolean.setOnClickListener{
            val Intent=Intent(this,kotlin_boolean::class.java)
            startActivity(Intent)
        }

        val btnifelse=findViewById<Button>(R.id.ifelse)
        btnifelse.setOnClickListener{
            val Intent=Intent(this,kotlin_ifelse::class.java)
            startActivity(Intent)
        }

        val btnwhen=findViewById<Button>(R.id.`when`)
        btnwhen.setOnClickListener{
            val Intent=Intent(this,kotlin_when::class.java)
            startActivity(Intent)
        }

        val btnwhileloop=findViewById<Button>(R.id.whileloop)
        btnwhileloop.setOnClickListener{
            val Intent=Intent(this,kotlin_when::class.java)
            startActivity(Intent)
        }







        val btnbreak=findViewById<Button>(R.id.breakk)
        btnbreak.setOnClickListener{
            val Intent=Intent(this,kotlin_break::class.java)
            startActivity(Intent)
        }

        val btncontinue=findViewById<Button>(R.id.continuee)
        btncontinue.setOnClickListener{
            val Intent=Intent(this,kotlin_continue::class.java)
            startActivity(Intent)
        }
        val btnarray=findViewById<Button>(R.id.array)
        btnarray.setOnClickListener{
            val Intent=Intent(this,kolin_array::class.java)
            startActivity(Intent)
        }

        val btnforloop=findViewById<Button>(R.id.forloop)
        btnforloop.setOnClickListener{
            val Intent=Intent(this,kotlin_loop::class.java)
            startActivity(Intent)
        }

        val btnrange=findViewById<Button>(R.id.range)
        btnrange.setOnClickListener{
            val Intent=Intent(this,kotlin_range::class.java)
            startActivity(Intent)
        }

        val btnfunction=findViewById<Button>(R.id.function)
        btnfunction.setOnClickListener{
            val Intent=Intent(this,kotlin_function::class.java)
            startActivity(Intent)
        }

        val btnoop=findViewById<Button>(R.id.oop)
        btnoop.setOnClickListener{
            val Intent=Intent(this,kotlin_oop::class.java)
            startActivity(Intent)
        }

        val btnclassas=findViewById<Button>(R.id.classas_object)
        btnclassas.setOnClickListener{
            val Intent=Intent(this,kotlin_classas_object::class.java)
            startActivity(Intent)
        }

        val btncontstructor=findViewById<Button>(R.id.contstructor)
        btncontstructor.setOnClickListener{
            val Intent=Intent(this,kotlin_contsructor::class.java)
            startActivity(Intent)
        }

        val btnclassfunction=findViewById<Button>(R.id.classfunction)
        btnclassfunction.setOnClickListener{
            val Intent=Intent(this,kotlin_class_function::class.java)
            startActivity(Intent)
        }

        val btninhertance=findViewById<Button>(R.id.inheritance)
        btninhertance.setOnClickListener{
            val Intent=Intent(this,kotlin_inheritance::class.java)
            startActivity(Intent)
        }




    }
}