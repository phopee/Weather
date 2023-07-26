package com.example.model.entities

import com.google.gson.annotations.SerializedName

data class HourlyInfo(
    val hours: List<Hour>,
    var location: GPSLocation?,

    ) {
}