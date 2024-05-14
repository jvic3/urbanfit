package com.example.wazitoecommerce.ui.theme.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

import androidx.navigation.compose.rememberNavController

import com.example.wazitoecommerce.navigation.ADD_EXERCISE_URL
import com.example.wazitoecommerce.ui.theme.PurpleGrey80
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.YOUTUBE_URL

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        TopAppBar(title = { Text(text = "Urban Fit!",
            color = Color.Black,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif
        )},
            navigationIcon = {


            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(PurpleGrey80)

            )




        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }








            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Black),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                    
                ){
                    Text(text = "Welcome to Urban Fit!",
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.LightGray)
                    Spacer(modifier = Modifier.height(50.dp))


                   Image(painter = painterResource(id = R.drawable.flat),
                       contentDescription ="flat",
                       modifier = Modifier.size(200.dp))

                    Spacer(modifier = Modifier.height(50.dp))

                    Column(modifier = Modifier.padding(start = 30.dp)) {

                        //Row1


                            Spacer(modifier = Modifier.height(0.dp))

                            Card(modifier = Modifier.size(width = 325.dp, height = 150.dp).clickable {  navController.navigate(
                                ADD_EXERCISE_URL
                            ) },
                            ) {
                                Column {
                                    Box(modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center) {
                                        Image(
                                            painter = painterResource(id = R.drawable.man),
                                            contentDescription = "",
                                            modifier = Modifier.size(100.dp)
                                        )
                                    }

                                    Text(text = "Plan your routine?!",
                                        fontSize = 30.sp,
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center)

                                }



                            }

                        Spacer(modifier = Modifier.height(50.dp))





                        //End Of Raw1

                    }




                    






                }

            }

        )

    }
}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Diet",
        route="meal",
        selectedIcon=Icons.Filled.Favorite,
        unselectedIcon=Icons.Outlined.Favorite,
        hasNews = true,
        badges=1
    ),


    BottomNavItem(
        title = "Exercises",
        route="exercises",
        selectedIcon=Icons.Filled.Favorite,
        unselectedIcon=Icons.Outlined.Face,
        hasNews = true,
        badges=1
    ),


    BottomNavItem(
        title = "Admin",
        route="login",
        selectedIcon=Icons.Filled.Person,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = true,
        badges=1
    ),

    BottomNavItem(
        title = "Settings",
        route="settings",
        selectedIcon=Icons.Filled.Settings,
        unselectedIcon=Icons.Outlined.Settings,
        hasNews = true,
        badges=1
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



@Composable
@Preview()
fun HomeScreenPreview(){
    WazitoECommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}