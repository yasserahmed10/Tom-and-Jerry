package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R

@Composable
fun ProfileImage(
    painter: Painter,
    modifier: Modifier= Modifier,
    size:Int=48
){
    Image(painter =painter,
        contentDescription = stringResource(R.string.profile_image),
        modifier= modifier
            .clip(RoundedCornerShape(12.dp))
            .size(size.dp))
}