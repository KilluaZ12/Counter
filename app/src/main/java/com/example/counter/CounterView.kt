package com.example.counter

interface CounterView {
    fun showCount(count: Int)
    fun showToast(congratulation: String)
    fun changeTextColor(color: Int)
}