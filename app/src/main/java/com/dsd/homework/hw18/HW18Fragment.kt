package com.dsd.homework.hw18

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.dsd.homework.R
import com.dsd.homework.databinding.FragmentHw17Binding
import com.dsd.homework.databinding.FragmentHw18Binding

class HW18Fragment : Fragment() {

    private var _binding: FragmentHw18Binding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = HW18Fragment()
    }

    private lateinit var viewModel: HW18ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw18Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(HW18ViewModel::class.java)

        viewModel.createVegetables()
        binding.tvAct18Vegetable.text = viewModel.regionsLiveData.toString()
        binding.btnAct18.setOnClickListener {
            viewModel.loadVegetables()
        }
        viewModel.winnerLiveData.observe(viewLifecycleOwner) {
            binding.tvAct18Victory.text = it
        }
        viewModel.regionsLiveData.observe(viewLifecycleOwner) {
            binding.tvAct18Vegetable.text = it.toString()
        }
    }
}