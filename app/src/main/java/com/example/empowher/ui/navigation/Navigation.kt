package com.example.empowher.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.example.empowher.R

data class NavigationItem(
    val title: Int,
    val icon: Int,
    val route: String
)

@Composable
fun navigationItems(): List<NavigationItem> {
    return remember {
        listOf(
            NavigationItem(
                title = R.string.home,
                icon = R.drawable.home_icon,
                route = "home"
            ),
            NavigationItem(
                title = R.string.financial,
                icon = R.drawable.baseline_credit_card_24,
                route = "financial"
            ),
            NavigationItem(
                title = R.string.career,
                icon = R.drawable.work_icon,
                route = "career"
            ),
            NavigationItem(
                title = R.string.business,
                icon = R.drawable.business_icon,
                route = "business"
            ),
            NavigationItem(
                title = R.string.leadership,
                icon = R.drawable.person_icon,
                route = "leadership"
            )
        )
    }
}