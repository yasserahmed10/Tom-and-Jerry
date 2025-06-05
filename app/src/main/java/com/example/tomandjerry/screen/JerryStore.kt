package com.example.tomandjerry.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.spacer.SpacerVertical24
import com.example.tomandjerry.composable.FilterIcon
import com.example.tomandjerry.composable.Header
import com.example.tomandjerry.composable.NotificationIcon
import com.example.tomandjerry.composable.ProfileImage
import com.example.tomandjerry.composable.PromotionBanner
import com.example.tomandjerry.composable.SearchCard
import com.example.tomandjerry.composable.SectionHeader
import com.example.tomandjerry.spacer.SpacerHorizontal24
import com.example.tomandjerry.spacer.SpacerHorizontal8
import com.example.tomandjerry.spacer.SpacerVertical12
import com.example.tomandjerry.spacer.SpacerVertical16
import com.example.tomandjerry.spacer.SpacerVertical8
import com.example.tomandjerry.composable.TomCard
import com.example.tomandjerry.ui.theme.BackgroundColor

@Composable
fun JerryStore() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .verticalScroll(state = scrollState)
            .background(color = BackgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ProfileImage(painter = painterResource(id = R.drawable.profile_image))
            SpacerHorizontal8()
            Header(
                stringResource(R.string.hi_jerry),
                stringResource(R.string.which_tom_do_you_want_to_buy)
            )
            SpacerHorizontal24()
            NotificationIcon()
        }
        SpacerVertical12()
        Row(modifier = Modifier.fillMaxWidth()) {
            SearchCard(
                painterResource(id = R.drawable.search_icon),
                stringResource(R.string.search_about_tom)
            )
            SpacerHorizontal8()
            FilterIcon()
        }
        SpacerVertical8()
        PromotionBanner()
        SpacerVertical24()
        SectionHeader()
        SpacerVertical16()
        Row(modifier = Modifier.padding(horizontal = 16.dp)) {
            TomCard(
                "Sport Tom",
                "He runs 1 meter... trips over his boot.\n",
                R.drawable.sport_tom,
                "5",
                5,
                "3 cheeses"
            )
            SpacerHorizontal8()
            TomCard(
                "Tom the lover",
                "He loves one-sidedly... and is beaten by the other side.\n",
                R.drawable.tom_the_lover,
                "5",
                0,
                "5 cheeses"
            )
        }
        SpacerVertical12()
        Row(modifier = Modifier.padding(horizontal = 16.dp)) {
            TomCard(
                "Tom the bomb",
                "He blows himself up before Jerry can catch him.\n",
                R.drawable.tom_the_bomb,
                "10",
                0,
                "10 cheeses"
            )
            SpacerHorizontal8()
            TomCard(
                "Spy Tom",
                "Disguises itself as a table.\n" + "\n\n",
                R.drawable.spy_tom,
                "10",
                0,
                "12 cheeses"
            )
        }
        SpacerVertical12()
        Row(modifier = Modifier.padding(horizontal = 16.dp)) {
            TomCard(
                "Frozen Tom",
                "He was chasing Jerry, he froze after the first look\n" + "\n\n",
                R.drawable.frozen_tom,
                "10",
                0,
                "10 cheeses"
            )
            SpacerHorizontal8()
            TomCard(
                "Sleeping Tom",
                "He doesn't chase anyone, he just snores in stereo.\n",
                R.drawable.sleeping_tom,
                "10",
                0,
                "10 cheeses"
            )

        }

    }
}

@Preview()
@Composable
fun JerryStorePreview(){
    JerryStore()
}