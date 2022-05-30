package com.dsd.homework.hw16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.dsd.homework.R
import com.dsd.homework.databinding.FragmentHw15Binding
import com.dsd.homework.databinding.FragmentHw16Binding

class HW16Fragment : Fragment() {

    private var _binding: FragmentHw16Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw16Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //#1
        binding.btnAct16Hw1.setOnClickListener {
            val a = (0..100).random()
            val b = (0..100).random()
            binding.tvAct16Hw1.text = when (a % 2) {
                0 -> {
                    "a = $a четное, b = $b, a*b = ${a * b}"
                }
                else -> {
                    "a = $a нечетное, b = $b, a+b = ${a + b}"
                }
            }
        }

        //#2
        binding.btnAct16Hw2.setOnClickListener {
            val a = (0..10).random()
            val b = (0..10).random()
            val c = (0..10).random()
            val s: (Int, Int, Int) -> Int = { a, b, c ->
                Integer.max((a * b * c), (a + b + c))
            }
            binding.tvAct16Hw2.text = "a=$a, b=$b, c=$c, max=${s(a, b, c)}"
        }

        //#3
        binding.btnAct16Hw3.setOnClickListener {
            val studentRating = ((0..100).random())
            val studentMark = when (studentRating) {
                in (0..19) -> 'F'
                in (20..39) -> 'E'
                in (40..59) -> 'D'
                in (60..74) -> 'C'
                in (75..89) -> 'B'
                in (90..100) -> 'A'
                else -> "Вне диапазона"
            }
            binding.tvAct16Hw3.text = "У студента с рейтингом $studentRating отметка $studentMark"
        }

        //#4
        binding.btnAct16Hw4.setOnClickListener {
            val a1 = (1..20).random()
            val b1 = (1..20).random()
            val a2 = (1..20).random()
            val b2 = (1..20).random()
            val str = when {
                ((a1 > a2) and (b1 > b2)) or ((a1 > b2) and (b1 > a2)) -> "В 1-ый можно поместить 2-ой."
                ((a1 < a2) and (b1 < b2)) or ((a1 < b2) and (b1 < a2)) -> "Во 2-ой можно поместить 1-ый."
                else -> "Нельзя вместить конверты"
            }
            binding.tvAct16Hw4.text = "1-ый конверт со сторнами ($a1;$b1). 2-ой ($a2;$b2). $str"
        }

        //#5
        binding.btnAct16Hw5.setOnClickListener {
            var amountEven = 0
            var sumEven = 0
            (1..99).forEach() {
                if (it % 2 == 0) {
                    sumEven += it
                    amountEven++
                }
            }
            binding.tvAct16Hw5.text =
                "В диапазоне [1; 99] количество четных чисел $amountEven с общей суммой $sumEven"
        }

        //#6
        binding.btnAct16Hw6.setOnClickListener {
            val fac = (1..20).random()
            binding.tvAct16Hw6.text = "факториал $fac! = ${factorial(fac)}"
        }

        //#7
        binding.btnAct16Hw7.setOnClickListener {
            val num = (1..100).random()
            binding.tvAct16Hw7.text = "число $num в двоичной системе ${Integer.toBinaryString(num)}"
        }

    }
    private fun factorial(n: Int): Long = if (n < 2) 1 else n * factorial(n - 1)

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
       @JvmStatic
        fun newInstance(param1: String, param2: String) = HW16Fragment()
    }
}