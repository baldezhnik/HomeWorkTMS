package com.dsd.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HW16Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw16)

        //#1
        val btnAct16HW1: Button = findViewById(R.id.btn_act16_hw1)
        val txtvAct16HW1: TextView = findViewById(R.id.txtv_act16_hw1)
        btnAct16HW1.setOnClickListener {
            val a = (0..100).random()
            val b = (0..100).random()
            txtvAct16HW1.text = when (a % 2) {
                0 -> {
                    "a = $a четное, b = $b, a*b = ${a * b}"
                }
                else -> {
                    "a = $a нечетное, b = $b, a+b = ${a + b}"
                }
            }
        }

        //#2


        //#3
        val rating = (0..105).random()
        val otmetka = when (rating) {
            in (0..19) -> 'F'
            in (20..39) ->'E'
            in (40..59) ->'D'
            in (60..74) ->'C'
            in (75..89) ->'B'
            in (90..100) ->'A'
            else -> "Вне диапазона"
        }
        val t = otmetka

        //#4


        //#5
        var amountEven = 0
        var sumEven = 0
        (1..99).forEach() {
            if (it % 2 == 0) {
                sumEven += it
                amountEven++
            }
        }

        //#6
        val fac = (1..100).random()
        val out = factorial(fac)

        //#7
// добавить эдит , кнопку, текствью
        val str: String = "4502"
        val str2 = "число $str в двоичной системе ${Integer.toBinaryString(str.toInt())}"
    }

    fun factorial(n: Int): Long = if (n < 2) 1 else n * factorial(n - 1)
}



