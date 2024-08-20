
package com.example.calismayapisi

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa(navController: NavController) {

    LaunchedEffect(key1 = true) {
        Log.e("Anasayfa", "Launched Effect çalıştı")
    }

    DisposableEffect(Unit) {
        onDispose {
            Log.e("Anasayfa", "DisposableEffect çalıştı")
        }
    }

    Scaffold(
        topBar = { TopAppBar(title = { Text("Anasayfa") }) }
    ) { paddingValues ->
        Log.e("Anasayfa", "yenilendi")
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                // Ekran geçişi
                navController.navigate("asayfa")
            }) {
                Text(text = "A sayfa")
            }
            Button(onClick = { navController.navigate("xSayfasi") }) {
                Text("X Sayfasına Git")
            }
        }
    }
}
