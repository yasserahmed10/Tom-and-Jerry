package com.example.tomandjerry.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.IBM
import com.example.tomandjerry.ui.theme.PrimaryColor

@Composable
fun CardTitle(title: String) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = title,
        fontFamily = IBM,
        fontSize = 18.sp,
        color = PrimaryColor,
        fontWeight = FontWeight.SemiBold,
        textAlign = TextAlign.Center,
        style = TextStyle(lineHeight = TextUnit.Unspecified)
    )
}