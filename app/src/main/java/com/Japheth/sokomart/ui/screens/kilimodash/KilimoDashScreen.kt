package com.Japheth.sokomart.ui.screens.kilimodash

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.traceEventStart
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Japheth.sokomart.R
import com.Japheth.sokomart.navigation.ROUT_ABOUT
import com.Japheth.sokomart.navigation.ROUT_HOME
import com.Japheth.sokomart.navigation.ROUT_ITEM


@Composable
fun DashboardScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {

        //Card
        Card(
            modifier = Modifier.fillMaxWidth().height(height = 300.dp),
            shape = RoundedCornerShape(bottomStart = 55.dp, bottomEnd = 55.dp),
            colors = CardDefaults.cardColors(Color.Green)
        ) {

            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.kilimo),
                    contentDescription = "img",
                    modifier = Modifier.size(150.dp)
                )

                Text(
                    text = "Kilimo Connect",
                    fontSize = 40.sp,
                    color = Color.Black,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold

                )

            }

        }
        //End of card

        Spacer(modifier = Modifier.height(35.dp))

        //Row
        Row(modifier = Modifier.padding(start = 20.dp)) {

            //Card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Green)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize().clickable {
                        navController.navigate(ROUT_HOME) },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Image(
                        painter = painterResource(R.drawable.kilimohome),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)
                    )

                    Text(
                        text = "Home",
                        fontSize = 15.sp
                    )

                }

            }
            //End of card

            Spacer(modifier = Modifier.width(20.dp))

            //Card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Green)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize().clickable {
                        navController.navigate(ROUT_ABOUT)
                    },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {

                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)
                    )

                    Text(
                        text = "About",
                        fontSize = 15.sp
                    )

                }

            }
            //End of card

        }
        //End of row


        Spacer(modifier = Modifier.height(20.dp))

        //Row
        Row(modifier = Modifier.padding(start = 20.dp)) {

            //Card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Green)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)
                    )

                    Text(
                        text = "contact",
                        fontSize = 15.sp
                    )

                }

            }
            //End of card

            Spacer(modifier = Modifier.width(20.dp))

            //Card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Green)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize().clickable {
                        navController.navigate(ROUT_ITEM)
                    },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)
                    )

                    Text(
                        text = "Product",
                        fontSize = 15.sp
                    )

                }

            }
            //End of card

        }
        //End of row

        Spacer(modifier = Modifier.height(20.dp))

        //Row
        Row(modifier = Modifier.padding(start = 20.dp)) {

            //Card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Green)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)
                    )

                    Text(
                        text = "Services",
                        fontSize = 15.sp
                    )

                }

            }
            //End of card

            Spacer(modifier = Modifier.width(20.dp))

            //Card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Green)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize().clickable {
                        navController.navigate(ROUT_ITEM)
                    },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)
                    )

                    Text(
                        text = "Product",
                        fontSize = 15.sp
                    )

                }

            }
            //End of card

        }
        //End of row















    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(navController= rememberNavController())}
