package com.example.kotlin101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_dice_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.roll_dice_value)
        resultText.text = randomInt.toString()
    }
}