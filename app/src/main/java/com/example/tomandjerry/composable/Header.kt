package com.example.tomandjerry.composable

import android.R.attr.fontWeight
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.IBM
import com.example.tomandjerry.ui.theme.PrimaryColor
import com.example.tomandjerry.ui.theme.SecondaryColor

@Composable
fun RowScope.Header(
    title: String,
    subTitle: String,
    modifier: Modifier= Modifier
){
    Column(verticalArrangement = Arrangement.Center, modifier = modifier.weight(1f)
    ) {
        Text(text = title,
            color = PrimaryColor,
            fontFamily = IBM,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,

        )
        Text(text = subTitle,
            color = SecondaryColor,
            fontFamily = IBM,
            fontSize = 12.sp,
            fontWeight= FontWeight.Normal
        )
    }
}