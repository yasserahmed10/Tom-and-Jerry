package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.tomandjerry.spacer.SpacerHorizontal4
import com.example.tomandjerry.ui.theme.IBM
import com.example.tomandjerry.ui.theme.Roboto

@Composable
fun Section() {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .weight(1.0f),
            text = "Most watched",
            fontFamily = Roboto,
            fontSize = 20.sp,
            color = Color(0xFF1F1F1E).copy(alpha = 0.87f),
            fontWeight = FontWeight.SemiBold,
            style = TextStyle(lineHeight = 20.sp, letterSpacing = 0.25.sp)
        )


        Text(
            text = "View all",
            fontFamily = IBM,
            fontSize = 12.sp,
            color = Color(0xFF035486),
            fontWeight = FontWeight.Medium,
        )

        SpacerHorizontal4()

        Image(
            modifier = Modifier.size(12.dp),
            painter = painterResource(id = R.drawable.arrow_right_04),
            contentDescription = "Ad Image",
        )
    }
}