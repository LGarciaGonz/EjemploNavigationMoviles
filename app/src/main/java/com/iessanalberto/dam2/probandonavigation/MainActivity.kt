package com.iessanalberto.dam2.probandonavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.iessanalberto.dam2.probandonavigation.navigation.AppNavigation
import com.iessanalberto.dam2.probandonavigation.screens.FirstScreen
import com.iessanalberto.dam2.probandonavigation.ui.theme.ProbandoNavigationTheme

/**
 * ---------[ PASOS PARA LA NAVEGACIÓN POR VENTANAS ]---------
 * 1. Añadir línea de implementación en el Gradle a nivel de módulo.
 * 2. Creación de paquete "screens" para meter las funciones composables que cargan las ventanas.
 * 3. Creación del paquete "navigation":
 *      - Clase sellada "AppScreens" -> indicar la ruta válida de cada elemento.
 *      - File "AppNavigation" con "navController" (remember) -> control de dónde se encuentra y cuándo redibujar los elementos
 *                               y "navHost" (timón y velas).
 */


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProbandoNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}