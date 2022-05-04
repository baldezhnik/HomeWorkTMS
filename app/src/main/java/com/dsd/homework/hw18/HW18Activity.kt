package com.dsd.homework.hw18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.dsd.homework.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HW18Activity : AppCompatActivity() {

    var regionList: MutableList<Vegetables> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw18)

        for (region in Region.values()) {
            regionList.add(Vegetables(region))
        }
        outData()

        val btn: Button = findViewById(R.id.btn_act18)
        btn.setOnClickListener {
            GlobalScope.launch {
                //delay(5000)
                addData()
                outData()
            }
        }
    }

    fun addData() {
        regionList.forEach { it ->
            it.setVegetables(
                it.getPotato() + (0..100).random().toFloat() / 100,
                it.getCabbage() + (0..100).random().toFloat() / 100,
                it.getBeet() + (0..100).random().toFloat() / 100
            )
        }
    }

    fun outData() {
        val txt: TextView = findViewById(R.id.tv_act18)
        txt.text=regionList.toString()
    }

    override fun toString(): String {
        return "HW18Activity(regionList=$regionList)"
    }

}