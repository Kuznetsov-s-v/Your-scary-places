package com.bloodmoon.yourscaryplaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.ui.screens.planets.views.PlanetPageViewDisplay
import com.bloodmoon.yourscaryplaces.ui.screens.planets.views.PlanetsViewDisplay
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.components.PlanetCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YourScaryPlacesTheme(darkTheme = false, dynamicColor = false) {
/*                Column(
                    modifier = Modifier
                        .background(color = Color(0xFF1C1F1E))
                        .padding(top = 100.dp, start = 24.dp, end = 24.dp)
                    ){
                    PlanetCard(
                        label = "Ghost “Yenion”",
                        rating = 3,
                        imagePath = "file:///android_asset/Place1.jpg",
                        modifier = Modifier,
                    )
                    }*/
                //PlanetsViewDisplay()
                PlanetPageViewDisplay()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    YourScaryPlacesTheme {
        Greeting("Android")
    }
}