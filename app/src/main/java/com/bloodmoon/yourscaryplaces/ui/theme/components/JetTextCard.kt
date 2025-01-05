package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.R
import com.bloodmoon.yourscaryplaces.ui.theme.CustomTypography
import com.bloodmoon.yourscaryplaces.ui.theme.jetShape
import com.bloodmoon.yourscaryplaces.ui.theme.onSecondaryColor
import com.bloodmoon.yourscaryplaces.ui.theme.surfaceColor

@Composable
fun JetTextCard(
    label: String,
    value: String,
    modifier: Modifier
) {
    Box(
        modifier = modifier
            .background(
                color = surfaceColor,
                shape = jetShape.medium
            )
            .padding(start = 24.dp, end = 16.dp)
        ,contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = label,
                color = onSecondaryColor.copy(0.2f),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 8.dp, top = 8.dp),
                style = CustomTypography.titleLarge
                )
            Text(
                text = value,
                color = onSecondaryColor.copy(0.7f),
                textAlign = TextAlign.Left,
                style = CustomTypography.bodyLarge,
                modifier = Modifier.padding(start = 2.dp, end = 2.dp, bottom = 28.dp)
                )
        }
    }
}

@Preview(showBackground = false, locale = "en"/* , device = "spec:width=411dp,height=891dp" */)
@Composable
fun JetTextCardPreview(){
    JetTextCard(
        label = stringResource(R.string.description),
        value = stringResource(R.string.textDescription),
        Modifier
    )
}