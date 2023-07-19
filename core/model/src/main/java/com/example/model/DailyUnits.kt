package com.example.model

data class DailyUnits(
    val time: String,
    val temperature_2m_max: String,
    val temperature_2m_min: String,
    val sunrise: String,
    val sunset: String,
    val uv_index_max: String,
    val precipitation_probability_max: String
)