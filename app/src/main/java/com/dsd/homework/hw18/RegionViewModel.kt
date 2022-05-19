package com.dsd.homework.hw18

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dsd.homework.User

class RegionViewModel : ViewModel() {
    private val regions: MutableLiveData<List<Region>> by lazy {
        MutableLiveData<List<Region>>().also {loadRegions()}
    }

    fun getRegions(): LiveData<List<Region>>{
        return regions
    }

    private fun loadRegions() {

    }
}

