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

    private var timer: CountDownTimer?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw17)
        val tvAct17HW1: TextView = findViewById(R.id.tv_act17_hw1)
        val pBar :ProgressBar = findViewById(R.id.progressBar2)
        var seek: Int = 0
        val seekBar: SeekBar = findViewById(R.id.seekBar2)
        tvAct17HW1.text = seekBar.progress.toString()
        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
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

        val btnAct17HW1 : Button = findViewById(R.id.btn_act17_hw1)
        btnAct17HW1.setOnClickListener {
            pBar.visibility = ProgressBar.VISIBLE
            pBar.max = seek*1000
            startCountDawnTimer((seek*1000).toLong())
        }
    }

    private fun startCountDawnTimer(timeMillis: Long){
        val tvAct17HW2: TextView = findViewById(R.id.tv_act17_hw2)
        val pBar :ProgressBar = findViewById(R.id.progressBar2)

        timer?.cancel()
        timer = object : CountDownTimer(timeMillis, 1) {
            override fun onTick(p0: Long) {
                val timeSec :Double = (p0).toDouble()/1000
                tvAct17HW2.text = "Осталось ${String.format("%.2f", timeSec)} секунд"
                pBar.progress = (timeMillis - p0).toInt()
            }

            override fun onFinish() {
                tvAct17HW2.text = "The End!"
                pBar.visibility = ProgressBar.INVISIBLE
            }
        }.start()
    }
}