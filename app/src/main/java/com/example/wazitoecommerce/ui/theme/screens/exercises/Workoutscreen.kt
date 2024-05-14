package com.example.wazitoecommerce.ui.theme.screens.exercises

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.example.wazitoecommerce.navigation.YOUTUBE_URL
import com.example.wazitoecommerce.ui.theme.lightBlue
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.data.ExerciseViewModel
import com.example.wazitoecommerce.navigation.VIEW_EXERCISE_URL


@Composable
fun Workoutscreen(navController: NavController){

    Column  (
    modifier = Modifier
        .fillMaxSize()

        .background(color = Color.Black),
    verticalArrangement = Arrangement.spacedBy(40.dp),
    horizontalAlignment = Alignment.Start,)

        {
        Text(text = "Exercises",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.LightGray,
            fontFamily = FontFamily.Serif
        )

            //row1
            Row ( horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()){
                Column {
                    Image(painter = painterResource(id = R.drawable.chest), contentDescription = "chest",
                        modifier = Modifier
                            .clickable {
                                navController.navigate(YOUTUBE_URL)
                            }
                            .size(80.dp)
                            )

                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Chest",
                        fontSize = 20.sp,
                        color = Color.LightGray)

                }
                Column {

                    Image(painter = painterResource(id = R.drawable.shoulder), contentDescription ="shoulder" ,
                        modifier = Modifier.size(80.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Shoulders",
                        fontSize = 20.sp, color = Color.LightGray)

                }
                Column {
                    Image(painter = painterResource(id = R.drawable.biceps), contentDescription = "biceps",
                        modifier = Modifier.size(80.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Biceps",
                        fontSize = 20.sp, color = Color.LightGray)

                }


            }
            //end of row1

            //row2
            Row ( horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()){

                Column {
                    Image(painter = painterResource(id = R.drawable.triceps), contentDescription = "triceps",
                        modifier = Modifier.size(80.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Triceps",
                        fontSize = 20.sp,
                        color = Color.LightGray)

                }
                Column {

                    Image(painter = painterResource(id = R.drawable.upperb), contentDescription ="upper back",
                        modifier = Modifier.size(80.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Upper back",
                        fontSize = 20.sp,
                        color = Color.LightGray)

                }
                Column {
                    Image(painter = painterResource(id = R.drawable.forearm), contentDescription = "forearm",
                        modifier = Modifier.size(80.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Forearm",
                        fontSize = 20.sp,
                        color = Color.LightGray)
                }


            }
            //end of row2

            //row3
            Row ( horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()){

                Column {
                    Image(painter = painterResource(id = R.drawable.calves), contentDescription = "calves",
                        modifier = Modifier.size(80.dp))
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "Calves",
                        fontSize = 20.sp,
                        color = Color.LightGray)

                }
                Column {

                    Image(painter = painterResource(id = R.drawable.hamstring), contentDescription ="hamstrings",
                        modifier = Modifier.size(80.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Hamstrings",
                        fontSize = 20.sp,
                        color = Color.LightGray)

                }
                Column {

                    Image(painter = painterResource(id = R.drawable.innerthigh), contentDescription = "inner thigh",
                        modifier = Modifier.size(80.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Inner thigh",
                        fontSize = 20.sp,
                        color = Color.LightGray)

                }





            }
            //end of row3
            Spacer(modifier = Modifier.height(20.dp))


            Button(onClick = {
                navController.navigate(VIEW_EXERCISE_URL)
            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.DarkGray   ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
            ) {
                Text(text = "More",
                    fontSize = 20.sp)
            }


        }




}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExerciseItem(
    onClick: () -> Unit,
    name: String,
    charges: String,
    duration: String,
    id: String,
    navController: NavHostController,
    ExerciseRepository: ExerciseViewModel.ExerciseViewModel,

    image: Int
) {


    Column(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Surface(
            shape = CircleShape,
            modifier = Modifier.size(100.dp),
            color = lightBlue,
            onClick = onClick
        ) {

            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }




    }

}




@Preview()
@Composable
fun WorkoutscreenPreview() {
Workoutscreen(rememberNavController())
}