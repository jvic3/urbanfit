package com.example.wazitoecommerce.ui.theme.screens.meal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

import com.example.wazitoecommerce.ui.theme.rBlue
import com.example.wazitoecommerce.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Mealscreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize().background(color = Color.Black)) {
        Spacer(modifier = Modifier.height(10.dp))
        TopAppBar(title = { Text(text = "Track Your Diet!",) })

        //End of TopAppBar

        Spacer(modifier = Modifier.height(30.dp))

        Row (modifier = Modifier.padding(start = 20.dp)){
            Column {
                Text(text = "Meatless protein",
                    fontSize = 30.sp,
                    color = rBlue,
                    fontFamily = FontFamily.Serif)
                Text(text = "Sources",
                    fontSize = 30.sp,
                    color = rBlue,
                    fontFamily = FontFamily.Serif)


            }
            Spacer(modifier = Modifier.width(30.dp))
            Image(painter = painterResource(id = R.drawable.meal),
                contentDescription ="Meal",
                modifier = Modifier.size(120.dp)

            )

        }
        //end of row
        Spacer(modifier = Modifier.height(30.dp))

        Column(modifier = Modifier.padding(start = 30.dp)) {
            //Row1
            Row {
                Card(modifier = Modifier

                    .size(width = 150.dp, height = 150.dp),
                    ) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {

                            Image(
                                painter = painterResource(id = R.drawable.couliflower),
                                contentDescription = "couliflower",
                                modifier = Modifier.size(70.dp)
                            )
                        }

                        Text(text = "Cauliflower",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                        Text(text = "5g/per serving(180g)",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)



                    }

                }
                Spacer(modifier = Modifier.width(40.dp))

                Card(modifier = Modifier.size(width = 150.dp, height = 150.dp),
                    ) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {

                            Image(
                                painter = painterResource(id = R.drawable.beans),
                                contentDescription = "bean",
                                modifier = Modifier.size(70.dp)
                            )
                        }

                        Text(text = "Beans",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                        Text(text = "15g/per serving(180g)",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)





                    }

                }



            }
            //End Of Raw1
            Spacer(modifier = Modifier.height(40.dp))

            //Row1
            Row {
                Card(modifier = Modifier.size(width = 150.dp, height = 150.dp),
                    ) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {

                            Image(
                                painter = painterResource(id = R.drawable.butter),
                                contentDescription = "butter",
                                modifier = Modifier.size(70.dp)
                            )
                        }

                        Text(text = "Nut butter",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                        Text(text = "8g/2 table spoons",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)





                    }

                }
                Spacer(modifier = Modifier.width(40.dp))

                Card(modifier = Modifier.size(width = 150.dp, height = 150.dp),
                     ) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {

                            Image(
                                painter = painterResource(id = R.drawable.oatmeal),
                                contentDescription = "oatmeal",
                                modifier = Modifier.size(70.dp)
                            )
                        }

                        Text(text = "Oatmeal",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)


                        Text(text = "6g/per cup",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)





                    }

                }



            }
            //End Of Raw1


            Spacer(modifier = Modifier.height(40.dp))
            //Row1
            Row {
                Card(modifier = Modifier

                    .size(width = 150.dp, height = 150.dp),
                     ) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {

                            Image(
                                painter = painterResource(id = R.drawable.yogut),
                                contentDescription = "yogurt",
                                modifier = Modifier.size(70.dp)
                            )
                        }

                        Text(text = "Greek Yogurt",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)


                        Text(text = "10g/ per 100g",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)





                    }

                }
                Spacer(modifier = Modifier.width(40.dp))

                Card(
                    modifier = Modifier.size(width = 150.dp, height = 150.dp),
                    ) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {

                            Image(
                                painter = painterResource(id = R.drawable.eggs),
                                contentDescription = "eggs",
                                modifier = Modifier.size(70.dp)
                            )
                        }

                        Text(text = "Eggs",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                        Text(text = "6g/ per egg",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)





                    }

                }



            }
            //End Of Raw1



        }



    }

}






@Preview
@Composable
fun MealscreencreenPreview() {
 Mealscreen(rememberNavController())
}