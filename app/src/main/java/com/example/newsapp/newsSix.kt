package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class newsSix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_six)
        val backBtnSix:ImageView=findViewById(R.id.BackBtnSix)
        backBtnSix.setOnClickListener {
            val i6=Intent(this,MainActivity::class.java)
            startActivity(i6)
        }
    }
}