package com.example.data.repository.Interfaces

import com.example.network.dto.DailyDto
import com.example.network.dto.HourlyDto

interface IWeatherDataRepository {
    suspend fun getHourlyWeatherForecast(latitude:Double, longitude:Double,timezone:String):HourlyDto?
    suspend fun getDailyWeatherForecast(latitude:Double, longitude:Double,timezone:String):DailyDto?
}