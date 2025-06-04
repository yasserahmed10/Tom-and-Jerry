package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RowScope.TomCard(
    title: String,
    description: String,
    drawableRes: Int,
    price: String,
    discount: Int,
    formatedPrice: String
) {
    Box(modifier = Modifier
        .height(219.dp)
        .weight(1f)
    ) {
        Box(modifier = Modifier
            .padding(top = 16.dp)
            .matchParentSize()
            .clip(RoundedCornerShape(8))
            .background(Color.White)) { }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(236.dp)
                .padding(start = 8.dp, end = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ItemCardAvatar(drawableRes)

            SpacerVertical8()

            CardTitle(title)

            CardDescription(description)

            SpacerVertical8()

        }
        Row(Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .align(Alignment.BottomCenter)) {
            ItemPriceCard(modifier = Modifier.weight(1f), backgroundColor = Color(0xFFE9F6FB),formatedPrice, discount,price)

            SpacerHorizontal8()

            AddToChartButton()
        }
        SpacerVertical8()
    }
}