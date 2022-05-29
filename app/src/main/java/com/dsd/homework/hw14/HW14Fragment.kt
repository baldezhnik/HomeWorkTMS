package com.dsd.homework.hw14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.dsd.homework.ListUsers
import com.dsd.homework.R
import com.dsd.homework.databinding.FragmentHw14Binding
import com.dsd.homework.databinding.FragmentMainBinding
import com.dsd.homework.hw15.HW15Fragment


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
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() = HW15Fragment()
    }
}