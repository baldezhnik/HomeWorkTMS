package com.dsd.homework

import android.nfc.Tag
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text

class HW14 {

    inner class User (val name: String, val secondName: String, var age:Int){
        override fun toString(): String {
            return "User(name='$name', secondName='$secondName', age=$age)"
        }
    }
    val user1 = User("петя", "petrov", 19)
    val TAG = "Output"
    var usersList: MutableList<User> = mutableListOf()

    private fun addUser (Name: String, secondName: String, age:Int) =
        usersList.add(User(Name,secondName,age))
    private fun outUsers(): String =
        usersList.toString()

    fun doHomeWork()  {
        addUser("Коля","Рыжов", 19)
        addUser("Петя","Носов", 25)
        addUser("Вася","Пупкин", 80)
        Log.e(TAG, outUsers())
    }


}