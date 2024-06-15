package com.example.myapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.myapplication.widgets.BottomBar
import com.example.myapplication.widgets.HeaderTopBar
import com.example.myapplication.widgets.HomeScreenButtons
import androidx.compose.ui.Modifier


@Composable
fun HomeScreen (navController: NavController) {
    Scaffold (
        topBar = {
            HeaderTopBar()
        },
        bottomBar = {
            BottomBar()
        }
    ){ innerPadding ->
        Column (modifier = Modifier.padding(innerPadding)) {
            HomeScreenButtons(navController = navController)

        }
    }
}