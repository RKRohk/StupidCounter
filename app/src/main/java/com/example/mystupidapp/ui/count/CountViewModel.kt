package com.example.mystupidapp.ui.count

import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    var count = 0

    fun add(){
        count++
    }

    fun minus(){
        count--
    }
}
