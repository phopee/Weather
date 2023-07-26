package com.example.network.dto

import com.example.model.entities.DailyMu
import com.example.model.entities.DailyValues
import com.google.gson.annotations.SerializedName

data class DailyDto(
    @SerializedName("latitude")val latitude: Double,
    @SerializedName("longitude")val longitude: Double,
    @SerializedName("generationtime_ms")val generationtimeMs: Double,
    @SerializedName("utc_offset_seconds") val utcOffsetSeconds: Int,
    @SerializedName("timezone")val timezone: String,
    @SerializedName("timezone_abbreviation")val timezoneAbbreviation: String,
    @SerializedName("elevation")val elevation: Double,
    @SerializedName("daily_units")val dailyUnits: DailyMu,
    @SerializedName("daily")val dailyValues: DailyValues
    ){

}