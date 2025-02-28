package com.example.recetario.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recetario.views.BrownieView
import com.example.recetario.views.CarrotCakeView
import com.example.recetario.views.CookiesView
import com.example.recetario.views.CrossaintView
import com.example.recetario.views.HomeView

object AppRoutes {
    const val HOME = "home"
    const val CROSSAINT = "crossaint"
    const val BROWNIE = "brownie"
    const val COOKIES = "cookies"
    const val CARROT = "carrot"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppRoutes.HOME // Ruta inicial.
    ) {
        // Pantalla principal.
        composable(AppRoutes.HOME) {
            HomeView(navController = navController)
        }
        // Otras pantallas.
        composable(AppRoutes.CROSSAINT) {
            CrossaintView(navController = navController)
        }
        composable(AppRoutes.BROWNIE) {
            BrownieView(navController = navController)
        }
        composable(AppRoutes.COOKIES) {
            CookiesView()
        }
        composable(AppRoutes.CARROT) {
            CarrotCakeView()
        }
    }
}