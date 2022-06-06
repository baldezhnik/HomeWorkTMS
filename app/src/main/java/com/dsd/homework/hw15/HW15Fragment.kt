package com.dsd.homework.hw15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.dsd.homework.Cat
import com.dsd.homework.ListUsers
import com.dsd.homework.R
import com.dsd.homework.Table
import com.dsd.homework.databinding.FragmentHw14Binding
import com.dsd.homework.databinding.FragmentHw15Binding

class HW15Fragment : Fragment() {

    private var _binding: FragmentHw15Binding? = null
    private val binding get() = _binding!!
    private val listUsers = ListUsers()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw15Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listUsers.addUser("Коля","Рыжов", 19)
        listUsers.addUser("Петя","Носов", 25)
        listUsers.addUser("Вася","Пупкин", 18)
        listUsers.addUser("Саша","Наливкин", 14)
        listUsers.addUser("Даша","Иванова", 20)
        listUsers.addUser("Маша","Сидорова", 17)
        outList()

        binding.button8.setOnClickListener { sortUsers() }
        binding.button9.setOnClickListener { deleteMaloletok() }
        binding.button10.setOnClickListener { generateInt() }
        binding.button11.setOnClickListener { summaCifr() }

        binding.textView20.text = "Cумма чисел от 1 до 100 равна ${(1..100).sum()}"

        val table = Table(90, "венге", "дерево", 90, 4)
        val cat = Cat("Протон", 4,"серый металик", 24, 60)
        binding.textView23.text = "Котик, с высотой прыжка ${cat.jumpHeight}см, ${cat.jump(table)} " +
                "на стол высотой ${table.height}см"
    }

    fun sortUsers() {
        listUsers.sortUsers()
        outList()
    }

    fun deleteMaloletok () {
        listUsers.deleteUsers()
        outList()
    }

    private fun outList () {
        binding.textView14.text = listUsers.outUsers()
    }

    fun generateInt () {
        val i = (5..155).random()
        binding.textView16.text = if (i in 25..100 ) "число $i входит в диапазон (25;100)"
        else "число $i не входит в диапазон (25;100)"
    }

    fun summaCifr () {
        val str = binding.editTextNumber.text.toString()
        var sum = 0
        str.forEach { c: Char -> sum+=c.digitToInt() }
        binding.textView18.text = "Сумма цифр в числе равна $sum"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) = HW15Fragment()
    }
}