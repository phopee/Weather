package com.example.weather

sealed class Screen(val route: String) {
    object HourlyWeatherScreen: Screen("hourly_weather_screen")
    object DailyWeatherScreen: Screen("daily_weather_screen")
}