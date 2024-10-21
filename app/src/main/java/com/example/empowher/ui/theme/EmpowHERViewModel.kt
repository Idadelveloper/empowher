package com.example.empowher.ui.theme

import androidx.lifecycle.ViewModel
import com.example.empowher.BuildConfig
import com.google.ai.client.generativeai.GenerativeModel

class EmpowHERViewModel : ViewModel() {

    // ... other ViewModel code ...

    private val generativeModel = GenerativeModel(
        modelName = "gemini-1.5-flash",
        apiKey = BuildConfig.apiKey
    )



}