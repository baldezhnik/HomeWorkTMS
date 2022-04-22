package com.dsd.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hw14 = HW14()
        val textView: TextView = findViewById(R.id.textView)
        textView.text = hw14.doHomeWork1()

        val button: Button = findViewById(R.id.button)
        val textView5: TextView = findViewById(R.id.textView5)
        button.setOnClickListener { textView5.text = hw14.doHomeWork2() }

    }
}