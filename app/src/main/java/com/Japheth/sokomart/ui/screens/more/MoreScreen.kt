package com.Japheth.sokomart.ui.screens.more

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Japheth.sokomart.R
import com.Japheth.sokomart.navigation.ROUT_INTENT


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoreScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "More Products") },
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


            }

        )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(10.dp))

        //SearchBar
        var search by remember { mutableStateOf("")  }
        OutlinedTextField(
            value = search,
            onValueChange = {search= it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp ),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search") },
            placeholder = { Text(text = "Search more products...") }
        )

        //End of SearchBar

        Spacer(modifier = Modifier.height(10.dp))

        //Box
        Box(
            modifier = Modifier.fillMaxWidth().height(250.dp),
            contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painterResource(R.drawable.watch2),
                contentDescription = "img",
                modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillWidth
            )
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Fav",
                tint = Color.White,
                modifier = Modifier.align(alignment = Alignment.TopEnd).padding(15.dp)
            )

            Text(
                text = "Find the Best Products",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold


            )

        }
        //End of Box

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Popular types of watches",
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        //Row
        Row(modifier = Modifier.padding(start = 20.dp).horizontalScroll(rememberScrollState())) {

            //Column
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                 //Image
                Image(
                    painter = painterResource(R.drawable.watch1),
                    contentDescription = "img",
                    modifier = Modifier.size(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)), contentScale = ContentScale.FillBounds
                )
               //end of image

                Text(text = "Rolex",
                    fontSize = 15.sp
                )

                Text(text = "Ksh.1500",
                    fontSize = 15.sp
                )

                //Button
                Button(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                              },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Color.Magenta)
                ) {
                    Text(text = "Pay")
                }
               //End of button

            }
        //End of Column

            Spacer(modifier = Modifier.width(20.dp))

            //Column
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                //Image
                Image(
                    painter = painterResource(R.drawable.watch3),
                    contentDescription = "img",
                    modifier = Modifier.size(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)), contentScale = ContentScale.FillBounds
                )
                //end of image

                Text(text = "Omega",
                    fontSize = 15.sp
                )

                Text(text = "Ksh.1300",
                    fontSize = 15.sp
                )

                //Button
                Button(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Color.Magenta)
                ) {
                    Text(text = "Pay")
                }
                //End of button

            }
            //End of Column

            Spacer(modifier = Modifier.width(20.dp))

            //Column
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                //Image
                Image(
                    painter = painterResource(R.drawable.watch4),
                    contentDescription = "img",
                    modifier = Modifier.size(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)), contentScale = ContentScale.FillBounds
                )
                //end of image

                Text(text = "Patek",
                    fontSize = 15.sp
                )

                Text(text = "Ksh.1350",
                    fontSize = 15.sp
                )

                //Button
                Button(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Color.Magenta)
                ) {
                    Text(text = "Pay")
                }
                //End of button

            }
            //End of Column

            Spacer(modifier = Modifier.width(20.dp))
            //Column
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                //Image
                Image(
                    painter = painterResource(R.drawable.watch5),
                    contentDescription = "img",
                    modifier = Modifier.size(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)), contentScale = ContentScale.FillBounds
                )
                //end of image

                Text(text = "Siesko",
                    fontSize = 15.sp
                )

                Text(text = "Ksh.1200",
                    fontSize = 15.sp
                )

                //Button
                Button(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Color.Magenta)
                ) {
                    Text(text = "Pay")
                }
                //End of button

            }
            //End of Column

            Spacer(modifier = Modifier.width(20.dp))
            //Column
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                //Image
                Image(
                    painter = painterResource(R.drawable.watch6),
                    contentDescription = "img",
                    modifier = Modifier.size(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)), contentScale = ContentScale.FillBounds
                )
                //end of image

                Text(text = " cartier",
                    fontSize = 15.sp
                )

                Text(text = "Ksh.1500",
                    fontSize = 15.sp
                )

                //Button
                Button(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Color.Magenta)
                ) {
                    Text(text = "Pay")
                }
                //End of button

            }
            //End of Column

            Spacer(modifier = Modifier.width(20.dp))











        }

        
        //End of Row







    }

}

@Preview(showBackground = true)
@Composable
fun MoreScreenPreview(){
    MoreScreen(navController= rememberNavController())
}