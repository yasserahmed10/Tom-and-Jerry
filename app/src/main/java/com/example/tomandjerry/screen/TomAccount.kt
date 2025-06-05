package com.example.tomandjerry.screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.SpacerVertical24
import com.example.tomandjerry.composable.SpacerHorizontal8
import com.example.tomandjerry.composable.SpacerVertical12
import com.example.tomandjerry.composable.SpacerVertical16
import com.example.tomandjerry.composable.SpacerVertical200
import com.example.tomandjerry.composable.SpacerVertical23
import com.example.tomandjerry.composable.SpacerVertical4
import com.example.tomandjerry.composable.SpacerVertical8
import com.example.tomandjerry.composable.spToDp
import com.example.tomandjerry.ui.theme.BackgroundColor
import com.example.tomandjerry.ui.theme.BlackTextColor
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

@Composable
 fun TomProfile() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpacerVertical16()
        Image(
            modifier = Modifier
                .border(1.dp, Color(0xFF121212).copy(alpha = 0.15f), RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
                .size(64.dp),
            painter = painterResource(id = R.drawable.tom_infornt_mirror),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )

        SpacerVertical4()

        Text(
            modifier = Modifier,
            text = "Tom",
            fontFamily = IBM,
            fontSize = 18.sp,
            color = Color.White,
            fontWeight = FontWeight.Medium,
        )

        Text(
            modifier = Modifier,
            text = "specializes in failure!",
            fontFamily = IBM,
            fontSize = 12.sp,
            color = Color.White.copy(alpha = 0.8f),
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
        )

        SpacerVertical4()

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(40.dp))
                .background(Color.White.copy(alpha = 0.12f))
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Text(
                modifier = Modifier
                    .height(spToDp(14.4.sp))
                    .offset(y = -0.1.dp),
                text = "Edit foolishness",
                fontFamily = IBM,
                fontSize = 10.sp,
                color = Color.White,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                style = TextStyle(lineHeight = TextUnit.Unspecified, letterSpacing = 0.0.sp)
            )
        }
    }
}


@Composable
 fun SettingList(settingSections: List<SettingSection>) {
    settingSections.forEachIndexed() { index, section ->
        SectionTitle(section.title)

        SpacerVertical8()

        section.settings.forEachIndexed { sectionIndex, setting ->
            Setting(setting)
            SpacerVertical12()
        }

        if (index != settingSections.lastIndex) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF1A1F14).copy(alpha = 0.08f))
                    .height(1.dp)
            )
        }

        SpacerVertical12()
    }
}

@Composable
 fun Setting(setting: Setting) {
    Row(
        modifier = Modifier.padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color.White)
        ) {
            Image(
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.Center),
                painter = painterResource(id = setting.drawableRes),
                contentDescription = null,
            )
        }

        SpacerHorizontal8()

        Text(
            modifier = Modifier,
            text = setting.title,
            fontFamily = IBM,
            fontSize = 16.sp,
            color = Color(0xFF1F1F1E).copy(alpha = 0.87f),
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            letterSpacing = 0.0.sp
        )
    }
}

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

@Composable
 fun SectionTitle(title: String) {
    Text(
        modifier = Modifier.padding(horizontal = 16.dp),
        text = title,
        fontFamily = IBM,
        fontSize = 20.sp,
        color = BlackTextColor.copy(alpha = 0.87f),
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.0.sp
    )
}
data class Score(
    val score: String,
    val type: String,
    val backgroundColor: Color,
    @DrawableRes val drawableRes: Int
)
data class Setting(
    val title: String,
    @DrawableRes val drawableRes: Int
)
@Composable
fun RowScope.ScoreCard(
    score: Score
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(score.backgroundColor)
            .weight(1f),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .padding(start = 12.dp, top = 8.dp, end = 10.dp, bottom = 8.dp)
                .size(40.dp),
            painter = painterResource(id = score.drawableRes),
            contentDescription = null,
        )

        Column(modifier = Modifier) {
            Text(
                modifier = Modifier,
                text = score.score,
                fontFamily = IBM,
                fontSize = 16.sp,
                color = Color(0xFF121212).copy(alpha = 0.6f),
                fontWeight = FontWeight.SemiBold,
                style = TextStyle(lineHeight = TextUnit.Unspecified, letterSpacing = 0.5.sp)
            )

            Text(
                modifier = Modifier,
                text = score.type,
                fontFamily = IBM,
                fontSize = 12.sp,
                color = Color(0xFF121212).copy(alpha = 0.37f),
                fontWeight = FontWeight.Medium,
                style = TextStyle(lineHeight = TextUnit.Unspecified, letterSpacing = 0.5.sp)
            )
        }
    }
}
data class SettingSection(
    val title: String,
    val settings: List<Setting>,
)
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

fun getSettings(): List<SettingSection> {
    return listOf(
        SettingSection(
            title = "Tom settings",
            settings = listOf(
                Setting("Change sleeping place", R.drawable.bed_single_02),
                Setting("Meow settings", R.drawable.cat),
                Setting("Password to open the fridge", R.drawable.fridge),
            )
        ),
        SettingSection(
            "His favorite foods",
            listOf(
                Setting("Mouses", R.drawable.alert_01),
                Setting("Last stolen meal", R.drawable.hamburger_02),
                Setting("Change sleep mood", R.drawable.sleeping),
            )
        )
    )
}