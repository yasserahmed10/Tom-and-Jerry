package com.example.tomandjerry.composable

import com.example.tomandjerry.R

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