package com.example.model.entities

import com.google.gson.annotations.SerializedName

data class DailyData(
    @SerializedName("daily_units")val dailyUnits: DailyMu,
    @SerializedName("daily")val dailyValues: DailyValues
)