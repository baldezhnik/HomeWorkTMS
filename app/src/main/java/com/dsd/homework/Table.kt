package com.dsd.homework

class Table(override val height: Int,
            override val color: String,
            override val material: String,
            override  val length: Int,
            val amountTableLeg: Int) : Furniture()