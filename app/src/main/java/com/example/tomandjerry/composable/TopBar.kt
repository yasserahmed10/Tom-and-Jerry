package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R

@Composable
fun TopBar(iconBrush: Brush) {
    Box(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .border(0.5.dp, Color(0xFF1F1F1E).copy(alpha = 0.15f), RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
        ) {
            Image(
                modifier = Modifier.size(40.dp),
                painter = painterResource(id = R.drawable.tom_and_jerry),
                contentDescription = null,
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .size(40.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(brush = iconBrush)
                .shadow(
                    12.dp,
                    spotColor = Color(0xFF0D0608).copy(alpha = 0.12f),
                    ambientColor = Color(0xFF0D0608).copy(alpha = 0.12f)
                )
                .clipToBounds()
        ) {
            Image(
                modifier = Modifier
                    .size(20.dp)
                    .align(Alignment.Center),
                painter = painterResource(id = R.drawable.search_status),
                contentDescription = null,
            )
        }
    }
}