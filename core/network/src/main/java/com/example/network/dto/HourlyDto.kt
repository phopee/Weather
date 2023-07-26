package com.example.network.dto

import com.example.commons.WeatherCodes
import com.example.model.entities.Hour
import com.example.model.entities.HourlyMu
import com.example.model.entities.HourlyValues
import com.google.gson.annotations.SerializedName
import java.util.Date
import kotlin.time.Duration.Companion.hours

data class HourlyDto(
    @SerializedName("latitude")val latitude: Double,
    @SerializedName("longitude")val longitude: Double,
    @SerializedName("generationtime_ms")val generationtimeMs: Double,
    @SerializedName("utc_offset_seconds")val utcOffsetSeconds: Int,
    @SerializedName("timezone")val timezone: String,
    @SerializedName("timezone_abbreviation")val timezoneAbbreviation: String,
    @SerializedName("elevation")val elevation: Double,
    @SerializedName("hourly_units")val hourlyUnits: HourlyMu,
    @SerializedName("daily_units")val hourlyValues: HourlyValues,
)
fun HourlyDto.toHours():List<Hour>{
    val hourList = mutableListOf<Hour>()
    val combinedListOfTimeAndTempAndCode = hourlyValues.time.zip(hourlyValues.temperature).zip(hourlyValues.weatherCode)
    for ((timeTemp, weatherCode) in combinedListOfTimeAndTempAndCode) {
        val dateTime = Date.parse(timeTemp.first)
        val codeDescription= WeatherCodes.getByCode(weatherCode).description
        val myObject = Hour(dateTime.hours.toIsoString(), timeTemp.second, codeDescription)
        hourList.add(myObject)
    }
    return hourList
}