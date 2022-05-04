package com.dsd.homework.hw18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        GlobalScope.launch {
            delay(2000)
            addData()
        }
    }

    fun addData(){
        regionList.forEach { it ->
            it.setVegetables( it.getPotato()+(0..100).random()/100,
                it.getCabbage()+(0..100).random()/100,
                it.getBeet()+(0..100).random()/100)
        }
    }

}