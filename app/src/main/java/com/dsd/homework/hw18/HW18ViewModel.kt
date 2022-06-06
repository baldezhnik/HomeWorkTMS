package com.dsd.homework.hw18

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HW18ViewModel : ViewModel() {
    val regionsLiveData = MutableLiveData<List<Vegetables>>()
    private var regionList: MutableList<Vegetables> = mutableListOf()
    var winnerLiveData = MutableLiveData<String>()

    fun createVegetables(){
        if (regionList.count() == 0) for (region in Region.values()) {
            regionList.add(Vegetables(region))
        }
        regionsLiveData.value = regionList
    }

    fun loadVegetables() {
        GlobalScope.launch {
            delay(3000)
            addData()
            outData()
            regionsLiveData.postValue(regionList)
        }
    }

    private fun addData() {
        regionList.forEach { it ->
            it.setVegetables(
                it.getPotato() + (0..100).random().toFloat() / 10,
                it.getCabbage() + (0..100).random().toFloat() / 10,
                it.getBeet() + (0..100).random().toFloat() / 10
            )
        }
    }

    private fun outData() {
        winnerLiveData.postValue(regionList.filter { it.getVictory() }.map { it.getRegion() }.toString())
    }
}