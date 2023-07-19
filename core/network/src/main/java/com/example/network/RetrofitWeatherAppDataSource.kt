package com.example.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

private const val WEATHER_BASE_URL = "https://api.open-meteo.com/v1/"
private const val TIME_ZONE_API_KEY = "UC22B01YHHB5"
private const val TIME_ZONE_BASE_URL = "http://api.timezonedb.com/v2.1/"

@Singleton
class RetrofitWeatherAppDataSource {
    val weatherAPI: IWeatherApiClient by lazy {

        return@lazy Retrofit.Builder()
            .baseUrl(WEATHER_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(IWeatherApiClient::class.java)
    }
    val timezoneAPI: ITimeZoneApi by lazy {

        return@lazy Retrofit.Builder()
            .baseUrl(TIME_ZONE_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ITimeZoneApi::class.java)
    }
}