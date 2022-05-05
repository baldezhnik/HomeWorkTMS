package com.dsd.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.TextView
import androidx.core.view.isVisible

class HW17Activity : AppCompatActivity() {

    private var timer: CountDownTimer? = null
    lateinit var tvAct17HW1: TextView
    lateinit var tvAct17HW2: TextView
    lateinit var btnAct17HW1: Button
    lateinit var pBar: ProgressBar
    lateinit var seekBar: SeekBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw17)

        initView()
        var seek: Int = 3
        tvAct17HW1.text = seekBar.progress.toString()
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, p1: Int, p2: Boolean) {
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    seek = seekBar.progress
                    tvAct17HW1.text = "$seek сек"
                }
            }
        })

        val btnAct17HW1: Button = findViewById(R.id.btn_act17_hw1)
        btnAct17HW1.setOnClickListener {
            pBar.visibility = ProgressBar.VISIBLE
            pBar.max = seek * 1000
            startCountDawnTimer((seek * 1000).toLong())
        }
    }

    private fun initView() {
        tvAct17HW1 = findViewById(R.id.tv_act17_hw1)
        tvAct17HW2 = findViewById(R.id.tv_act17_hw2)
        btnAct17HW1 = findViewById(R.id.btn_act17_hw1)
        pBar = findViewById(R.id.progressBar2)
        seekBar = findViewById(R.id.seekBar2)
    }

    private fun startCountDawnTimer(timeMillis: Long) {
        timer?.cancel()
        timer = object : CountDownTimer(timeMillis, 1) {
            override fun onTick(progress: Long) {
                val timeSec: Double = (progress).toDouble() / 1000
                tvAct17HW2.text = "Осталось ${String.format("%.2f", timeSec)} секунд"
                pBar.progress = (timeMillis - progress).toInt()
            }

            override fun onFinish() {
                tvAct17HW2.text = "The End!"
                pBar.visibility = ProgressBar.INVISIBLE
            }
        }.start()
    }
}