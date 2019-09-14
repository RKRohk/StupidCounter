package com.example.mystupidapp

import androidx.lifecycle.ViewModel;

class MainActivityViewModel : ViewModel() {
    lateinit var name: String
    fun getName(name:String){
        this.name = name
    }

}
