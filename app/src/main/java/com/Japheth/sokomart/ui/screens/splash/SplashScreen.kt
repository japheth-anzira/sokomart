package com.Japheth.sokomart.ui.screens.splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Japheth.sokomart.R
import com.Japheth.sokomart.navigation.ROUT_DASHBOARD
import com.Japheth.sokomart.navigation.ROUT_LOGIN
import com.Japheth.sokomart.ui.screens.more.MoreScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    val coroutine = rememberCoroutineScope()
     coroutine.launch {
         delay(1000)
         navController.navigate(ROUT_LOGIN)


     }



    Column(
        modifier = Modifier.fillMaxSize().background(Color.Magenta),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "img",
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "SokoMart",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Shop with us now!",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.White
        )


    }


}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(navController= rememberNavController())
}