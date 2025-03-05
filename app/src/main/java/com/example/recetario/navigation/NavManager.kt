package com.example.recetario.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recetario.views.CarrotCakeView
import com.example.recetario.views.CookiesView
import com.example.recetario.views.HomeView
import com.example.recetario.views.IceCreamView
import com.example.recetario.views.PannaCottaView

object AppRoutes {
    const val HOME = "home"
    const val PANNACOTTA = "pannacotta"
    const val ICECREAM = "icecream"
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
        composable(AppRoutes.PANNACOTTA) {
            PannaCottaView(navController = navController)
        }
        composable(AppRoutes.ICECREAM) {
            IceCreamView(navController = navController)
        }
        composable(AppRoutes.COOKIES) {
            CookiesView(navController = navController)
        }
        composable(AppRoutes.CARROT) {
            CarrotCakeView(navController = navController)
        }
    }
}