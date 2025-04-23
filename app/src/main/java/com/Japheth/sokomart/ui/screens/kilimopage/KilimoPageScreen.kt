package com.Japheth.sokomart.ui.screens.kilimopage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun KilimoPageScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {


    }











}

@Preview(showBackground = true)
@Composable
fun KilimoPageScreenPreview(){
    KilimoPageScreen(navController= rememberNavController())
}