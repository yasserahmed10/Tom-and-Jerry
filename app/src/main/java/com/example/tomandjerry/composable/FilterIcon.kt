package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.MainBlueColor

@Composable
fun FilterIcon(
){
    Box(
        modifier = Modifier.padding(end = 16.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(MainBlueColor)
            .padding(12.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.filter_horizontal),
            contentDescription = "filter",
            modifier = Modifier.size(24.dp),
        )
    }
}