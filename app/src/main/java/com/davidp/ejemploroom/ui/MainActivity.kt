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
import com.davidp.ejemploroom.main.MainScreen
import com.davidp.ejemploroom.main.MainViewModel
import com.davidp.ejemploroom.ui.theme.EjemploRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val viewmodel by viewModels<MainViewModel>()
        setContent {
           MainScreen(viewmodel = viewmodel)
        }
    }
}
