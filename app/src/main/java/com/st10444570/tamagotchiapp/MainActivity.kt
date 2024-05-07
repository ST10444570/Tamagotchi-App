package com.st10444570.tamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var StartBtn: Button
    private lateinit var EndBtn: Button

    var textView : TextView? = null
    var imageView : ImageView? = null

    override fun onCreate(savedInstanceState:  Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val StartBtn = findViewById<Button>(R.id.StartBtn)
        val EndBtn = findViewById<Button>(R.id.EndBtn)

        StartBtn.setOnClickListener {
            val intent = Intent(this, SecondScreen::class.java)
            startActivity(intent)
        }

        EndBtn.seOnClickListener {
            finish()
        }
    }
}