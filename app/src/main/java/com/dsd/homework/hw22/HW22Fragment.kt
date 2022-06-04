package com.dsd.homework.hw22

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dsd.homework.R
import com.dsd.homework.databinding.FragmentHw22Binding
import com.dsd.homework.databinding.FragmentHw23Binding

class HW22Fragment : Fragment() {

    private var _binding: FragmentHw22Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHw22Binding.inflate(inflater, container, false)
        return binding.root
    }

}