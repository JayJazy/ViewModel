package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var num : Int = 0

    fun up()
    {
        num += 1
    }

    fun down()
    {
        num -= 1
    }
}