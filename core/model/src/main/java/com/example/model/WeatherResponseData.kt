package com.example.model

import com.google.gson.annotations.SerializedName

data class WeatherResponseData(
    @SerializedName("latitude")val latitude: Double,
    @SerializedName("longitude")val longitude: Double,
    @SerializedName("generationtime_ms")val generationtime_ms: Double,
    @SerializedName("utc_offset_seconds")val utc_offset_seconds: Int,
    @SerializedName("timezone")val timezone: String,
    @SerializedName("timezone_abbreviation")val timezone_abbreviation: String,
    @SerializedName("elevation")val elevation: Double,
    @SerializedName("hourly_units")val hourly_units: Units,
    @SerializedName("hourly")val hourly: HourlyData,
    @SerializedName("daily_units")val daily_units: Units,
    @SerializedName("daily")val daily: DailyData
)
