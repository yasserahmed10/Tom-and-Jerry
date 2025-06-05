package com.example.tomandjerry.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.Category
import com.example.tomandjerry.composable.DetailCard
import com.example.tomandjerry.composable.ItemPriceCard
import com.example.tomandjerry.composable.MethodCard
import com.example.tomandjerry.spacer.SpacerHorizontal8
import com.example.tomandjerry.spacer.SpacerVertical16
import com.example.tomandjerry.ui.theme.IBM
import com.example.tomandjerry.ui.theme.PastaDesColor
import com.example.tomandjerry.ui.theme.PrimaryColor

@Composable
fun TomKitchen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clipToBounds()
                .background(Color(0xFF79a4bd))
        ) {
            Image(
                modifier = Modifier.offset((0).dp, (-40).dp),
                painter = painterResource(id = R.drawable.back_shape),
                contentDescription = "Tom Price",
                contentScale = ContentScale.FillHeight
            )
        }
        val scrollState = rememberScrollState()
        Box(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(state = scrollState)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {

                // Top section with background and pasta image
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                ) {
                    Column(modifier = Modifier.padding(top = 40.dp, start = 16.dp)) {
                        Category(R.drawable.ruler, "High tension")
                        SpacerVertical16()
                        Category(R.drawable.chef, "Shocking foods")
                    }


                }

                // Card section below image

                Card(
                    modifier = Modifier
                        .padding(bottom = 60.dp)
                        .fillMaxSize()
                        .offset(y = (-20).dp),
                    colors = CardDefaults.cardColors(Color(0xFFEEF4F6)),
                    shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {

                        Spacer(modifier = Modifier.height(24.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                "Electric Tom pasta",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium,
                                fontFamily = IBM
                            )

                        }

                        Box(modifier = Modifier.fillMaxWidth()) {
                            Image(painterResource(id = R.drawable.favorite_icon), null, modifier = Modifier.align(
                                Alignment.TopEnd))
                            ItemPriceCard(
                                modifier = Modifier.padding(top=8.dp),
                                backgroundColor = Color(0xFFE9F6FB),
                                "5 cheeses",
                                0,
                                "0"
                            )
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                            color = PastaDesColor,
                            fontFamily = IBM,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Text(
                            "Details",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            fontFamily = IBM
                        )
                        Spacer(modifier = Modifier.height(12.dp))

                        // 3 Detail Cards
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            DetailCard(
                                title = "1000 V",
                                subtitle = "Temperature",
                                painter = painterResource(R.drawable.temperature)
                            )
                            SpacerHorizontal8()
                            DetailCard(
                                title = "3 sparks",
                                subtitle = "Time",
                                painter = painterResource(R.drawable.timer_02)
                            )
                            SpacerHorizontal8()
                            DetailCard(
                                title = "1M 12K",
                                subtitle = "No. of deaths",
                                painter = painterResource(R.drawable.evil)
                            )
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Text(
                            "Preparation method",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            fontFamily = IBM
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        listOf(
                            "Put the pasta in a toaster.",
                            "Pour battery juice over it.",
                            "Wait for the spark to ignite.",
                            "Serve with an insulating glove.",
                        ).forEachIndexed { index, method ->
                            MethodCard(index + 1, method)
                            Spacer(modifier = Modifier.height(10.dp))
                        }
                    }
                }


            }

            Image(
                painter = painterResource(id = R.drawable.pizza2), // Your pasta image
                contentDescription = "Pasta",
                modifier = Modifier
                    .padding(top = 18.dp, end = 24.19.dp)
                    .size(height = 168.dp, width = 178.dp)
                    .align(Alignment.TopEnd)
            )
        }
            // Add to cart box
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .border(1.dp, color = PrimaryColor.copy(alpha = 0.12f))
                .background(Color.White)
                .padding(vertical = 16.dp, horizontal = 16.dp)
                .background(Color(0xFF1E6091), RoundedCornerShape(16.dp))
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Add to cart",
                    color = Color.White.copy(alpha = 0.87f),
                    fontWeight = FontWeight.Medium,
                    fontFamily = IBM,
                    fontSize = 16.sp
                )
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .clip(shape = CircleShape)
                        .background(Color.White.copy(alpha = 0.38f))
                        .size(5.dp)
                )
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        "3 cheeses",
                        color = Color.White,
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        "5 cheeses",
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.White.copy(alpha = 0.8f),
                        textDecoration = TextDecoration.LineThrough
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun TomKitchenPreview(){
    TomKitchen()
}