package com.example.tomandjerry.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.SpacerVertical200
import com.example.tomandjerry.composable.SpacerVertical8
import com.example.tomandjerry.composable.TomAccountBody
import com.example.tomandjerry.composable.TomProfile
import com.example.tomandjerry.composable.getScores
import com.example.tomandjerry.composable.getSettings
import com.example.tomandjerry.ui.theme.IBM

@Composable
fun TomAccount(){
    val scrollState = rememberScrollState()
    val scores = getScores()
    val settingSections = getSettings()
    Box(
        modifier = Modifier
    ) {
        SpacerVertical200()
        Image(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(id = R.drawable.rec1),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            alignment = Alignment.TopStart
        )
        Image(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(id = R.drawable.rec2),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            alignment = Alignment.TopStart
        )

        Column {
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                TomProfile()

                SpacerVertical8()

                TomAccountBody(scores, settingSections)

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "v.TomBeta",
                    fontFamily = IBM,
                    fontSize = 12.sp,
                    color = Color(0xFF121212).copy(alpha = 0.6f),
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}

@Preview
@Composable
fun TomAccountPreview(){
    TomAccount()
}