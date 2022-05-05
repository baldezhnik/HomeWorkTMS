package com.dsd.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Integer.max

class HW16Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw16)

        //#1
        val btnAct16HW1: Button = findViewById(R.id.btn_act16_hw1)
        val tvAct16HW1: TextView = findViewById(R.id.tv_act16_hw1)
        btnAct16HW1.setOnClickListener {
            val a = (0..100).random()
            val b = (0..100).random()
            tvAct16HW1.text = when (a % 2) {
                0 -> {
                    "a = $a четное, b = $b, a*b = ${a * b}"
                }
                else -> {
                    "a = $a нечетное, b = $b, a+b = ${a + b}"
                }
            }
        }

        //#2
        val btnAct16HW2: Button = findViewById(R.id.btn_act16_hw2)
        val tvAct16HW2: TextView = findViewById(R.id.tv_act16_hw2)
        btnAct16HW2.setOnClickListener {
            val a = (0..10).random()
            val b = (0..10).random()
            val c = (0..10).random()
            val s: (Int, Int, Int) -> Int = { a, b, c ->
                max((a * b * c), (a + b + c))
            }
            tvAct16HW2.text = "a=$a, b=$b, c=$c, max=${s(a, b, c)}"
        }

        //#3
        val btnAct16HW3: Button = findViewById(R.id.btn_act16_hw3)
        val tvAct16HW3: TextView = findViewById(R.id.tv_act16_hw3)
        btnAct16HW3.setOnClickListener {
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
            tvAct16HW3.text = "У студента с рейтингом $studentRating отметка $studentMark"
        }

        //#4
        val btnAct16HW4: Button = findViewById(R.id.btn_act16_hw4)
        val tvAct16HW4: TextView = findViewById(R.id.tv_act16_hw4)
        btnAct16HW4.setOnClickListener {
            val a1 = (1..20).random()
            val b1 = (1..20).random()
            val a2 = (1..20).random()
            val b2 = (1..20).random()
            val str = when {
                ((a1 > a2) and (b1 > b2)) or ((a1 > b2) and (b1 > a2)) -> "В 1-ый можно поместить 2-ой."
                ((a1 < a2) and (b1 < b2)) or ((a1 < b2) and (b1 < a2)) -> "Во 2-ой можно поместить 1-ый."
                else -> "Нельзя вместить конверты"
            }
            tvAct16HW4.text = "1-ый конверт со сторнами ($a1;$b1). 2-ой ($a2;$b2). $str"
        }

        //#5
        val btnAct16HW5: Button = findViewById(R.id.btn_act16_hw5)
        val tvAct16HW5: TextView = findViewById(R.id.tv_act16_hw5)
        btnAct16HW5.setOnClickListener {
            var amountEven = 0
            var sumEven = 0
            (1..99).forEach() {
                if (it % 2 == 0) {
                    sumEven += it
                    amountEven++
                }
            }
            tvAct16HW5.text =
                "В диапазоне [1; 99] количество четных чисел $amountEven с общей суммой $sumEven"
        }

        //#6
        val btnAct16HW6: Button = findViewById(R.id.btn_act16_hw6)
        val tvAct16HW6: TextView = findViewById(R.id.tv_act16_hw6)
        btnAct16HW6.setOnClickListener {
            val fac = (1..20).random()
            tvAct16HW6.text = "факториал $fac! = ${factorial(fac)}"
        }

        //#7
        val btnAct16HW7: Button = findViewById(R.id.btn_act16_hw7)
        val tvAct16HW7: TextView = findViewById(R.id.tv_act16_hw7)
        btnAct16HW7.setOnClickListener {
            val num = (1..100).random()
            tvAct16HW7.text = "число $num в двоичной системе ${Integer.toBinaryString(num)}"
        }
    }

    private fun factorial(n: Int): Long = if (n < 2) 1 else n * factorial(n - 1)
}