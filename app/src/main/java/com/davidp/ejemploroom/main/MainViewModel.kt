package com.davidp.ejemploroom.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    var state by mutableStateOf(MainState())
        private set

    fun onNameChanged(name: String){
        state = state.copy(
            name = name
        )
    }
}