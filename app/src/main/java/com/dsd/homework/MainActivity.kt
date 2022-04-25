package com.dsd.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun activityHW14(view: View) {
        val intent = Intent(this, HW14Activity::class.java)
        startActivity(intent)
    }

    fun activityHW15(view: View) {
        val intent = Intent(this, HW15Activity::class.java)
        startActivity(intent)
    }

}