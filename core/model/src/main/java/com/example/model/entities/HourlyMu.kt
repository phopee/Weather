package com.example.model.entities

import com.google.gson.annotations.SerializedName

data class HourlyMu(
    @SerializedName("time")val timeMu: String,
    @SerializedName("temperature_2m") val temperatureMu: String,
    @SerializedName("weathercode") val weathercode: String,
)
