package com.example.weather.ui.hourly

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.model.entities.HourlyInfo
import com.example.weather.ui.hourly.daily.HourlyDataItem
import com.example.weather.ui.hourly.daily.mavenProFontFamily
import dagger.hilt.android.lifecycle.HiltViewModel


@Composable
fun HourlyWeatherScreen (viewModel: HourlyDataViewModel = hiltViewModel()){
        val data :HourlyInfo?= viewModel.hourlyData.value
    Box(modifier = Modifier.fillMaxSize(),
    ){
       data?.location?.placeName?.let{ placeName->
        Text(
            text =placeName,
            fontFamily = mavenProFontFamily(),
            fontWeight = FontWeight.Normal,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp),
        )}
            data?.hours?.forEach{hour->
           HourlyDataItem(hourItem = hour)
       }
    }
}