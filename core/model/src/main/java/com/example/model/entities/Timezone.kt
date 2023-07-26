package com.example.model.entities
import com.google.gson.annotations.SerializedName

data class TimeZoneItem(
    @SerializedName("countryCode") val countryCode: String,
    @SerializedName("countryName") val countryName: String,
    @SerializedName("zoneName") val zoneName: String,
    @SerializedName("gmtOffset") val gmtOffset: Int,
    @SerializedName("timestamp") val timestamp: Long
)