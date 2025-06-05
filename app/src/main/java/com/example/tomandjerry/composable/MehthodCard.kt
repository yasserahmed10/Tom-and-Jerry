package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.IBM

@Composable
fun MethodCard(no: Int, name: String) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 18.dp)
                .height(37.dp)
                .background(Color.White, RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                .align(Alignment.Center),
        )

        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(37.dp)
                    .background(Color.White, CircleShape)
                    .border(1.dp, Color(0xFFD0E5F0), CircleShape)
            ) {

                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = no.toString(),
                    fontFamily = IBM,
                    fontSize = 12.sp,
                    color = Color(0xFF035587),
                    fontWeight = FontWeight.Medium,
                    style = TextStyle(lineHeight = TextUnit.Unspecified, letterSpacing = 0.5.sp)
                )
            }

            Text(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                text = name,
                fontFamily = IBM,
                fontSize = 14.sp,
                color = Color(0xFF121212).copy(alpha = 0.6f),
                fontWeight = FontWeight.Normal,
                style = TextStyle(lineHeight = TextUnit.Unspecified, letterSpacing = 0.5.sp)
            )
        }
    }
}