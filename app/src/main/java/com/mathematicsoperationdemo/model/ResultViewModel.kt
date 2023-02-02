package com.mathematicsoperationdemo.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ResultViewModel : ViewModel(),Calculations {
    var result = MutableLiveData<Int>()

    override fun addition(num1: Int, num2: Int) {
        result.value=num1+num2
    }

    override fun substraction(num1: Int, num2: Int) {
        result.value=num1-num2
    }
}