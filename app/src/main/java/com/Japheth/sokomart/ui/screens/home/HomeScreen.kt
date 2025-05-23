package com.Japheth.sokomart.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Japheth.sokomart.R

@Composable
fun HomeScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .paint(painter = painterResource(R.drawable.img_3), contentScale = ContentScale.FillBounds)
    ) {
        Text(
            text = "SokoMart",
            fontSize = 30.sp,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,

        )


        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "img"
        )

        Text(
            text = "An Ecommerce App",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic,
            color = Color.White
        )

        Text(
            text = "a platform for buying and selling products or services online, featuring product galleries, shopping carts, checkout systems, and backend functions for processing payments, shipping, customer support, and marketing. \n",
            fontSize = 12.sp,
            color = Color.White
        )

        Button(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta)
        ) {
              Text(text = "See More")
        }








    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController= rememberNavController())
}