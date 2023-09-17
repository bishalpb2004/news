package com.example.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class newsFive : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_five)
        val backBtnFive:ImageView=findViewById(R.id.BackBtnFive)
        backBtnFive.setOnClickListener {
            val i5=Intent(this,MainActivity::class.java)
            startActivity(i5)
        }
    }
}