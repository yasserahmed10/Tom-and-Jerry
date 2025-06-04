package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BlackTextColor
import com.example.tomandjerry.ui.theme.IBM
import com.example.tomandjerry.ui.theme.MainBlueColor

@Composable
fun NotificationIcon() {
    Box {
        Box(
            modifier = Modifier
                .padding(horizontal = 2.dp, vertical = 4.dp)
                .border(
                    1.dp,
                    BlackTextColor.copy(alpha = 0.15f),
                    RoundedCornerShape(12.dp)
                )
                .padding(8.dp),
        ) {
            Image(
                modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(12.dp)),
                painter = painterResource(id = R.drawable.notification_01),
                contentDescription = "Notification",
            )
        }

        Text(
            modifier = Modifier
                .size(spToDp(14.sp))
                .clip(CircleShape)
                .background(MainBlueColor)
                .align(Alignment.TopEnd),
            text = "3",
            fontFamily = IBM,
            fontSize = 10.sp,
            color = Color.White,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            style = TextStyle(lineHeight = 0.0.sp, letterSpacing = 0.0.sp)
        )
    }
}
@Composable
fun spToDp(sp: TextUnit): Dp {
    val density = LocalDensity.current
    return with(density) {
        val px = sp.toPx()              // Convert sp to pixels
        val rawDp = px / density.density        // Convert px to dp (ignores fontScale)
        rawDp.dp
    }
}