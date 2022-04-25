package com.dsd.homework

class Cat (val name:String,
           val weight:Int = 4, //масса в кг
           val color:String,
           val height:Int = 24, //высота в см
           val length:Int = 60) {   //длина в см
    val jumpHeight: Double = 1.666*length-25*weight+4.166*height //коэфиценты были выведены путем долгих испытаний котом Шредингера
                                                                 //ни один кот не пострадал =) формула указывает высоту в см
                                                                 // формула исходит из прыжка в высоту 1м без разбега средней кошки
    fun jump (furniture: Furniture) : String {
        return if(jumpHeight>furniture.height) "запрыгнул" else "не запрыгнул"
    }
}