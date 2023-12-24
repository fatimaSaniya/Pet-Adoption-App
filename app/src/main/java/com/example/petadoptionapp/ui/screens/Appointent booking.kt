package com.example.petadoptionapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.petadoptionapp.ui.Screen
import com.example.petadoptionapp.ui.theme.PetAdoptionAppTheme

@Composable
fun AppointmentBooking(
) {
    Column(modifier = Modifier.background(Color.hsl(2f, 0.8f, 0.79f))) {
        Text(
            text = "Appointment Booking",
            fontSize = 33.sp,
            fontWeight = FontWeight.W900,
            modifier = Modifier.padding(56.dp),
            color = Color.Black
        )
        var text1 by remember { mutableStateOf("") }
        var text2 by remember { mutableStateOf("") }
        var text3 by remember { mutableStateOf("") }
        var text4 by remember { mutableStateOf("") }
        var text5 by remember { mutableStateOf("") }
        var text6 by remember { mutableStateOf("") }

        TextField(value = text1,
            onValueChange = { text1 = it },
            label = { Text("Name of the pet you are interested in:") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Info, contentDescription = null) }
        )
        TextField(value = text2,
            onValueChange = { text2 = it },
            label = { Text("Your Full Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = null) }
        )
        TextField(value = text3,
            onValueChange = { text3 = it },
            label = { Text("Your Age:") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.DateRange, contentDescription = null) }
        )
        TextField(value = text4,
            onValueChange = { text4 = it },
            label = { Text("Your Address:") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) }
        )
        TextField(value = text5,
            onValueChange = { text5 = it },
            label = { Text("Contact No:") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = null) }
        )
        TextField(value = text6,
            onValueChange = { text6 = it },
            label = { Text("Email:") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) }
        )
        var isSubmit by rememberSaveable {
            mutableStateOf(false)
        }
        FilledTonalButton(
            onClick = { isSubmit = true },
            modifier = Modifier.padding(start = 150.dp, top = 43.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.hsl(2f, 0.1f, 0.9f))
        ) {
            Text(
                text = "SUBMIT",
            )
        }
        if (isSubmit) {
            AppointmentBooked(
                navigateBack = { Screen.AppointmentBooking.name },
                onDismissRequest = { /*TODO*/ },
                onConfirmation = { /*TODO*/ },
                dialogTitle = "Thank you!",
                dialogText = "Your submission has been received and the appointment has been confirmed. Please check your Email for further details",
                icon = Icons.Default.Check
            )
        }
    }
}

@Preview
@Composable
fun AppointmentBookingPreview() {
    PetAdoptionAppTheme {
        AppointmentBooking()
    }
}
