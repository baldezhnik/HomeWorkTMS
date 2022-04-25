package com.dsd.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class HW14Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw14)

        // HW #1
        val textView: TextView = findViewById(R.id.textView)
        val listUsers = ListUsers()
        listUsers.addUser("Коля", "Рыжов", 19)
        listUsers.addUser("Петя", "Носов", 25)
        listUsers.addUser("Вася", "Пупкин", 80)
        textView.text = listUsers.outUsers()

        // HW #2
        val button: Button = findViewById(R.id.button)
        val textView5: TextView = findViewById(R.id.textView5)
        button.setOnClickListener {
            textView5.text = when ((1..7).random()) {
                1 -> "Да"
                2 -> "Нет"
                3 -> "Скорее всего да"
                4 -> "Скорее всего нет"
                5 -> "Возможно"
                6 -> "Имеются перспективы"
                else -> "Вопрос задан неверно"
            }
        }

        // HW #3
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        var numZag = zapolnitZagadku()
        button2.setOnClickListener {
            checkOtvet(numZag, button2.text as String)
            numZag = zapolnitZagadku()
        }
        button3.setOnClickListener {
            checkOtvet(numZag, button3.text as String)
            numZag = zapolnitZagadku()
        }
        button4.setOnClickListener {
            checkOtvet(numZag, button4.text as String)
            numZag = zapolnitZagadku()
        }

        // HW #4
        val button5: Button = findViewById(R.id.button5)
        val editTextTextPersonName2: EditText = findViewById(R.id.editTextTextPersonName2)
        val textView10: TextView = findViewById(R.id.textView10)
        button5.setOnClickListener {
            val word = editTextTextPersonName2.text.toString()
            val reg = Regex("[а-яё]+", RegexOption.IGNORE_CASE)
            if (reg.matches(word)) {
                val wordLow = word.lowercase(Locale.getDefault())
                var sum = 0
                wordLow.forEach { c: Char -> sum += c.code - 1071 }
                textView10.text = "сумма $sum"
            } else textView10.text = "неправильный ввод"
        }

    }

    private fun zapolnitZagadku(): Int {
        val hw14 = HW14()
        val textView7: TextView = findViewById(R.id.textView7)
        var buttonsList: MutableList<Button> = mutableListOf()
        buttonsList.add(findViewById(R.id.button2))
        buttonsList.add(findViewById(R.id.button3))
        buttonsList.add(findViewById(R.id.button4))
        buttonsList.shuffle()
        val i: Int = (0..2).random()
        textView7.text = hw14.zagadkaList[i].getZagadka()
        buttonsList[0].text = hw14.zagadkaList[i].getOtvet()
        buttonsList[1].text = hw14.zagadkaList[i].getNePrav1()
        buttonsList[2].text = hw14.zagadkaList[i].getNePrav2()
        return i
    }

    private fun checkOtvet(numZag: Int, chStr: String) {
        val textView8: TextView = findViewById(R.id.textView8)
        val hw14 = HW14()
        if (chStr == hw14.zagadkaList[numZag].getOtvet()) textView8.text = "Правильно"
        else textView8.text = "Неправильно"
    }

}