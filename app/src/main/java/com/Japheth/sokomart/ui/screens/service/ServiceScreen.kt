package com.Japheth.sokomart.ui.screens.service

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServiceScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Service") },
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
                    .verticalScroll(rememberScrollState())
                    .paint(painter = painterResource(R.drawable.img_3), contentScale = ContentScale.FillBounds)
            ) {

            //Main Contents of the page

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

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text="We have a variety of services we offer",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White

                )

                Spacer(modifier = Modifier.height(20.dp))


                //Row
                Row(modifier = Modifier.padding(start = 20.dp)) {

                    //Card
                    Card(
                        modifier = Modifier.width(150.dp).height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color.Magenta)
                    ) {

                        Column(
                            modifier = Modifier.fillMaxSize().clickable {
                                navController.navigate(ROUT_HOME) },
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center) {
                            Image(
                                painter = painterResource(R.drawable.home),
                                contentDescription = "img",
                                modifier = Modifier.size(100.dp)
                            )

                            Text(
                                text = "Home",
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
                        colors = CardDefaults.cardColors(Color.Magenta)
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
                                fontSize = 15.sp,
                                color = Color.White
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
                        colors = CardDefaults.cardColors(Color.Magenta)
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
                        colors = CardDefaults.cardColors(Color.Magenta)
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
                                fontSize = 15.sp,
                                color = Color.White
                            )

                        }

                    }
                    //End of card

                }
                //End of row
            }
        }
    )

    //End of scaffold













}

@Preview(showBackground = true)
@Composable
fun ServiceScreenPreview(){
   ServiceScreen(navController= rememberNavController())
}