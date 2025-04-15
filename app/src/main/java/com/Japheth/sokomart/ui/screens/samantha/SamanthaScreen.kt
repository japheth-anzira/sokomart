package com.Japheth.sokomart.ui.screens.samantha

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SamanthaScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()) {

        //Row
        Row() {

            //Scaffold

            var selectedIndex by remember { mutableStateOf(0) }

            Scaffold(
                //TopBar
                topBar = {
                    TopAppBar(
                        title = { Text("Contact") },
                        navigationIcon = {
                            IconButton(onClick = { /* Handle back/nav */ }) {
                                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                            }
                        },
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Color.Magenta,
                            titleContentColor = Color.White,
                            navigationIconContentColor = Color.White
                        )
                    )
                },

                //BottomBar
                bottomBar = {
                    NavigationBar(
                        containerColor = Color.Magenta
                    ){
                        NavigationBarItem(
                            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                            label = { Text("Home") },
                            selected = selectedIndex == 0,
                            onClick = { selectedIndex = 0
                                navController.navigate(ROUT_HOME)
                            }
                        )
                        NavigationBarItem(
                            icon = { Icon(Icons.Default.Info, contentDescription = "Favorites") },
                            label = { Text("Info") },
                            selected = selectedIndex == 1,
                            onClick = { selectedIndex = 1
                                // navController.navigate(ROUT_HOME)
                            }
                        )
                        NavigationBarItem(
                            icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                            label = { Text("Profile") },
                            selected = selectedIndex == 2,
                            onClick = { selectedIndex = 2
                                //  navController.navigate(ROUT_HOME)
                            }
                        )
                        NavigationBarItem(
                            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                            label = { Text("Home") },
                            selected = selectedIndex == 0,
                            onClick = { selectedIndex = 0
                                navController.navigate(ROUT_HOME)
                            }
                        )

                    }
                },

                //FloatingActionButton
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { /* Add action */ },
                        containerColor = Color.Magenta
                    ) {
                        Icon(Icons.Default.Add, contentDescription = "Add")
                    }
                },
                content = { paddingValues ->
                    Column(
                        modifier = Modifier
                            .padding(paddingValues)
                            .fillMaxSize()
                    ) {


                        //Main Contents of the page
                        Text(text = "Welcome to Homescreen Screen", fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text("This is where the main content goes.")












                    }
                }
            )

            //End of scaffold



            //Card
            Card(
                modifier = Modifier.width(500.dp).height(180.dp),
                colors = CardDefaults.cardColors(Color.White),
            ) {

                Column(
                    modifier = Modifier.fillMaxSize().clickable {
                        navController.navigate(ROUT_HOME) },
                    horizontalAlignment = AbsoluteAlignment.Left,
                    verticalArrangement = Arrangement.Center) {


                    Text(
                        text = "Hi Samantha",
                        fontSize = 15.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Here are your projects",
                        fontSize = 15.sp,
                        color = Color.Black
                    )

                }

            }
            //End of card

            Spacer(modifier = Modifier.width(20.dp))



        }
        //End of row
        Spacer(modifier = Modifier.width(20.dp))

        //Row
        Row(modifier = Modifier.padding(start = 20.dp).horizontalScroll(rememberScrollState())) {

            //Column


        }


        //End of Row

        Spacer(modifier = Modifier.height(20.dp))

        //Row
        Row() {

            //Card
            Card(
                modifier = Modifier.width(500.dp).height(180.dp),
                colors = CardDefaults.cardColors(Color.White),
            ) {

                Column(
                    modifier = Modifier.fillMaxSize().clickable {
                        navController.navigate(ROUT_HOME) },
                    horizontalAlignment = AbsoluteAlignment.Left,
                    verticalArrangement = Arrangement.Center) {


                    //Row
                    Row(modifier = Modifier.padding(start = 20.dp)) {

                        //Card
                        Card(
                            modifier = Modifier.width(150.dp).height(180.dp),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.Blue)
                        ) {

                            Column(
                                modifier = Modifier.fillMaxSize().clickable {
                                    navController.navigate(ROUT_HOME) },
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center) {

                                Text(
                                    text = "Cryptocurrency",
                                    fontSize = 15.sp,
                                    color = Color.White
                                )
                                Text(
                                    text = "Landing Page",
                                    fontSize = 15.sp,
                                    color = Color.White
                                )

                            }

                        }
                        //End of card

                        Spacer(modifier = Modifier.width(20.dp))

                        //Card
                        Card(
                            modifier = Modifier.width(150.dp).height(180.dp),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.Gray)
                        ) {

                            Column(
                                modifier = Modifier.fillMaxSize().clickable {
                                    navController.navigate(ROUT_ABOUT)
                                },
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center) {



                                Text(
                                    text = "Statistics",
                                    fontSize = 15.sp,
                                    color = Color.White
                                )
                                Text(
                                    text = "Dashboard",
                                    fontSize = 15.sp,
                                    color = Color.White
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



                                Text(
                                    text = "About",
                                    fontSize = 15.sp
                                )

                            }

                        }
                        //End of card


                    }
                    //End of row


                    //Box
                    Box(
                        modifier = Modifier.fillMaxWidth().height(250.dp),
                        contentAlignment = Alignment.Center

                    ) {



                        Text(
                            text = "Find the Best Products",
                            fontSize = 30.sp,
                            color = Color.White,
                            fontWeight = FontWeight.ExtraBold


                        )

                    }
                    //End of Box






                }

            }
            //End of card

            Spacer(modifier = Modifier.width(20.dp))





        }
        //End of row
        Spacer(modifier = Modifier.width(20.dp))

        //Row
        Row(modifier = Modifier.padding(start = 20.dp).horizontalScroll(rememberScrollState())) {

            //Column
        }


        //End of Row




        








    }

}

@Preview(showBackground = true)
@Composable
fun SamanthaScreenPreview(){
   SamanthaScreen(navController= rememberNavController())
}