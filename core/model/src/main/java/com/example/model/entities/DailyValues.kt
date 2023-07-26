package com.example.model.entities

import com.google.gson.annotations.SerializedName

data class DailyValues(
   @SerializedName("time") val time: List<String>,
   @SerializedName("temperature_2m_max") val temperatureMax: List<String>,
   @SerializedName("temperature_2m_min") val temperatureMin: List<String>,
   @SerializedName("sunrise") val sunrise: List<String>,
   @SerializedName("sunset") val sunset: List<String>,
   @SerializedName("uv_index_max") val uvIndexMax: List<String>,
   @SerializedName("precipitation_probability_max") val precipitationProbabilityMax: List<String>
)