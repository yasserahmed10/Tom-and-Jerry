package com.example.tomandjerry.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.Roboto

@Composable
fun BoxScope.EmojiReplacedWithImageText(
    content: String,
    postString: String,
    @DrawableRes drawableRes: Int
) {
    val emojiPlaceholderId = "emojiImage"

    val text = buildAnnotatedString {
        append(content)
        appendInlineContent(emojiPlaceholderId, "[emoji]")
        append(postString)
    }

    val inlineContent = mapOf(
        emojiPlaceholderId to InlineTextContent(
            Placeholder(
                width = 15.sp,
                height = 15.sp,
                placeholderVerticalAlign = PlaceholderVerticalAlign.Center
            )
        ) {
            Image(
                painter = painterResource(id = drawableRes),
                contentDescription = "Emoji",
                modifier = Modifier.fillMaxSize()
            )
        }
    )

    Text(
        modifier = Modifier
            .width(212.dp)
            .padding(horizontal = 8.dp, vertical = 12.dp)
            .align(Alignment.BottomStart),
        text = text,
        inlineContent = inlineContent,
        fontFamily = Roboto,
        fontSize = 14.sp,
        color = Color.White,
        fontWeight = FontWeight.SemiBold,
        style = TextStyle(lineHeight = 20.sp, letterSpacing = 0.25.sp)
    )
}