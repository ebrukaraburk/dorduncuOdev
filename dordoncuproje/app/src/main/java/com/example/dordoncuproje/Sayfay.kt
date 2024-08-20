package com.example.dordoncuproje

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Sayfay(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Y Sayfası") },
                navigationIcon = {
                    androidx.compose.material3.IconButton(onClick = {
                        // Geri tuşuna basıldığında Anasayfa'ya git
                        navController.popBackStack("anasayfa", inclusive = false)
                    }) {
                        androidx.compose.material3.Icon(
                            imageVector = androidx.compose.material.icons.Icons.Default.ArrowBack,
                            contentDescription = "Geri"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Y Sayfasına Hoşgeldiniz!")
            Button(onClick = { navController.navigate("anasayfa") }) {
                Text("Anasayfaya Git")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewYSayfasi() {
    Sayfay(navController = rememberNavController())
}
