package com.example.wazitoecommerce.ui.theme.screens.exercise

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.data.ExerciseViewModel
import com.example.wazitoecommerce.ui.theme.screens.exercises.ExerciseItem
import com.example.wazitoecommerce.ui.theme.screens.products.ProductItem
import androidx.compose.runtime.remember as remember
import com.example.wazitoecommerce.models.Exercise as ExampleWazitoecommerceModelsExercise




@Composable
fun ViewExerciseScreen(navController: NavHostController) {
    Box {
        Image(painter = painterResource(id = R.drawable.gray),
            contentDescription = "BLURY",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize())
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var ExerciseRepository = ExerciseViewModel.ExerciseViewModel(navController, context)


        val emptyExerciseState =remember { mutableStateOf(ExampleWazitoecommerceModelsExercise("","","","", id = "")) }
        var emptyExercisesListState = remember { mutableStateListOf<ExampleWazitoecommerceModelsExercise>() }

        var Exercise = ExerciseRepository.allExercise(emptyExerciseState, emptyExercisesListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All Exercises",
                fontSize = 40.sp,
                fontFamily = FontFamily.Serif,
                color = Color.LightGray)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){

                items(Exercise){
                    ExerciseItem(
                        name = it.name,
                        charges = it.charges,
                        duration = it.duration,
                        id = it.id,
                        navController = navController,
                        ExerciseRepository = ExerciseRepository,
                        ExerciseImage = it.imageUrl
                    )
                }



            }






            }

            Spacer(modifier = Modifier.height(30.dp))


            Text(text = "Happy sessions!",
                fontSize = 35.sp,
                color = Color.LightGray)




            }








        }





@Composable
fun ExerciseItem(
    name:String, charges:String,duration:String, id:String,
    navController: NavHostController,
    ExerciseRepository: ExerciseViewModel.ExerciseViewModel, ExerciseImage:String) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = charges)

        Image(
            painter = rememberAsyncImagePainter(ExerciseImage),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )

        }


    }


@Composable
@Preview(showBackground = true)
fun ViewExerciseScreenPreview(){

        ViewExerciseScreen(navController = rememberNavController())

}



