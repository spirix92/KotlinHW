package com.selen.kotlinhw.Model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainModel {
    private var mycount = 0
    private val myLiveData: MutableLiveData<Int> = MutableLiveData()

    fun getLiveData(): LiveData<Int> = myLiveData

    fun addCount() {
        myLiveData.value = ++mycount
    }
}