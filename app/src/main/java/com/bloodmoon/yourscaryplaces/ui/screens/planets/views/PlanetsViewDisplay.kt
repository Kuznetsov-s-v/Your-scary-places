package com.bloodmoon.yourscaryplaces.ui.screens.planets.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.R
import com.bloodmoon.yourscaryplaces.ui.theme.PlanetsViewDisplayTypography
import com.bloodmoon.yourscaryplaces.ui.theme.components.PlanetCard

@Composable
fun PlanetsViewDisplay(){
    Column(Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.onPrimary)
        .verticalScroll(rememberScrollState())
        .padding(top = 24.dp, start = 24.dp, end = 24.dp),
    horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.header_title).replace(" ","\n"),
            style = PlanetsViewDisplayTypography.bodyLarge,
            color = MaterialTheme.colorScheme.primary,
        )
        Spacer(modifier = Modifier.padding(bottom = 39.dp))
        PlanetCard(
            label = "Ghost “Yenion”",
            rating = 3,
            imagePath = "file:///android_asset/Place1.jpg",
            modifier = Modifier.padding(bottom = 24.dp),
        )
        Spacer(modifier = Modifier.padding(bottom = 24.dp))
        PlanetCard(
            label = "Destroyed platform",
            rating = 4,
            imagePath = "file:///android_asset/Place2.jpg",
            modifier = Modifier,
        )
        Spacer(modifier = Modifier.padding(bottom = 24.dp))
        PlanetCard(
            label = "Gold mine",
            rating = 5,
            imagePath = "file:///android_asset/Place3.jpg",
            modifier = Modifier.padding(bottom = 24.dp),
        )
    }
}