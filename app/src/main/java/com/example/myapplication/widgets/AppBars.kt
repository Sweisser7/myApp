package com.example.myapplication.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderTopBar () {
    Column {
        CenterAlignedTopAppBar(
            modifier = Modifier
                .fillMaxWidth(),
            title = {},
            navigationIcon = { ExitButton() }
        )
        TitleTopBar()
    }
}

@Composable
fun TitleTopBar () {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Rolls of",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 50.sp,
                    fontFamily = FontFamily.Serif
                )
            )
            Text(
                text = "Destiny",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 50.sp,
                    fontFamily = FontFamily.Serif
                )
            )
        }
    }
}
@Composable
fun BottomBar () {
    BottomAppBar {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Brezina Lukas  ", color = Color.Black, fontFamily = FontFamily.Serif)
            Text(text = "Pertl Moritz  ", color = Color.Black, fontFamily = FontFamily.Serif)
            Text(text = "Weisser Simon", color = Color.Black, fontFamily = FontFamily.Serif)
        }
    }
}
