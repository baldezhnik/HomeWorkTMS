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
        val activity = Intent(this, HW14Activity::class.java)
        startActivity(activity)
    }
    fun activityHW15 (view: View) {
        val activity = Intent(this, HW15Activity::class.java)
        startActivity(activity)
    }


}