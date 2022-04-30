package com.example.cookieclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private var currentScore = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgCookie : ImageView = findViewById(R.id.imgCookie)
        val lblTotal : TextView = findViewById(R.id.lblTotal)
        val etName : EditText = findViewById(R.id.etName)
        val btnScore : Button = findViewById(R.id.btnScore)
        lblTotal.text = currentScore.toString()

        imgCookie.setOnClickListener {
            currentScore++
            lblTotal.text = "$currentScore"
        }

        btnScore.setOnClickListener {
            Toast.makeText(this, "Hello ${etName.text}, Score: ${lblTotal.text}", Toast.LENGTH_SHORT).show()
        }
    }
}