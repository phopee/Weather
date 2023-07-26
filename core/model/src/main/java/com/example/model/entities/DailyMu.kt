package com.example.model.entities

import com.google.gson.annotations.SerializedName

data class DailyMu (
    @SerializedName("time") val timeMu: String,
    @SerializedName("temperature_2m_max") val temperatureMaxMu: String,
    @SerializedName("temperature_2m_min") val temperatureMinMu: String,
    @SerializedName("sunrise") val sunriseMu: String,
    @SerializedName("sunset") val sunsetMu: String,
    @SerializedName("uv_index_max") val uvIndexMaxMu: String,
    @SerializedName("precipitation_probability_max") val precipitationProbabilityMaxMu: String
    )
