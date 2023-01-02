package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener{
            Log.v("Helloworld","button clicked")
            Toast.makeText(this,"Hello to you too!",Toast.LENGTH_SHORT).show()
        }
        val button2 = findViewById<Button>(R.id.woofButton)
        button2.setOnClickListener{
            Log.v("Woof","Woof button clicked")
            Toast.makeText(this,"I woof you!",Toast.LENGTH_LONG).show()
        }
    }
}