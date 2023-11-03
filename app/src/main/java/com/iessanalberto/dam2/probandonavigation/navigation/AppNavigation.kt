package com.iessanalberto.dam2.probandonavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.iessanalberto.dam2.probandonavigation.screens.FirstScreen
import com.iessanalberto.dam2.probandonavigation.screens.SecondScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()         // Línea para redibujar todas las funciones de la App.

    /**
     * Todas las ventanas deben recibir el navController como parámetro de entrada para poder navegar.
     * En esta aplicación: fun FirstScreen(navController: NavController) {}
     *                     fun SecondScreen(navController: NavController) {}
     */

    // Emparejar las rutas con las ventanas a las que se quiere navegar
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route
    ) {
        // Se crean tantas líneas como ventanas haya en la aplicación
//        composable(route = AppScreens.FirstScreen.route) { FirstScreen(navController) }
//        composable(route = AppScreens.SecondScreen.route) { SecondScreen(navController) }

        /**
         * PASO DE INFORMACIÓN POR PARÁMETRO ENTRE PANTALLAS ----------
         */
        composable(route = AppScreens.FirstScreen.route) { FirstScreen(navController) }
        composable(
            route = AppScreens.SecondScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text") {type = NavType.StringType})
        ) { SecondScreen(navController, text = it.arguments?.getString("text")) }
    }

}