package com.example.network.dto

import com.example.model.entities.TimeZoneItem
import com.google.gson.annotations.SerializedName

data class TimeZoneDto(
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String,
    @SerializedName("zones") val zones: List<TimeZoneItem>
)