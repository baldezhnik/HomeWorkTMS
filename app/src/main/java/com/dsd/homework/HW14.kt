package com.dsd.homework

import java.util.*

class HW14 {

    fun doHomeWork1() :String  {
        val listUsers = ListUsers()
        listUsers.addUser("Коля","Рыжов", 19)
        listUsers.addUser("Петя","Носов", 25)
        listUsers.addUser("Вася","Пупкин", 80)
        return listUsers.outUsers()
    }

    fun doHomeWork2() :String {
        return when ((1..7).random()){
            1 -> "Да"
            2 -> "Нет"
            3 -> "Скорее всего да"
            4 -> "Скорее всего нет"
            5 -> "Возможно"
            6 -> "Имеются перспективы"
            else -> "Вопрос задан неверно"
        }
    }

    inner class Zagadka (private val zagadka: String,
                         private val otvet: String,
                         private val nePrav1: String,
                         private val nePrav2: String){
        fun getZagadka () : String {return zagadka}
        fun getOtvet() : String {return otvet}
        fun getNePrav1() :String {return nePrav1}
        fun getNePrav2() : String {return nePrav2}
    }
    val zagadkaList: List<Zagadka> = listOf(Zagadka("Не лёд, а тает, не лодка, а уплывает.",
                                                     "Зарплата",
                                                     "Вода",
                                                    "Нос"),
        Zagadka("Что нужно делать, когда видишь зеленого человечка?",
            "Переходить дорогу",
            "Молиться",
            "Бежать"),
        Zagadka("Какой болезнью никто не болеет на суше?",
            "Морской",
            "Ветрянкой",
            "Оспой"),)

    fun doHomeWork4 (word : String) :String {
        val reg = Regex("[а-яё]+", RegexOption.IGNORE_CASE)
        if (!reg.matches(word)) return "неправильный ввод"
        val wordLow = word.lowercase(Locale.getDefault())
        var sum = 0
        wordLow.forEach { c: Char -> sum+= c.code -1071 }
        return "сумма $sum"
    }
}