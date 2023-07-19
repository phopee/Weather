package com.example.network
import com.example.model.DailyResponseData
import com.example.model.WeatherResponseData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IWeatherApiClient {


    @GET("forecast")
    suspend fun getHourlyWeatherForecast(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
        @Query("hourly") hourly: String= "hourly",
        @Query("timezone") timezone: String
    ): Response<WeatherResponseData>
        @GET("forecast")
       suspend fun getDailyWeatherForecast(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
        @Query("daily") daily: String="daily",
        @Query("timezone") timezone: String
    ): Response<DailyResponseData>
}