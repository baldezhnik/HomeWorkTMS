package com.dsd.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class HW15Activity : AppCompatActivity() {

    private val listUsers = ListUsers()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw15)

        listUsers.addUser("Коля","Рыжов", 19)
        listUsers.addUser("Петя","Носов", 25)
        listUsers.addUser("Вася","Пупкин", 18)
        listUsers.addUser("Саша","Наливкин", 14)
        listUsers.addUser("Даша","Иванова", 20)
        listUsers.addUser("Маша","Сидорова", 17)
        outList()

        val textView20 : TextView = findViewById(R.id.textView20)
        textView20.text = "Cумма чисел от 1 до 100 равна ${(1..100).sum()}"

        val table = Table(90, "венге", "дерево", 90, 4)
        val cat = Cat("Протон", 4,"серый металик", 24, 60)
        val textView23 : TextView = findViewById(R.id.textView23)
        textView23.text = "Котик, с высотой прыжка ${cat.jumpHeight}см, ${cat.jump(table)} " +
                "на стол высотой ${table.height}см"

    }
    fun sortUsers(view: View) {
        listUsers.sortUsers()
        outList()
    }

    fun deleteMaloletok (view: View) {
        listUsers.deleteUsers()
        outList()
    }

    private fun outList () {
        val textView14: TextView = findViewById(R.id.textView14)
        textView14.text = listUsers.outUsers()
    }

    fun generateInt (view: View) {
        val textView16: TextView = findViewById(R.id.textView16)
        val i = (5..155).random()
        textView16.text = if (i in 25..100 ) "число $i входит в диапазон (25;100)"
            else "число $i не входит в диапазон (25;100)"
    }

    fun summaCifr (view: View) {
        val textView18: TextView = findViewById(R.id.textView18)
        val editTextNumber: EditText = findViewById(R.id.editTextNumber)
        val str = editTextNumber.text.toString()
        var sum = 0
        str.forEach { c: Char -> sum+=c.digitToInt() }
        textView18.text = "Сумма цифр в числе равна $sum"
    }

}