package com.example.wazitoecommerce.ui.theme.screens.settings

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.data.AuthViewModel



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Settingscreen(navController: NavHostController){


    val context = LocalContext.current

    
    Column  (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)) {
        TopAppBar(title = { Text(text = "Settings",
            color = Color.Black,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif
        )},)

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Text(
                text = "Log out",
                fontSize = 25.sp,
                color = Color.LightGray
            )

            Spacer(modifier = Modifier.width(260.dp))
            val authViewModel = AuthViewModel(navController, context)




            IconButton(onClick = {
                authViewModel.logout()

            }) {


                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "forward",
                    tint = Color.White
                )
            }



        }




    }










    



    

}
@Preview()
@Composable
fun SettingscreenPreview() {
    Settingscreen(rememberNavController())
}