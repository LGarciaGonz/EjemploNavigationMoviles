package com.iessanalberto.dam2.probandonavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.iessanalberto.dam2.probandonavigation.navigation.AppScreens

@Composable
fun SecondScreen(navController: NavController, text : String?) {

    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        Text(text = "Bienvenido a la segunda ventana ${text}", fontWeight = FontWeight.Bold)
        Button(onClick = { navController.navigate(route = AppScreens.FirstScreen.route) }) {
            Text(text = "Volver")
        }
    }

}