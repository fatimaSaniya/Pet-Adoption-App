package com.example.petadoptionapp.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.petadoptionapp.ui.Screen
import com.example.petadoptionapp.ui.theme.PetAdoptionAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppointmentBooked(
    navigateBack: () -> Unit,
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
    dialogTitle: String,
    dialogText: String,
    icon: ImageVector,
) {
    AlertDialog(
        icon = { Icon(icon, contentDescription = null) },
        title = { Text(text = dialogTitle) },
        text = { Text(text = dialogText) },
        onDismissRequest = { onDismissRequest() },
        confirmButton = {
            TextButton(onClick = { onConfirmation() }) {
                Text("Confirm")
            }
        },
        dismissButton = {
            TextButton(onClick = { onDismissRequest() }) {
                Text("Dismiss")
            }
        }
    )
}

@Composable
fun onConfirmation() {
    var navigateBack = { Screen.AppointmentBooking.name }
}

@Composable
fun onDismissRequest() {
    var navigateBack = { Screen.AppointmentBooking.name }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopbar(navigateBack: () -> Unit) {
    TopAppBar(title = {
        Text(text = "", style = MaterialTheme.typography.displaySmall)
    }, navigationIcon = {
        IconButton(onClick = navigateBack) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
        }
    },
        colors = topAppBarColors(
        containerColor = MaterialTheme.colorScheme.onPrimary,
//)
        )
    )
}

@Preview
@Composable
fun AlertScreenPreview() {
    PetAdoptionAppTheme {
        AppointmentBooked(
            navigateBack = { Screen.AppointmentBooking.name },
            onDismissRequest = { /*TODO*/ },
            onConfirmation = { /*TODO*/ },
            dialogTitle = "Thank You!",
            dialogText = "Your submission has been received and the appointment has been confirmed. Please check your Email for further details",
            icon = Icons.Default.Check
        )
    }
}