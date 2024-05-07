package com.davidp.ejemploroom.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen (viewmodel: MainViewModel){
    val state = viewmodel.state
    Column (modifier = Modifier.fillMaxWidth()){

        TextField(value = state.name, onValueChange = {viewmodel.onNameChanged(it)})
        Button(onClick = { viewmodel.saveUser()}) {
            Text(text = "Guardar")
        }

        LazyColumn (modifier = Modifier.fillMaxWidth()){
            items(state.users){
                Text(text = it.name)
            }
        }
    }
}