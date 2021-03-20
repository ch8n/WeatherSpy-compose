package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.components.Weather
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f),
            contentAlignment = Alignment.BottomStart
        ) {

            val weatherState = remember { mutableStateOf(Weather.fake()) }

            Row {
                Text(text = weatherState.value.temp)
                Text(text = weatherState.value.desc)
            }

        }

        Box {

        }


    }
}


@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme(darkTheme = false) {
        HomeScreen()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        HomeScreen()
    }
}
