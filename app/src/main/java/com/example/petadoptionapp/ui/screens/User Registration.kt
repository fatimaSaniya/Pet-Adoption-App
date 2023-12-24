package com.example.petadoptionapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.petadoptionapp.R
import com.example.petadoptionapp.ui.Screen

@Composable
fun UserRegistration(navController: NavController) {
    Column(modifier = Modifier.background(Color.hsl(2f, 0.8f, 0.79f))) {

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.hsl(2f, 0.9f, 0.9f)
            ),
            modifier = Modifier
                .fillMaxWidth(1f)
                .size(70.dp)
                .padding(start = 25.dp, top = 20.dp, end = 25.dp)
        ) {
            Text(
                text = "Ready for a new Pet!",
                modifier = Modifier.padding(top = 3.dp, start = 50.dp),
                fontSize = 33.sp,
                fontWeight = FontWeight.W700,
                color = Color.Black
            )
        }

        Text(
            text = "User Registration Form",
            modifier = Modifier.padding(top = 50.dp, start = 50.dp, bottom = 15.dp),
            fontSize = 33.sp,
            fontWeight = FontWeight.W900,
            color = Color.Black
        )
        var text1 by remember { mutableStateOf("") }
        var text2 by remember { mutableStateOf("") }
        var text3 by remember { mutableStateOf("") }
        var text4 by remember { mutableStateOf("") }
        TextField(value = text1,
            onValueChange = { text1 = it },
            label = { Text("Enter your name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null
                )
            }
        )
        TextField(value = text2,
            onValueChange = { text2 = it },
            label = { Text("Enter your Address") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) }
        )
        TextField(value = text3,
            onValueChange = { text3 = it },
            label = { Text("Enter your Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) }
        )
        TextField(value = text4,
            onValueChange = { text4 = it },
            label = { Text("Enter your Contact no.") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = null) }
        )


        FilledTonalButton(
            onClick = { navController.navigate(Screen.CenterScreen.name) },
            modifier = Modifier.padding(start = 157.dp, top = 23.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.hsl(2f, 0.1f, 0.9f))
        ) {
            Text(
                text = "SUBMIT",
            )
        }

        Image(
            painter = painterResource(id = R.drawable.adoptimg), contentDescription = null,
            modifier = Modifier.padding(start = 88.dp, top = 35.dp)
        )
    }
}