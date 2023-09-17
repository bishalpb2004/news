package com.example.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class newsTwo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_two)
        val btnBackTwo:ImageView=findViewById(R.id.BackBtnTwo)
        btnBackTwo.setOnClickListener {
            val i2= Intent(this,MainActivity::class.java)
            startActivity(i2)
        }
    }
}