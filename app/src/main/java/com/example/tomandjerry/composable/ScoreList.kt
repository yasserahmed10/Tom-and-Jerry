package com.example.tomandjerry.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScoreList(scores: List<Score>) {
    for (i in 0..scores.lastIndex step 2) {
        Row(modifier = Modifier.padding(horizontal = 16.dp)) {
            ScoreCard(scores[i])
            if (i <= scores.lastIndex) {
                SpacerHorizontal8()
                ScoreCard(scores[i + 1])
            }
        }
        if (i <= scores.lastIndex / 2)
            SpacerVertical8()
    }
}