package com.example.tomandjerry.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ItemCardAvatar(@DrawableRes drawableRes: Int) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        painter = painterResource(id = drawableRes),
        contentDescription = "Profile Picture",
    )
}