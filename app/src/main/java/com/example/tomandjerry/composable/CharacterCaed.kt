package com.example.tomandjerry.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.spacer.SpacerVertical12
import com.example.tomandjerry.spacer.SpacerVertical8
import com.example.tomandjerry.ui.theme.IBM

@Composable
fun CharacterCard(
    name: String,
    description: String,
    @DrawableRes drawableRes: Int,
    backgroundColor: Color
) {
    Box(modifier = Modifier.width(140.dp)) {
        Box(
            modifier = Modifier
                .matchParentSize()
                .padding(top = 24.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(backgroundColor)
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(64.dp),
                painter = painterResource(id = drawableRes),
                contentDescription = null,
            )

            SpacerVertical8()

            Text(
                modifier = Modifier,
                text = name,
                fontFamily = IBM,
                fontSize = 18.sp,
                color = Color(0xFF1F1F1E).copy(alpha = 0.87f),
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                style = TextStyle(lineHeight = 20.sp, letterSpacing = 0.25.sp)
            )

            Text(
                modifier = Modifier,
                text = description,
                fontFamily = IBM,
                fontSize = 12.sp,
                color = Color(0xFF1F1F1E).copy(alpha = 0.6f),
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                style = TextStyle(lineHeight = 20.sp, letterSpacing = 0.25.sp)
            )

            SpacerVertical12()
        }
    }
}