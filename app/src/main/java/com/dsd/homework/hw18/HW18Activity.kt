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
                delay(3000)
                addData()
                outData()
            }
        }
    }

    private fun addData() {
        regionList.forEach { it ->
            it.setVegetables(
                it.getPotato() + (0..100).random().toFloat() / 10,
                it.getCabbage() + (0..100).random().toFloat() / 10,
                it.getBeet() + (0..100).random().toFloat() / 10
            )
        }
    }

    private fun outData() {
        val tv_act18_vegetable: TextView = findViewById(R.id.tv_act18_vegetable)
        val tv_act18_victory: TextView = findViewById(R.id.tv_act18_victory)
        tv_act18_vegetable.text = regionList.toString()
        tv_act18_victory.text = regionList.filter { it.getVictory() }.map { it.getRegion() }.toString()
    }
}