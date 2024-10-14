package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {

    private val count = MutableLiveData<Int>()

    val counter : LiveData<Int> = count

    init {
        count.value = 0
    }

    fun increment(){
        count.value = (count.value ?: 0)+1
    }
}