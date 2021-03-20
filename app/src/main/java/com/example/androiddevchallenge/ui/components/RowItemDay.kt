package com.example.androiddevchallenge.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.github.javafaker.Faker


data class Weather(val temp: String, val desc: String) {
    companion object {
        fun fake() = with(Faker.instance().weather()) {
            Weather(temperatureCelsius(), description())
        }
    }
}


@Composable
fun RowItemDay() {

}


@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme(darkTheme = false) {
        RowItemDay()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        RowItemDay()
    }
}
