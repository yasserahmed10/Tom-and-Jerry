package com.example.tomandjerry.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.IBM

@Composable
fun Category(@DrawableRes drawableRes: Int, content: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            modifier = Modifier.size(24.dp),
            painter = painterResource(id = drawableRes),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )

        SpacerHorizontal8()

        Text(
            modifier = Modifier,
            text = content,
            fontFamily = IBM,
            fontSize = 16.sp,
            color = Color.White.copy(alpha = 0.87f),
            fontWeight = FontWeight.Medium,
            style = TextStyle(lineHeight = TextUnit.Unspecified, letterSpacing = 0.5.sp)
        )
    }
}