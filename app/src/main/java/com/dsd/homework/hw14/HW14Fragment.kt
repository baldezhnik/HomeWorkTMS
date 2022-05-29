package com.dsd.homework.hw14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.dsd.homework.HW14
import com.dsd.homework.ListUsers
import com.dsd.homework.databinding.FragmentHw14Binding
import com.dsd.homework.hw15.HW15Fragment
import java.util.*

class HW14Fragment : Fragment() {

    private var _binding: FragmentHw14Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw14Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // HW #1
        val listUsers = ListUsers()
        listUsers.addUser("Коля", "Рыжов", 19)
        listUsers.addUser("Петя", "Носов", 25)
        listUsers.addUser("Вася", "Пупкин", 80)
        binding.textView.text = listUsers.outUsers()

        // HW #2
        binding.button.setOnClickListener {
            binding.textView5.text = when ((1..7).random()) {
                1 -> "Да"
                2 -> "Нет"
                3 -> "Скорее всего да"
                4 -> "Скорее всего нет"
                5 -> "Возможно"
                6 -> "Имеются перспективы"
                else -> "Вопрос задан неверно"
            }
        }

        // HW #3
        var numZag = zapolnitZagadku()
        binding.button2.setOnClickListener {
            checkOtvet(numZag, binding.button2.text as String)
            numZag = zapolnitZagadku()
        }
        binding.button3.setOnClickListener {
            checkOtvet(numZag, binding.button3.text as String)
            numZag = zapolnitZagadku()
        }
        binding.button4.setOnClickListener {
            checkOtvet(numZag, binding.button4.text as String)
            numZag = zapolnitZagadku()
        }

        // HW #4
        binding.button5.setOnClickListener {
            val word = binding.editTextTextPersonName2.text.toString()
            val reg = Regex("[а-яё]+", RegexOption.IGNORE_CASE)
            if (reg.matches(word)) {
                val wordLow = word.lowercase(Locale.getDefault())
                var sum = 0
                wordLow.forEach { c: Char -> sum += c.code - 1071 }
                binding.textView10.text = "сумма $sum"
            } else binding.textView10.text = "неправильный ввод"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() = HW15Fragment()
    }

    private fun zapolnitZagadku(): Int {
        val hw14 = HW14()
        var buttonsList: MutableList<Button> = mutableListOf()
        buttonsList.add(binding.button2)
        buttonsList.add(binding.button3)
        buttonsList.add(binding.button4)
        buttonsList.shuffle()
        val i: Int = (0..2).random()
        binding.textView7.text = hw14.zagadkaList[i].getZagadka()
        buttonsList[0].text = hw14.zagadkaList[i].getOtvet()
        buttonsList[1].text = hw14.zagadkaList[i].getNePrav1()
        buttonsList[2].text = hw14.zagadkaList[i].getNePrav2()
        return i
    }

    private fun checkOtvet(numZag: Int, chStr: String) {
        val hw14 = HW14()
        binding.textView8.text = if (chStr == hw14.zagadkaList[numZag].getOtvet()) "Правильно"
        else "Неправильно"
    }
}