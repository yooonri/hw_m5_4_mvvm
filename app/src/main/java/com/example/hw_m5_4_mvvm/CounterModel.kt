package com.example.hw_m5_4_mvvm

class CounterModel(
    var count: Int = 0
) {
    fun getCurrentValue(): Int {
        return count
    }

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }
}