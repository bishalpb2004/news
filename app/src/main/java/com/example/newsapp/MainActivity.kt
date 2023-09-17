package com.example.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val headOne:LinearLayout=findViewById(R.id.headingOne)
        headOne.setOnClickListener {
            val intentOne=Intent(this,newsOne::class.java)
            startActivity(intentOne)
        }
        val headTwo:LinearLayout=findViewById(R.id.headingTwo)
        headTwo.setOnClickListener {
            val intentTwo=Intent(this,newsTwo::class.java)
            startActivity(intentTwo)
        }
        val headThree:LinearLayout=findViewById(R.id.headingThree)
        headThree.setOnClickListener {
            val intentThree=Intent(this,newsThree::class.java)
            startActivity(intentThree)
        }
        val headFour:LinearLayout=findViewById(R.id.headingFour)
        headFour.setOnClickListener {
            val intentFour=Intent(this,newsFour::class.java)
            startActivity(intentFour)
        }
        val headFive:LinearLayout=findViewById(R.id.headingFive)
        headFive.setOnClickListener {
            val intentFive=Intent(this,newsFive::class.java)
            startActivity(intentFive)
        }
        val headSix:LinearLayout=findViewById(R.id.headingSix)
        headSix.setOnClickListener {
            val intentSix=Intent(this, newsSix::class.java)
            startActivity(intentSix)
        }
        val headSeven:LinearLayout=findViewById(R.id.headingSeven)
        headSeven.setOnClickListener {
            val intentSeven=Intent(this,newsSeven::class.java)
            startActivity(intentSeven)
        }
        val headEight:LinearLayout=findViewById(R.id.headingEight)
        headEight.setOnClickListener {
            val intentEight=Intent(this,newsEight::class.java)
            startActivity(intentEight)
        }
    }
}