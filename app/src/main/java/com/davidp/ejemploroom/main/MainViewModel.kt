package com.davidp.ejemploroom.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.davidp.ejemploroom.data.User
import com.davidp.ejemploroom.data.UserRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: UserRepository) : ViewModel(){
    var state by mutableStateOf(MainState())
        private set

    init {
        viewModelScope.launch {
            state = state.copy(
                users = repository.getUsers()
            )
        }
    }

    fun onNameChanged(name: String){
        state = state.copy(
            name = name
        )
    }

    fun saveUser(){
        val user = User(
            name = state.name
        )
        viewModelScope.launch {
            repository.insertUser(user)
        }
    }
}