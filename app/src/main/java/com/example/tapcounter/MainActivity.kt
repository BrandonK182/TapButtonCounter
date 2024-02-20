package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.countButton)
        val ultraButton = findViewById<Button>(R.id.ultraButton)
        val text = findViewById<TextView>(R.id.number)
        var counter = 0

        button.setOnClickListener {
            Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            text.text = counter.toString()
        }

        ultraButton.setOnClickListener {
            Toast.makeText(it.context, "Clicked PLUS ULTRA Button!", Toast.LENGTH_SHORT).show()
            counter += 2
            text.text = counter.toString()
        }
    }


}