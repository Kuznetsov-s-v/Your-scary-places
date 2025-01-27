package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme
import com.microsoft.fluent.mobile.icons.R.drawable


@Composable
fun JetIconButton(
    vectorDrawableId: Int,
    modifier: Modifier,
    shape: RoundedCornerShape,
    contentPadding: PaddingValues,
){
    Box(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.onSurface, shape = shape)
            .clip(shape = shape)
            .clickable{ println("!") }
            .padding(contentPadding)
    ){
        Icon (
            painter = painterResource(id = vectorDrawableId),
            contentDescription = "Icon button",
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFEEF4F3)
@Composable
fun JetIconButtonPreview() {
    YourScaryPlacesTheme(darkTheme = false, dynamicColor = false, ) {
        JetIconButton(
            vectorDrawableId = drawable.ic_fluent_chevron_left_16_filled,
            modifier = Modifier.size(48.dp),
            shape = RoundedCornerShape(CornerSize(8.dp)),
            contentPadding = PaddingValues(12.dp)
        )
    }
}
