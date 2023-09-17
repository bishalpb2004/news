package com.example.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class newsFour : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_four)
        val backBtnFour:ImageView=findViewById(R.id.BackBtnFour)
        backBtnFour.setOnClickListener {
            val i4=Intent(this,MainActivity::class.java)
            startActivity(i4)
        }
    }
}