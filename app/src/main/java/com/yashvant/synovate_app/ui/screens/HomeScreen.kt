package com.yashvant.synovate_app.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {

    LazyColumn {
        item {
            Column {
                Text("Hello, World!")
            }
        }
    }

}