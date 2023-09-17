package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class newsSeven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_seven)
        val backBtnSeven:ImageView=findViewById(R.id.BackBtnSeven)
        backBtnSeven.setOnClickListener {
            val i7=Intent(this,MainActivity::class.java)
            startActivity(i7)
        }
    }
}