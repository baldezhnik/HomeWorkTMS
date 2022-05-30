package com.dsd.homework.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.dsd.homework.MainActivity
import com.dsd.homework.R
import com.dsd.homework.databinding.FragmentMainBinding
import com.dsd.homework.hw15.HW15Fragment

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnHw14.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_HW14Fragment)
        }
        binding.btnHw15.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_HW15Fragment)
        }
        binding.btnHw16.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_HW16Fragment)
        }
        binding.btnHw17.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_HW17Fragment)
        }
        binding.btnHw22.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_HW22Fragment)
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
}