package com.example.dordoncuproje

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.calismayapisi.Anasayfa

@Composable
fun SayfaGecisleri() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "anasayfa") {
        composable("anasayfa") {
            Anasayfa(navController = navController)
        }
        composable("asayfa") {
            SayfaA(navController = navController)
        }
        composable("xSayfasi") {
            Sayfax(navController=navController)
        }
        composable("bSayfasi") {
            SayfaB(navController = navController)
        }

        composable("ySayfasi") {
            Sayfay(navController = navController)
        }

    }
}

