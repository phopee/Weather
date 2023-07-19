package com.example.model
import com.google.gson.annotations.SerializedName
data class TimeZoneResponse(
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String,
    @SerializedName("zones") val zones: List<TimeZoneItem>
)

data class TimeZoneItem(
    @SerializedName("countryCode") val countryCode: String,
    @SerializedName("countryName") val countryName: String,
    @SerializedName("zoneName") val zoneName: String,
    @SerializedName("gmtOffset") val gmtOffset: Int,
    @SerializedName("timestamp") val timestamp: Long
)