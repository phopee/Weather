package com.example.data.repository

import com.example.data.repository.Interfaces.IWeatherDataRepository
import com.example.network.api.IWeatherApiClient
import com.example.network.dto.DailyDto
import com.example.network.dto.HourlyDto
import javax.inject.Inject

class WeatherDataRepository @Inject constructor (private val api : IWeatherApiClient):IWeatherDataRepository{
    override suspend fun getHourlyWeatherForecast(latitude:Double, longitude:Double,timezone:String): HourlyDto? {
        return api.getHourlyWeatherForecast(latitude=latitude,longitude= longitude,timezone=timezone).body()
    }

    override suspend fun getDailyWeatherForecast(latitude:Double, longitude:Double,timezone:String): DailyDto? {
        return api.getDailyWeatherForecast(latitude=latitude,longitude= longitude,timezone=timezone).body()
    }
}