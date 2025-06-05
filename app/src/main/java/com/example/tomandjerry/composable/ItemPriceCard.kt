package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.spacer.SpacerHorizontal4
import com.example.tomandjerry.ui.theme.IBM
import com.example.tomandjerry.ui.theme.MainBlueColor

@Composable
fun ItemPriceCard(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    formatedPrice: String,
    discount: Int,
    price: String) {
    Row(
        modifier = modifier
            .height(30.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.size(16.dp),
            painter = painterResource(id = R.drawable.money),
            contentDescription = "Tom Price",
        )

        SpacerHorizontal4()

        Row(modifier = Modifier.padding(vertical = 6.dp)) {
            if (discount != 0) {
                Text(
                    text = price,
                    fontFamily = IBM,
                    fontSize = 12.sp,
                    color = MainBlueColor,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.LineThrough,
                    style = TextStyle(lineHeight = TextUnit.Unspecified)
                )

                SpacerHorizontal4()
            }

            Text(
                modifier = Modifier,
                text = formatedPrice,
                fontFamily = IBM,
                fontSize = 12.sp,
                color = MainBlueColor,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                style = TextStyle(lineHeight = TextUnit.Unspecified)
            )
        }
    }
}