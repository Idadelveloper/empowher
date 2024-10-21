package com.example.empowher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.empowher.ui.components.financial.FinancialScreen
import com.example.empowher.ui.theme.EmpowHERTheme

class FinancialActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmpowHERTheme {
                FinancialScreen()
            }
        }
    }
}

