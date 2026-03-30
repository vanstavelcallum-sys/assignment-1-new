package com.example.assignment_1_new

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et1 = findViewById<EditText>(R.id.et1)
        var b1 = findViewById<Button>(R.id.b1)
        var tv1 = findViewById<TextView>(R.id.tv1)
        var b2 = findViewById<Button>(R.id.b2)

        b1.setOnClickListener {
            var time = et1.text.toString().trim()
            var result = ""

            if (time.isEmpty()) {
                Toast.makeText(this, "Please enter a time", Toast.LENGTH_SHORT).show()
            } else if (time == "Morning") {
                result = "Goodmorning my beautiful fam"
            } else if (time == "Mid-morning") {
                result = "Thank you happy coworker"
            } else if (time == "Afternoon") {
                result = "What the dog doing"
            } else if (time == "Afternoon Snack Time") {
                result = "Thinking of you my sweetheart"
            } else if (time == "Dinner") {
                result = "Steak and potatoes"
            } else if (time == "After Dinner") {
                result = "Calling Joe Barber"
            } else if (time == "Night") {
                result = "Midnight snack"
            } else {
                Toast.makeText(this, "Invalid input: Time not recognized", Toast.LENGTH_SHORT).show()
            }

            tv1.text = result
        }

        b2.setOnClickListener {
            et1.setText("")
            tv1.text = ""
        }
    }
}