package com.example.model.entities

import com.google.gson.annotations.SerializedName

data class HourlyData (
    @SerializedName("hourlyUnits") val hourlyUnits: HourlyMu,
    @SerializedName("hourlyValues") val hourlyValues: HourlyValues
)