package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.navigation.Navigation
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.widgets.BottomBar
import com.example.myapplication.widgets.ExitButton
import com.example.myapplication.widgets.HeaderTopBar
import com.example.myapplication.widgets.LoginBox
import com.example.myapplication.widgets.LoginButton
import com.example.myapplication.widgets.RegisterButton
import com.example.myapplication.widgets.TitleTopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Navigation()
            }
        }
    }
}
