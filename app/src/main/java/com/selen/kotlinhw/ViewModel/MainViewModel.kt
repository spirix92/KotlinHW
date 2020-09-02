package com.selen.kotlinhw.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.selen.kotlinhw.Model.MainModel

class MainViewModel : ViewModel() {
    private val clickLiveData: MutableLiveData<Int> = MutableLiveData()
    private val model = MainModel()

    init {
        model.getLiveData().observeForever { value -> clickLiveData.value = value }
    }

    fun getViewState(): LiveData<Int> = clickLiveData

    fun addCount() {
        model.addCount()
    }
}