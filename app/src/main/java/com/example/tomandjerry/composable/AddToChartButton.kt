package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.MainBlueColor

@Composable
fun AddToChartButton() {
    Box(
        modifier = Modifier
            .size(30.dp)
            .border(1.dp, MainBlueColor, RoundedCornerShape(8.dp)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.size(16.dp),
            painter = painterResource(id = R.drawable.basket),
            contentDescription = "Profile Picture",
        )
    }
}