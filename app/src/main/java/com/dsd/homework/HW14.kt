package com.dsd.homework

class HW14 {

    inner class User (private val name: String, private val secondName: String, private var age:Int){
        override fun toString(): String {
            return "User(name='$name', secondName='$secondName', age=$age)"
        }
    }
    private var usersList: MutableList<User> = mutableListOf()
    private fun addUser (Name: String, secondName: String, age:Int) =
        usersList.add(User(Name,secondName,age))
    private fun outUsers(): String =
        usersList.toString()

    fun doHomeWork1() :String  {
        addUser("Коля","Рыжов", 19)
        addUser("Петя","Носов", 25)
        addUser("Вася","Пупкин", 80)
        return outUsers()
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

}