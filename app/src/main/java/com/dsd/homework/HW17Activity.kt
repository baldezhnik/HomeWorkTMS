package com.dsd.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.TextView

class HW17Activity : AppCompatActivity() {

    private var timer: CountDownTimer?= null
    val pBar :ProgressBar = findViewById(R.id.progressBar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw17)

        val tvAct17HW1: TextView = findViewById(R.id.tv_act17_hw1)
        val tvAct17HW2: TextView = findViewById(R.id.tv_act17_hw2)
        var seek: Int = 0


        val seekBar: SeekBar = findViewById(R.id.seekBar2)
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
            startCountDawnTimer((seek*1000).toLong())
        }



    }

    private fun startCountDawnTimer(timeMillis: Long){

        val tvAct17HW2: TextView = findViewById(R.id.tv_act17_hw2)

        timer?.cancel()
        timer = object : CountDownTimer(timeMillis, 1) {
            override fun onTick(p0: Long) {
                val timeSec :Double = (p0).toDouble()/1000
                tvAct17HW2.text = "Осталось ${String.format("%.2f", timeSec)} секунд"
            }

            override fun onFinish() {
                tvAct17HW2.text = "The End!"

            }
        }.start()
    }
}