package com.example.network.api
import com.example.network.dto.DailyDto
import com.example.network.dto.HourlyDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IWeatherApiClient {


    @GET("forecast")
    suspend fun getHourlyWeatherForecast(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
        @Query("hourly") hourly: String= "hourly=temperature_2m,weathercode\n",
        @Query("timezone") timezone: String
    ): Response<HourlyDto>
        @GET("forecast")
       suspend fun getDailyWeatherForecast(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
        @Query("daily") daily: String="daily",
        @Query("timezone") timezone: String
    ): Response<DailyDto>
}