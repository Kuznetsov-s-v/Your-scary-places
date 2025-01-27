package com.bloodmoon.yourscaryplaces.ui.screens.planets.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.ui.theme.PlanetsViewDisplayTypography
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetGradientButton
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetIconButton
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetTextCard
import com.bloodmoon.yourscaryplaces.ui.theme.components.PlanetCard
import com.microsoft.fluent.mobile.icons.R

@Composable
fun PlanetPageViewDisplay(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.onPrimary)
            .verticalScroll(rememberScrollState())
            .padding(24.dp)
    ){
        JetIconButton(
            vectorDrawableId = R.drawable.ic_fluent_chevron_left_16_filled,
            modifier = Modifier.size(48.dp),
            shape = RoundedCornerShape(CornerSize(8.dp)),
            contentPadding = PaddingValues(12.dp)
        )
        Spacer(Modifier.padding(vertical = 24.dp))
        Text(
            text = "Ghost “Yenion”",
            style = PlanetsViewDisplayTypography.bodyLarge,
            color = MaterialTheme.colorScheme.primary,
        )
        Spacer(Modifier.padding(24.dp))
        PlanetCard(
            label = "Ghost “Yenion”",
            rating = 3,
            imagePath = "file:///android_asset/Place1.jpg",
            modifier = Modifier,
        )
        Spacer(Modifier.padding(vertical = 24.dp))
        JetTextCard(
            label = stringResource(com.bloodmoon.yourscaryplaces.R.string.description),
            value = stringResource(com.bloodmoon.yourscaryplaces.R.string.textDescription),
            Modifier
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ) {
            JetGradientButton(
                text = stringResource(com.bloodmoon.yourscaryplaces.R.string.send_application),
                brush = Brush.horizontalGradient(listOf(Color(0xFF1C1F1E), Color(0xFF804E4E)))
            )
        }
    }
}


@Preview(showBackground = false)
@Composable
fun PlanetCardPreview(){
    YourScaryPlacesTheme(darkTheme = false, dynamicColor = false) {
        PlanetPageViewDisplay()
    }
}