package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.spacer.SpacerVertical12
import com.example.tomandjerry.ui.theme.Roboto

@Composable
fun EpisodeInfo() {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(modifier = Modifier.weight(1.0f)) {
            Text(
                modifier = Modifier,
                text = "Deleted episodes of Tom and Jerry!",
                fontFamily = Roboto,
                fontSize = 18.sp,
                color = Color(0xFF1F1F1E).copy(alpha = 0.87f),
                fontWeight = FontWeight.SemiBold,
                style = TextStyle(lineHeight = 20.sp, letterSpacing = 0.25.sp)
            )

            SpacerVertical12()

            Text(
                modifier = Modifier,
                text = "Scenes that were canceled for... mysterious (and sometimes embarrassing) reasons.",
                fontFamily = Roboto,
                fontSize = 14.sp,
                color = Color(0xFF1F1F1E).copy(alpha = 0.60f),
                fontWeight = FontWeight.Normal,
                style = TextStyle(lineHeight = 20.sp, letterSpacing = 0.25.sp)
            )
        }

        Image(
            modifier = Modifier
                .width(112.dp)
                .height(178.dp),
            painter = painterResource(id = R.drawable.tom_and_jerry2),
            contentDescription = null,
        )
    }
}