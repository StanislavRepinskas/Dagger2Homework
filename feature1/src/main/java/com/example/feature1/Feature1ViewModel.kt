package com.example.feature1

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class Feature1ViewModel @Inject constructor() : ViewModel() {
    var value: Int = 0

    init {
        println("TEST! init $this")
        value++
    }

    override fun onCleared() {
        super.onCleared()
        println("TEST! cleared $$this")
    }
}