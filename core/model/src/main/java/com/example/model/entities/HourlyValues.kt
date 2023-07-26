package com.example.model.entities

import com.google.gson.annotations.SerializedName

data class HourlyValues(
    @SerializedName("time")val time: List<String>,
    @SerializedName("temperature")val temperature: List<Double>,
    @SerializedName("weatherCode")val weatherCode: List<Int>
)