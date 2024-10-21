package com.example.empowher.ui.navigation

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.empowher.BusinessActivity
import com.example.empowher.CareerActivity
import com.example.empowher.FinancialActivity
import com.example.empowher.LeadershipActivity
import com.example.empowher.ui.components.home.HomeScreen

@Composable
fun NavigationGraph(navController: NavHostController, innerPadding: androidx.compose.foundation.layout.PaddingValues) {
    val context = LocalContext.current

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen() }
        composable("financial") {
            context.startActivity(Intent(context, FinancialActivity::class.java))
        }
        composable("career") {
            context.startActivity(Intent(context, CareerActivity::class.java))
        }
        composable("business") {
            context.startActivity(Intent(context, BusinessActivity::class.java))
        }
        composable("leadership") {
            context.startActivity(Intent(context, LeadershipActivity::class.java))
        }
    }
}