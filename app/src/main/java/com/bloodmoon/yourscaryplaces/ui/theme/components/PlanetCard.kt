package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.bloodmoon.yourscaryplaces.ui.theme.PlanetCardTypography

@Composable
fun PlanetCard(
    label: String,
    rating: Int,
    imagePath: String,
    modifier: Modifier,
){
    Column(
        Modifier,
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        AsyncImage(
            model = imagePath,
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(8f / 3f)
                .heightIn(min = 136.dp)
                .clip(RoundedCornerShape(32.dp))
                .border(3.dp, MaterialTheme.colorScheme.surface, RoundedCornerShape(32.dp)),
            contentScale = ContentScale.Crop
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(25.dp, 10.dp)
        ) {
            Text(
                text = label,
                style = PlanetCardTypography.bodyLarge,
                color = MaterialTheme.colorScheme.surface,
            )
            Spacer(modifier = Modifier.weight(1f))
            JetRatingBar(
                rating = rating,
                modifier = Modifier
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun PlanetCardPreview(){
    PlanetCard(
        label = "Ghost “Yenion”",
        rating = 3,
        imagePath = "file:///android_asset/Place1.jpg",
        modifier = Modifier,
    )
}