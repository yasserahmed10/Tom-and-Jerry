package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.screen.SectionTitle
import com.example.tomandjerry.screen.Setting
import com.example.tomandjerry.screen.SettingSection

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