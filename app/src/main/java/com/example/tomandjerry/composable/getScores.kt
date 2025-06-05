package com.example.tomandjerry.composable

import androidx.compose.ui.graphics.Color
import com.example.tomandjerry.R
import com.example.tomandjerry.screen.Score

fun getScores(): List<Score> {
    return listOf(
        Score(
            "2M 12K",
            "No. of quarrels",
            Color(0xFFD0E5F0),
            R.drawable.stat_icon_container
        ),
        Score(
            "+500 h",
            "Chase time",
            Color(0xFFDEEECD),
            R.drawable.stat_icon_container2
        ),
        Score(
            "2M 12K",
            "Hunting times",
            Color(0xFFF2D9E7),
            R.drawable.stat_icon_container3
        ),
        Score(
            "3M 7K",
            "Heartbroken",
            Color(0xFFFAEDCF),
            R.drawable.stat_icon_container4
        )
    )
}