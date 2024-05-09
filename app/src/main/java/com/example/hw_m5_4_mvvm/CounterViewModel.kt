package com.example.hw_m5_4_mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val counterModel = CounterModel()
    private val _counter = MutableLiveData<Int>()
    val counter: LiveData<Int>
        get() = _counter

    fun inc() {
        counterModel.increment()
        _counter.value = counterModel.getCurrentValue()
    }

    fun dec() {
        counterModel.decrement()
        _counter.value = counterModel.getCurrentValue()
    }
}