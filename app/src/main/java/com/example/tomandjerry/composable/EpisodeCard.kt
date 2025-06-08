package com.example.tomandjerry.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R

@Composable
fun EpisodeCard(
    @DrawableRes drawableRes: Int,
    title: String,
    postString: String = "",
    @DrawableRes emojiDrawableRes: Int
) {
    val cardBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF000000).copy(alpha = 0.0f),
            Color(0xFF000000).copy(alpha = 0.80f),
        ),
    )

    Box {
        Image(
            modifier = Modifier
                .width(212.dp)
                .height(311.dp)
                .border(1.dp, Color(0xFF1F1F1E).copy(alpha = 0.15f), RoundedCornerShape(16.dp))
                .clip(RoundedCornerShape(16.dp)),
            painter = painterResource(id = drawableRes),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .matchParentSize()
                .background(brush = cardBrush),
        )

        Box(
            modifier = Modifier
                .padding(8.dp)
                .size(48.dp)
                .align(Alignment.TopEnd)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White.copy(alpha = 0.24f))
                .border(1.dp, Color.White.copy(0.5f), RoundedCornerShape(12.dp))
        ) {
            Image(
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.Center),
                painter = painterResource(id = R.drawable.cheese),
                contentDescription = null,
            )
        }

        EmojiReplacedWithImageText(title, postString, emojiDrawableRes)
    }
}