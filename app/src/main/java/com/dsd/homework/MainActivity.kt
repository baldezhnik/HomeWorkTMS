package com.dsd.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityHW14()
    }

    private fun activityHW14() {
        val button: Button = findViewById(R.id.btn_hw14)
        button.setOnClickListener {
            val intent = Intent(this, HW14Activity::class.java)
            startActivity(intent)
        }
    }

    fun activityHW15(view: View) {
        val intent = Intent(this, HW15Activity::class.java)
        startActivity(intent)
    }

}