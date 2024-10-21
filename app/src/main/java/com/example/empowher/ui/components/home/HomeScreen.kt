package com.example.empowher.ui.components.home

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.empowher.ui.navigation.BottomNavigationBar
import com.example.empowher.ui.navigation.NavigationGraph

@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavigationGraph(navController = navController, innerPadding = innerPadding)
    }
}