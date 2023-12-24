package com.example.petadoptionapp.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.petadoptionapp.ui.screens.AppointmentBooked
import com.example.petadoptionapp.ui.screens.AppointmentBooking
import com.example.petadoptionapp.ui.screens.CenterScreen
import com.example.petadoptionapp.ui.screens.PetScreen
import com.example.petadoptionapp.ui.screens.UserRegistration

enum class Screen {
    UserRegistration,
    AppointmentBooking,
    AppointmentBooked,
    CenterScreen,
    PetScreen
}


@Composable
fun MyNavigation() {

    //viewModel object
    val viewModel = viewModel<MyViewModel>()
    val viewModel2 = viewModel<MyViewModel2>()

    //uiState object
    val uiState = viewModel.uiState.collectAsState()

    //navigation logic
    val navController = rememberNavController()

    //navigation routes
    NavHost(navController = navController, startDestination = Screen.UserRegistration.name) {
        composable(Screen.UserRegistration.name) {
            UserRegistration(navController = navController)
        }
        composable(Screen.CenterScreen.name) {
            CenterScreen {
                viewModel.onItemSelected(it)
                navController.navigate(Screen.PetScreen.name)
            }
        }
        composable(Screen.PetScreen.name) {
            PetScreen {
                viewModel2.onItemSelected(it)
                navController.navigate(Screen.AppointmentBooking.name)
            }
        }
        composable(Screen.AppointmentBooking.name) {
            AppointmentBooking()
        }
        composable(Screen.AppointmentBooked.name) {
            AppointmentBooked(
                navigateBack = { /*TODO*/ },
                onDismissRequest = { /*TODO*/ },
                onConfirmation = { /*TODO*/ },
                dialogTitle = "Thank You!",
                dialogText = "Your submission has been received and the appointment has been confirmed. Please check your Email for further details",
                icon = Icons.Default.Check
            )
        }
    }
}