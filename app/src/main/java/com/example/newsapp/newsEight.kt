package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class newsEight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_eight)
        val backBtnEight:ImageView=findViewById(R.id.BackBtnEight)
        backBtnEight.setOnClickListener {
            val i8=Intent(this,MainActivity::class.java)
            startActivity(i8)
        }
    }
}