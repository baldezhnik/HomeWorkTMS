package com.dsd.homework.hw18

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dsd.homework.R

class HW18Fragment : Fragment() {

    companion object {
        fun newInstance() = HW18Fragment()
    }

    private lateinit var viewModel: HW18ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hw18, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HW18ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}