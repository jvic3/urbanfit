package com.example.wazitoecommerce.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavHostController
import com.example.wazitoecommerce.models.Exercise
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class ExerciseViewModel {

    class ExerciseViewModel(var navController: NavHostController, var context: Context) {
        var authViewModel:AuthViewModel
        var progress: ProgressDialog
        init {
            authViewModel = AuthViewModel(navController, context)
            if (!authViewModel.isLoggedIn()){
                navController.navigate(LOGIN_URL)
            }
            progress = ProgressDialog(context)
            progress.setTitle("Loading")
            progress.setMessage("Please wait...")
        }

        fun uploadExercise(name:String, charges:String, duration:String, filePath: Uri){
            val ExerciseId = System.currentTimeMillis().toString()
            val storageRef = FirebaseStorage.getInstance().getReference()
                .child("Exercises/$ExerciseId")
            progress.show()
            storageRef.putFile(filePath).addOnCompleteListener{
                progress.dismiss()
                if (it.isSuccessful){
                    // Save data to db
                    storageRef.downloadUrl.addOnSuccessListener {
                        var imageUrl = it.toString()
                        var Exercise = Exercise(name,charges,duration,imageUrl,ExerciseId)
                        var databaseRef = FirebaseDatabase.getInstance().getReference()
                            .child("Exercises/$ExerciseId")
                        databaseRef.setValue(Exercise).addOnCompleteListener {
                            if (it.isSuccessful){
                                Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                            }else{
                                Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                }else{
                    Toast.makeText(this.context, "Upload error", Toast.LENGTH_SHORT).show()
                }
            }
        }




        fun allExercise(
            exercise: MutableState<Exercise>,
            exercises: SnapshotStateList<Exercise>
        ): SnapshotStateList<Exercise> {
            progress.show()
            var ref = FirebaseDatabase.getInstance().getReference()
                .child("Exercises")
            ref.addValueEventListener(object: ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    exercises.clear()
                    for (snap in snapshot.children){
                        var retrievedExercise = snap.getValue(Exercise::class.java)
                        exercise.value = retrievedExercise!!
                        exercises.add(retrievedExercise)
                    }
                    progress.dismiss()
                }

                override fun onCancelled(error: DatabaseError) {
                    Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
                }
            })
            return exercises
        }

        fun deleteExercise(ExerciseId:String){
            var ref = FirebaseDatabase.getInstance().getReference()
                .child("Exercises/$ExerciseId")
            ref.removeValue()
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }

        fun uploadExercise(name: String, charges: String, duration: Uri) {

        }


    }



}

private fun <T> SnapshotStateList<T>.add(element: MutableState<T>) {
    TODO("Not yet implemented")
}


