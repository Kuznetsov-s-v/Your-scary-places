package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun JetGradientButton(text: String, brush: Brush) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(brush, RoundedCornerShape(24.dp))
            .padding(vertical = 16.dp), contentAlignment = Alignment.Center
    ) {
        Text(text = text, color = Color.White)
    }
}

@Preview
@Composable
private fun ShowJetGradientButtonPreview() {
    MaterialTheme {
        JetGradientButton(
            text = "Send an application",
            brush = Brush.horizontalGradient(listOf(Color(0xFF1C1F1E), Color(0xFF804E4E)))
        )
    }
}