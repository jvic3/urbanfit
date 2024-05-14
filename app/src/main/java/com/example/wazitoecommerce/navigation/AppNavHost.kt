package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.exercise.AddExerciseScreen
import com.example.wazitoecommerce.ui.theme.screens.exercise.ViewExerciseScreen
import com.example.wazitoecommerce.ui.theme.screens.exercises.Workoutscreen
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.intro.Introscreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.meal.Mealscreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.profile.Profilescreen
import com.example.wazitoecommerce.ui.theme.screens.settings.Settingscreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.Splashscreen
import com.example.wazitoecommerce.ui.theme.screens.youtube.Youtubescreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }

        composable(SPLASH_URL){
           Splashscreen(navController = navController)
        }


        composable(MEAL_URL){
            Mealscreen(navController = navController)
        }

        composable(SETTING_URL){
            Settingscreen(navController = navController)
        }

        composable(ADD_EXERCISE_URL){
            AddExerciseScreen(navController = navController)
        }

        composable(VIEW_EXERCISE_URL){
         ViewExerciseScreen(navController = navController)
        }

        composable(WORKOUT_URL){
            Workoutscreen(navController = navController)
        }


        composable(INTRO_URL){
            Introscreen(navController = navController)
        }

        composable(PROFILE_URL){
            Profilescreen(navController = navController)
        }


        composable(YOUTUBE_URL){
            Youtubescreen(navController = navController)
        }




    }
}