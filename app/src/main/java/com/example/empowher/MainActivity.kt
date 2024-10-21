package com.example.empowher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.empowher.ui.components.home.HomeScreen
import com.example.empowher.ui.theme.EmpowHERTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContent {
    EmpowHERTheme { // Apply your app's theme
        Surface( // Wrap with Surface for background and layout
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            HomeScreen() // Now your HomeScreen composable is correctly placed
        }
    }
}
}
}
