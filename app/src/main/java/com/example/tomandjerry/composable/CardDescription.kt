package com.example.tomandjerry.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.IBM

@Composable
fun CardDescription(description: String) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = description,
        fontFamily = IBM,
        fontSize = 12.sp,
        color = Color(0xFF969799),
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Center,
        style = TextStyle(lineHeight = TextUnit.Unspecified)
    )
}