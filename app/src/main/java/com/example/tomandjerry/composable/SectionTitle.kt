package com.example.tomandjerry.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.BlackTextColor
import com.example.tomandjerry.ui.theme.IBM

@Composable
fun SectionTitle(title: String) {
    Text(
        modifier = Modifier.padding(horizontal = 16.dp),
        text = title,
        fontFamily = IBM,
        fontSize = 20.sp,
        color = BlackTextColor.copy(alpha = 0.87f),
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.0.sp
    )
}