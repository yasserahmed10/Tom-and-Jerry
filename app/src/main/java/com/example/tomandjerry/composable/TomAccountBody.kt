package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.ui.theme.BackgroundColor

@Composable
fun TomAccountBody(
    scores: List<Score>,
    settingSections: List<SettingSection>
) {
    Column(
        modifier = Modifier
            .background(
                BackgroundColor,
                RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
            )
    ) {
        SpacerVertical23()

        ScoreList(scores)

        SpacerVertical24()

        SettingList(settingSections)
    }
}