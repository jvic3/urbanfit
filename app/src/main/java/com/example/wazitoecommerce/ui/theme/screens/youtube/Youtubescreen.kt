package com.example.wazitoecommerce.ui.theme.screens.youtube

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Youtubescreen(navController: NavController){
    Column ( modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally){

        val mUrl = "https://www.youtube.com/watch?v=AhdtowFDKT0"


        AndroidView(factory = {
            WebView(it).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webViewClient = WebViewClient()
                loadUrl(mUrl)
            }
        }, update = { it.loadUrl(mUrl) })


    }

}







@Preview(showBackground = true)
@Composable
fun YoutubescreenPreview() {
  Youtubescreen(rememberNavController())
}