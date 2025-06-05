package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.IBM

@Composable
fun RowScope.ScoreCard(
    score: Score
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(score.backgroundColor)
            .weight(1f),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .padding(start = 12.dp, top = 8.dp, end = 10.dp, bottom = 8.dp)
                .size(40.dp),
            painter = painterResource(id = score.drawableRes),
            contentDescription = null,
        )

        Column(modifier = Modifier) {
            Text(
                modifier = Modifier,
                text = score.score,
                fontFamily = IBM,
                fontSize = 16.sp,
                color = Color(0xFF121212).copy(alpha = 0.6f),
                fontWeight = FontWeight.SemiBold,
                style = TextStyle(lineHeight = TextUnit.Unspecified, letterSpacing = 0.5.sp)
            )

            Text(
                modifier = Modifier,
                text = score.type,
                fontFamily = IBM,
                fontSize = 12.sp,
                color = Color(0xFF121212).copy(alpha = 0.37f),
                fontWeight = FontWeight.Medium,
                style = TextStyle(lineHeight = TextUnit.Unspecified, letterSpacing = 0.5.sp)
            )
        }
    }
}