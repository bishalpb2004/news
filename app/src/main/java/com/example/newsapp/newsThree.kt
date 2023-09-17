package com.example.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class newsThree : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_three)
        val btnBackThree:ImageView=findViewById(R.id.BackBtnThree)
        btnBackThree.setOnClickListener {
            val i3=Intent(this,MainActivity::class.java)
            startActivity(i3)
        }
    }
}