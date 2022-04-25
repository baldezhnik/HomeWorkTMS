package com.dsd.homework

import java.util.*

class HW14 {

    inner class Zagadka(
        private val zagadka: String,
        private val otvet: String,
        private val nePrav1: String,
        private val nePrav2: String
    ) {
        fun getZagadka(): String {
            return zagadka
        }

        fun getOtvet(): String {
            return otvet
        }

        fun getNePrav1(): String {
            return nePrav1
        }

        fun getNePrav2(): String {
            return nePrav2
        }
    }

    val zagadkaList: List<Zagadka> = listOf(
        Zagadka(
            "Не лёд, а тает, не лодка, а уплывает.",
            "Зарплата",
            "Вода",
            "Нос"
        ),
        Zagadka(
            "Что нужно делать, когда видишь зеленого человечка?",
            "Переходить дорогу",
            "Молиться",
            "Бежать"
        ),
        Zagadka(
            "Какой болезнью никто не болеет на суше?",
            "Морской",
            "Ветрянкой",
            "Оспой"
        ),
    )

}