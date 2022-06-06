package com.dsd.homework.hw18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.dsd.homework.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HW18Activity : AppCompatActivity() {

    val viewModel: RegionViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw18)

        val tv_act18_vegetable: TextView = findViewById(R.id.tv_act18_vegetable)
        val tv_act18_victory: TextView = findViewById(R.id.tv_act18_victory)

        viewModel.createVegetables()
        tv_act18_vegetable.text = viewModel.regionsLiveData.toString()
        val btn: Button = findViewById(R.id.btn_act18)
        btn.setOnClickListener {
           viewModel.loadVegetables()
        }

        viewModel.winnerLiveData.observe(this) {
            tv_act18_victory.text = it
        }
        viewModel.regionsLiveData.observe(this) {
            tv_act18_vegetable.text = it.toString()
        }
    }

}