package com.example.tomandjerry.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.CharacterCard
import com.example.tomandjerry.composable.EpisodeCard
import com.example.tomandjerry.composable.EpisodeInfo
import com.example.tomandjerry.composable.Section
import com.example.tomandjerry.composable.TopBar
import com.example.tomandjerry.spacer.SpacerHorizontal12
import com.example.tomandjerry.spacer.SpacerHorizontal16
import com.example.tomandjerry.spacer.SpacerHorizontal24
import com.example.tomandjerry.spacer.SpacerHorizontal8
import com.example.tomandjerry.spacer.SpacerVertical12
import com.example.tomandjerry.spacer.SpacerVertical8
import com.example.tomandjerry.ui.theme.BackgroundColor
import com.example.tomandjerry.ui.theme.Roboto
import com.example.tomandjerry.ui.theme.SecretBackgroundColor

@Composable
fun SecretEpisodesScreens() {
    val episodesStateScroll = rememberScrollState()
    val charactersStateScroll = rememberScrollState()

    val brush = Brush.verticalGradient(
        colors = listOf(
            SecretBackgroundColor,
            SecretBackgroundColor,
            BackgroundColor,
            BackgroundColor,
        ),
    )
    val iconBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF0279CF),
            Color(0xFF015EA0),
        ),
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(episodesStateScroll)
            .background(brush = brush)
            .padding(vertical = 16.dp)
    ) {
        TopBar(iconBrush)

        SpacerVertical8()

        EpisodeInfo()

        SpacerVertical12()

        Section()

        SpacerVertical12()

        Row(
            Modifier
                .fillMaxWidth()
                .horizontalScroll(episodesStateScroll)
        ) {
            SpacerHorizontal16()
            EpisodeCard(
                R.drawable.tom_jerry1,
                "Number 404 - The Cursed Cheese ",
                "",
                R.drawable.cheese2
            )
            SpacerHorizontal12()
            EpisodeCard(
                R.drawable.tom_jerry2,
                "Chase on the moon ",
                "\n",
                R.drawable.full_moon
            )
            SpacerHorizontal16()
        }

        SpacerHorizontal24()

        Text(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = "Popular character",
            fontFamily = Roboto,
            fontSize = 20.sp,
            color = Color(0xFF1F1F1E).copy(alpha = 0.87f),
            fontWeight = FontWeight.SemiBold,
            style = TextStyle(lineHeight = 20.sp, letterSpacing = 0.25.sp)
        )

        SpacerVertical12()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(charactersStateScroll)
        ) {
            SpacerHorizontal16()
            CharacterCard("Tom", "Failed stalker", R.drawable.tom_face, Color(0xFFFCF2C5))
            SpacerHorizontal8()
            CharacterCard("Jerry", "A scammer mouse", R.drawable.jerry_face, Color(0xFFFCC5E4))
            SpacerHorizontal8()
            CharacterCard("Nibbles", "Hungry mouse", R.drawable.nibbles_face, Color(0xFFC5E7FC))
            SpacerHorizontal16()
        }

        SpacerVertical12()
    }
}

@Preview
@Composable
fun SecretEpisodesScreensPreview(){
    SecretEpisodesScreens()
}