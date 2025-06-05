package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.spacer.SpacerVertical12
import com.example.tomandjerry.spacer.SpacerVertical8
import com.example.tomandjerry.ui.theme.DetailCardSubTitleColor
import com.example.tomandjerry.ui.theme.DetailCardTitleColor
import com.example.tomandjerry.ui.theme.IBM

@Composable
fun RowScope.DetailCard(title: String, subtitle: String, painter: Painter) {
    Box(
        modifier = Modifier
            .weight(1f)
            .background(Color(0xFFE1F0FF), shape = RoundedCornerShape(12.dp))
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painter, contentDescription = null, modifier = Modifier
                    .size(48.dp)
                    .padding(top = 12.dp), alignment = Alignment.Center
            )
            SpacerVertical12()
            Text(
                text = title,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                fontFamily = IBM,
                color = DetailCardTitleColor,
                textAlign = TextAlign.Center
            )
            Text(
                text = subtitle,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                fontFamily = IBM,
                color = DetailCardSubTitleColor,
                textAlign = TextAlign.Center
            )
            SpacerVertical8()
        }
    }
}