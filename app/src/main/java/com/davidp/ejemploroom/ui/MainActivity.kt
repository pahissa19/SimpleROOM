package com.davidp.ejemploroom.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.davidp.ejemploroom.data.UserDatabase
import com.davidp.ejemploroom.data.UserRepository
import com.davidp.ejemploroom.main.MainScreen
import com.davidp.ejemploroom.main.MainViewModel
import com.davidp.ejemploroom.ui.theme.EjemploRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(this,UserDatabase::class.java, "user_db").build()
        val dao = db.dao
        val repository = UserRepository(dao)

        val viewmodel = MainViewModel(repository)
        setContent {
           MainScreen(viewmodel = viewmodel)
        }
    }
}
