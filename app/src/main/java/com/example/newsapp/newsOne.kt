package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class newsOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_one)
        val backBtnOne:ImageView=findViewById(R.id.BackBtnOne)
        backBtnOne.setOnClickListener {
            val i= Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}