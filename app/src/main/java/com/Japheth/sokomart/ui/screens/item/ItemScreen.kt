package com.Japheth.sokomart.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Japheth.sokomart.R
import com.Japheth.sokomart.navigation.ROUT_INTENT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
       Column(
           modifier = Modifier.fillMaxSize()
       ) {
           //TopAppBar
         TopAppBar(
             title = { Text(text = "Item") },
             colors = TopAppBarDefaults.topAppBarColors(
              containerColor = Color.Magenta,
              titleContentColor = Color.White,
                 navigationIconContentColor = Color.White,
                 actionIconContentColor = Color.White
             ),
             navigationIcon = {
                 IconButton(onClick = {}) {
                     Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                 }
             },

             actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "icon")
                }
                 IconButton(onClick = {}) {
                     Icon(imageVector = Icons.Default.Notifications, contentDescription = "icon")
                 }
                 IconButton(onClick = {navController.navigate(ROUT_INTENT)}) {
                     Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "icon")
                 }


             }

         )
           //End of TopAppBar

           Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
               Image(
                   painter = painterResource(R.drawable.img_2),
                   contentDescription = "img",
                   modifier = Modifier.fillMaxWidth().height(200.dp),
                   contentScale = ContentScale.FillWidth
               )
               Spacer(modifier = Modifier.height(20.dp))

               //SearchBar      //Trailing end//leading front
               var search by remember { mutableStateOf("")  }
               OutlinedTextField(
                   value = search,
                   onValueChange = {search= it},
                   modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp ),
                   leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search") },
                   placeholder = { Text(text = "Search...") }
               )
               //End of Search Bar

               Spacer(modifier = Modifier.height(10.dp))

               //Row
               Row() {
                   Image(
                       painter = painterResource(R.drawable.img_1),
                       contentDescription = "img",
                       modifier = Modifier.padding(start = 20.dp).width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                       contentScale = ContentScale.FillWidth
                   )

                   Spacer(modifier = Modifier.width(10.dp))


                   Column() {
                       Text(text = "Market goods",
                           fontWeight = FontWeight.ExtraBold,
                           fontSize = 20.sp)
                       Text(
                           text = "Casual foods",
                           fontSize = 15.sp
                       )
                       Text(
                           text = "Ksh.1900",
                           fontSize = 15.sp,
                           textDecoration = TextDecoration.LineThrough,
                       )
                       Text(
                           text = "Price: 1500",
                           fontSize = 15.sp)

                       Row {
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)

                       }



                   }

               }
               //End of Row
               Spacer(modifier = Modifier.height(10.dp))

               //Row
               Row() {
                   Image(
                       painter = painterResource(R.drawable.img_1),
                       contentDescription = "img",
                       modifier = Modifier.padding(start = 20.dp).width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                       contentScale = ContentScale.FillWidth
                   )

                   Spacer(modifier = Modifier.width(10.dp))


                   Column() {
                       Text(text = "Market goods",
                           fontWeight = FontWeight.ExtraBold,
                           fontSize = 20.sp)
                       Text(
                           text = "Casual foods",
                           fontSize = 15.sp
                       )
                       Text(
                           text = "Ksh.1900",
                           fontSize = 15.sp,
                           textDecoration = TextDecoration.LineThrough,
                       )
                       Text(
                           text = "Price: 1500",
                           fontSize = 15.sp)

                       Row {
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)

                       }



                   }

               }
               //End of Row


               Spacer(modifier = Modifier.height(10.dp))

               //Row
               Row() {
                   Image(
                       painter = painterResource(R.drawable.img_1),
                       contentDescription = "img",
                       modifier = Modifier.padding(start = 20.dp).width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                       contentScale = ContentScale.FillWidth
                   )

                   Spacer(modifier = Modifier.width(10.dp))


                   Column() {
                       Text(text = "Market goods",
                           fontWeight = FontWeight.ExtraBold,
                           fontSize = 20.sp)
                       Text(
                           text = "Casual foods",
                           fontSize = 15.sp
                       )
                       Text(
                           text = "Ksh.1900",
                           fontSize = 15.sp,
                           textDecoration = TextDecoration.LineThrough,
                       )
                       Text(
                           text = "Price: 1500",
                           fontSize = 15.sp)

                       Row {
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)

                       }



                   }

               }
               //End of Row

               Spacer(modifier = Modifier.height(10.dp))

               //Row
               Row() {
                   Image(
                       painter = painterResource(R.drawable.img_1),
                       contentDescription = "img",
                       modifier = Modifier.padding(start = 20.dp).width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                       contentScale = ContentScale.FillWidth
                   )

                   Spacer(modifier = Modifier.width(10.dp))


                   Column() {
                       Text(text = "Market goods",
                           fontWeight = FontWeight.ExtraBold,
                           fontSize = 20.sp)
                       Text(
                           text = "Casual foods",
                           fontSize = 15.sp
                       )
                       Text(
                           text = "Ksh.1900",
                           fontSize = 15.sp,
                           textDecoration = TextDecoration.LineThrough,
                       )
                       Text(
                           text = "Price: 1500",
                           fontSize = 15.sp)

                       Row {
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)

                       }



                   }

               }
               //End of Row
               Spacer(modifier = Modifier.height(10.dp))

               //Row
               Row() {
                   Image(
                       painter = painterResource(R.drawable.img_1),
                       contentDescription = "img",
                       modifier = Modifier.padding(start = 20.dp).width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                       contentScale = ContentScale.FillWidth
                   )

                   Spacer(modifier = Modifier.width(10.dp))


                   Column() {
                       Text(text = "Market goods",
                           fontWeight = FontWeight.ExtraBold,
                           fontSize = 20.sp)
                       Text(
                           text = "Casual foods",
                           fontSize = 15.sp
                       )
                       Text(
                           text = "Ksh.1900",
                           fontSize = 15.sp,
                           textDecoration = TextDecoration.LineThrough,
                       )
                       Text(
                           text = "Price: 1500",
                           fontSize = 15.sp)

                       Row {
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)
                           Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Magenta)

                       }



                   }

               }
               //End of row

           }






       }

}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController= rememberNavController())
}