package com.example.tomandjerry.composable

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Score(
    val score: String,
    val type: String,
    val backgroundColor: Color,
    @DrawableRes val drawableRes: Int
)