package com.example.tomandjerry.composable

import android.R.attr.fontWeight
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.BadgeBlue
import com.example.tomandjerry.ui.theme.IBM
import com.example.tomandjerry.ui.theme.PrimaryColor
import com.example.tomandjerry.ui.theme.TertiaryColor

@Composable
fun SectionHeader() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.Absolute.SpaceBetween
    ) {
        Text(text="Cheap tom section",
            fontFamily = IBM,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            color = PrimaryColor
        )
        Text(text = "View all →",
            fontFamily = IBM,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            color = BadgeBlue
        )
    }
}

@Preview
@Composable
fun SectionHeaderPreview(){
    SectionHeader()
}