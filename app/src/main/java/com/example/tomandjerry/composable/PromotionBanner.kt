package com.example.tomandjerry.composable

import android.R.attr.contentDescription
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BadgeBlue
import com.example.tomandjerry.ui.theme.IBM
import com.example.tomandjerry.ui.theme.TertiaryColor

@Composable
fun PromotionBanner() {
    Box(
        modifier = Modifier.padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(bottomEnd = 16.dp))
            .clipToBounds()
    ) {
        AdDetail()


        Box(modifier = Modifier.matchParentSize()) {
            AddOvalsTry()

            Image(
                modifier = Modifier
                    .fillMaxHeight()
                    .offset(x = -2.dp, y = -1.dp)  // تضبيط أذن توم
                    .scale(1.05f)
                    .align(Alignment.BottomEnd),
                painter = painterResource(id = R.drawable.tom_promo),
                contentDescription = "Ad Image",
                contentScale = ContentScale.FillHeight
            )
        }

    }
}
@Composable
private fun AdDetail() {
    val brush = Brush.horizontalGradient(
        listOf(
            Color(0xFF03466d),
            Color(0xFF0685D0),
        )
    )

    Column(
        modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(brush = brush)
            .padding(12.dp),
    ) {
        Text(
            modifier = Modifier,
            text = "Buy 1 Tom and get 2 for free",
            fontFamily = IBM,
            fontSize = 16.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start,
            style = TextStyle(letterSpacing = 0.1.sp, lineHeight = TextUnit.Unspecified)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            modifier = Modifier,
            text = "Adopt Tom! (Free Fail-Free \nGuarantee)",
            fontFamily = IBM,
            fontSize = 12.sp,
            color = Color.White.copy(alpha = 0.8f),
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Start,
            style = TextStyle(letterSpacing = 0.1.sp, lineHeight = TextUnit.Unspecified)
        )
    }
}
@Composable
private fun BoxScope.AddOvalsTry() {
    Image(
        modifier = Modifier
            .fillMaxHeight()
            .padding(top = 16.dp)
            .offset((-3.5   ).dp, 15.dp)
            .scale(1.4f)
            .clip(RoundedCornerShape(bottomEnd = 16.dp))
            .align(Alignment.BottomEnd),
        painter = painterResource(id = R.drawable.oval),
        contentDescription = "Ad Image",
        contentScale = ContentScale.FillHeight
    )

    Image(
        modifier = Modifier
            .fillMaxHeight()
            .padding(top = 16.dp)
            .offset(5.dp, 17.dp)
            .scale(1.4f)
            .clip(RoundedCornerShape(bottomEnd = 16.dp))
            .align(Alignment.BottomEnd),
        painter = painterResource(id = R.drawable.oval2),
        contentDescription = "Ad Image",
        contentScale = ContentScale.FillHeight
    )
}
@Preview
@Composable
fun PromotionBannerPreview(){
    PromotionBanner()
}