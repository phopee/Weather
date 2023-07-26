package com.example.weather.ui.hourly.daily

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.model.entities.Hour
import com.example.model.entities.HourlyInfo

@Composable
fun HourlyDataItem(
    hourItem: Hour
) {
    Column {
        Text(
            text = hourItem.description,
            fontFamily = mavenProFontFamily(),
            fontWeight = FontWeight.Normal,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp),
            )
        Text(text = hourItem.temperature.toString(),
            fontFamily = mavenProFontFamily(),
            fontWeight = FontWeight.Normal,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp))

        Text(text = hourItem.time,
            fontFamily = mavenProFontFamily(),
            fontWeight = FontWeight.Normal,
            color = Color.DarkGray,
            textAlign = TextAlign.Center ,
            modifier = Modifier.padding(10.dp))
    }

}
@Composable
fun mavenProFontFamily():FontFamily {
    // [START android_compose_text_multiple_fonts_styles]
    val mavenProFamily = FontFamily(
        Font(com.example.commons.R.font.maven_pro, FontWeight.Normal),
        Font(com.example.commons.R.font.mavenpro_bold, FontWeight.Bold),
        Font(com.example.commons.R.font.mavenpro_regular, FontWeight.Normal)
    )
    // [END android_compose_text_multiple_fonts_styles]
    return mavenProFamily
}

