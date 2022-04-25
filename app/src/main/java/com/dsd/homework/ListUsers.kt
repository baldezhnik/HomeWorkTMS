package com.dsd.homework

class ListUsers() {

    private var usersList: MutableList<User> = mutableListOf()

    fun addUser (Name: String, secondName: String, age:Int) =
        usersList.add(User(Name,secondName,age))

    fun outUsers(): String =
        usersList.toString()

    fun deleteUsers (){
        usersList.minusAssign(usersList.filter { it.age <18 })
    }

    fun sortUsers(){
        usersList.sortBy {it.name}
    }
}

