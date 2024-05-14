package com.example.wazitoecommerce.ui.theme.screens.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

import com.example.wazitoecommerce.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Profilescreen(navController: NavController){

    Column  (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)) {


        Image(
            painter = painterResource(id = R.drawable.profile), contentDescription = "",
            modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape)

        )

        Text(
            text = "June Juliana",
            fontSize = 20.sp,
            color = Color.LightGray
        )

        Text(
            text = "Android Developer",
            fontSize = 20.sp,
            color = Color.LightGray
        )



    }
        










}
@Preview()
@Composable
fun ProfilescreenPreview() {
    Profilescreen(rememberNavController())
}
private object Details{
    const val name = "June Juliana"
    const val position = "Android Developer"}