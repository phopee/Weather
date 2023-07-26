package com.example.network

import retrofit2.http.Query

interface IWeatherDataSource {
    suspend fun getHourlyWeatherForecast( latitude: Double,longitude: Double,  hourly: String= "hourly", timezone: String)
    suspend fun getDailyWeatherForecast(  latitude: Double,longitude: Double,  daily: String= "daily", timezone: String)
}