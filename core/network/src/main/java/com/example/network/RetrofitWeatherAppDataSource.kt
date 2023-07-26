package com.example.network

import com.example.commons.Constants
import com.example.network.api.ITimeZoneApi
import com.example.network.api.IWeatherApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton



@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideWeatherApi(): IWeatherApiClient{
        return Retrofit.Builder()
            .baseUrl(Constants.WEATHER_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(IWeatherApiClient::class.java)
    }
    @Provides
    @Singleton
    fun provideTimeZoneApi(): ITimeZoneApi {
        return Retrofit.Builder()
            .baseUrl(Constants.TIME_ZONE_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ITimeZoneApi::class.java)
    }
}