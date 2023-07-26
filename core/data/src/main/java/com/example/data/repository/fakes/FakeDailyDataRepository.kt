package com.example.data.repository.fakes

import com.example.data.repository.Interfaces.IWeatherDataRepository
import com.example.network.dto.DailyDto
import com.example.network.dto.HourlyDto

class FakeWeatherDataRepository :IWeatherDataRepository{
    override suspend fun getHourlyWeatherForecast(latitude:Double, longitude:Double,timezone:String):HourlyDto? {
        TODO("Not yet implemented")
    }

    override suspend fun getDailyWeatherForecast(latitude:Double, longitude:Double,timezone:String): DailyDto? {
        TODO("Not yet implemented")
    }

}

