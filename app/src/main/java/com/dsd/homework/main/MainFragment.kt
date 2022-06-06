package com.dsd.homework.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dsd.homework.R
import com.dsd.homework.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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
        binding.btnHw18.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_HW18Fragment)
        }
        binding.btnHw19.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_HW19Fragment)
        }
        binding.btnHw22.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_HW22Fragment)
        }
        binding.btnHw23.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_HW23Fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}