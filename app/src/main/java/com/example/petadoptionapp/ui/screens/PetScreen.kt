package com.example.petadoptionapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.petadoptionapp.data.FakeRepository2
import com.example.petadoptionapp.data.Item2

@Composable
fun PetScreen(
    onItemSelected: (Item2) -> Unit,
) {
    val wishList1 = FakeRepository2().getItems()
    Column(modifier = Modifier.background(Color.hsl(2f, 0.8f, 0.79f))) {
        LazyColumn(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        )
        {
            item {
                Text(
                    text = "Dogs and Cats",
                    style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier.padding(start = 49.dp, bottom = 8.dp),
                    fontSize = 50.sp,
                    fontWeight = FontWeight.W400,
                    color = Color.Black
                )
            }
            items(wishList1) { item ->
                ItemCard1(
                    item = item
                ) { onItemSelected(item) }

            }
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ItemCard1(item: Item2, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
    ) {
        GlideImage(
            model = item.img,
            contentDescription = item.type,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.height(250.dp)
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = item.type)
            Text(text = item.website, style = MaterialTheme.typography.bodySmall)
        }
    }
}