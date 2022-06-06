package com.dsd.homework.hw17

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.SeekBar
import com.dsd.homework.R
import com.dsd.homework.databinding.FragmentHw17Binding

class HW17Fragment : Fragment() {

    private var _binding: FragmentHw17Binding? = null
    private val binding get() = _binding!!
    private var timer: CountDownTimer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw17Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var seek: Int = 3
        binding.tvAct17Hw1.text = binding.seekBar2.progress.toString()
        binding.seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, p1: Int, p2: Boolean) {
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    seek = binding.seekBar2.progress
                    binding.tvAct17Hw1.text = "$seek сек"
                }
            }
        })

        binding.btnAct17Hw1.setOnClickListener {
            binding.progressBar2.visibility = ProgressBar.VISIBLE
            binding.progressBar2.max = seek * 1000
            startCountDawnTimer((seek * 1000).toLong())
        }
    }

    private fun startCountDawnTimer(timeMillis: Long) {
        timer?.cancel()
        timer = object : CountDownTimer(timeMillis, 1) {
            override fun onTick(progress: Long) {
                val timeSec: Double = (progress).toDouble() / 1000
                binding.tvAct17Hw2.text = "Осталось ${String.format("%.2f", timeSec)} секунд"
                binding.progressBar2.progress = (timeMillis - progress).toInt()
            }

            override fun onFinish() {
                binding.tvAct17Hw2.text = "The End!"
                binding.progressBar2.visibility = ProgressBar.INVISIBLE
            }
        }.start()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        timer?.cancel()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) = HW17Fragment()
    }
}