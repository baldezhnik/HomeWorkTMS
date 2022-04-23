package com.dsd.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

    }
    fun sortUsers(view: View) {
        listUsers.sortUsers()
        outList()
    }

    fun deleteMaloletok (view: View) {
        listUsers.deleteUsers()
        outList()
    }

    fun outList () {
        val textView14: TextView = findViewById(R.id.textView14)
        textView14.text = listUsers.outUsers()
    }

    fun generateInt (view: View) {
        val textView16: TextView = findViewById(R.id.textView16)
        val i = (5..155).random()
        textView16.text = if (i in 25..100 ) "число $i входит в диапазон (25;100)"
            else "число $i не входит в диапазон (25;100)"

    }

}