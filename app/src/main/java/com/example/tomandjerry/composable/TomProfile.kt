package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.IBM

@Composable
fun TomProfile() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpacerVertical16()
        Image(
            modifier = Modifier
                .border(1.dp, Color(0xFF121212).copy(alpha = 0.15f), RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
                .size(64.dp),
            painter = painterResource(id = R.drawable.tom_infornt_mirror),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )

        SpacerVertical4()

        Text(
            modifier = Modifier,
            text = "Tom",
            fontFamily = IBM,
            fontSize = 18.sp,
            color = Color.White,
            fontWeight = FontWeight.Medium,
        )

        Text(
            modifier = Modifier,
            text = "specializes in failure!",
            fontFamily = IBM,
            fontSize = 12.sp,
            color = Color.White.copy(alpha = 0.8f),
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
        )

        SpacerVertical4()

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(40.dp))
                .background(Color.White.copy(alpha = 0.12f))
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Text(
                modifier = Modifier
                    .height(spToDp(14.4.sp))
                    .offset(y = (-0.1).dp),
                text = "Edit foolishness",
                fontFamily = IBM,
                fontSize = 10.sp,
                color = Color.White,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                style = TextStyle(lineHeight = TextUnit.Unspecified, letterSpacing = 0.0.sp)
            )
        }
    }
}