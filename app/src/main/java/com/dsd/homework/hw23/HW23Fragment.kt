package com.dsd.homework.hw23

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dsd.homework.databinding.FragmentHw23Binding
import com.dsd.homework.hw23.adapter.PeopleAdapter

class HW23Fragment : Fragment() {

    private var userList: MutableList<UserWithImage> = mutableListOf()
    private var _binding: FragmentHw23Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw23Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvList.adapter = PeopleAdapter(getUsers())

    }

    fun getUsers() = mutableListOf<UserWithImage>(
        UserWithImage("Jhon", "Watson", 30, "https://klike.net/uploads/posts/2018-07/1531820435_2.jpg"),
        UserWithImage("Mike", "Brown", 30, "https://bipbap.ru/wp-content/uploads/2017/04/maxresdefault-1-9.jpg"),
        UserWithImage("Jack", "Warner", 30, "https://i.pinimg.com/originals/4b/ba/6f/4bba6f4d487a8029817f63ff9101911d.jpg"),
    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}