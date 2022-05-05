package com.dsd.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.dsd.homework.hw18.HW18Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityHW14()
        activityHW15()
        activityHW16()
        activityHW17()
        activityHW18()
    }

    private fun activityHW14() {
        val button: Button = findViewById(R.id.btn_hw14)
        button.setOnClickListener {
            val intent = Intent(this, HW14Activity::class.java)
            startActivity(intent)
        }
    }

    private fun activityHW15() {
        val button: Button = findViewById(R.id.btn_hw15)
        button.setOnClickListener {
            val intent = Intent(this, HW15Activity::class.java)
            startActivity(intent)
        }
    }

    private fun activityHW16() {
        val button: Button = findViewById(R.id.btn_hw16)
        button.setOnClickListener {
            val intent = Intent(this, HW16Activity::class.java)
            startActivity(intent)
        }
    }

    private fun activityHW17() {
       val button: Button = findViewById(R.id.btn_hw17)
       button.setOnClickListener {
           val intent = Intent(this, HW17Activity::class.java)
           startActivity(intent)
        }
    }
    
    private fun activityHW18() {
        val button: Button = findViewById(R.id.btn_hw18)
        button.setOnClickListener {
            val intent = Intent(this, HW18Activity::class.java)
            startActivity(intent)
        }
    }

}