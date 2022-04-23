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

    fun newActiv(view: View) {
        val activ2 = Intent(this, HW14Activity::class.java)
        startActivity(activ2)
    }

}