package com.example.commons

enum class WeatherCodes(val code:Int,val description :String) {
    CLEAR_SKY(0, "Clear sky"),
    MAINLY_CLEAR(1, "Mainly clear"),
    PARTLY_CLOUDY(2, "Partly cloudy"),
    OVERCAST(3, "Overcast"),
    FOG_AND_DEPOSITING_RIME_FOG(45, "Fog and depositing rime fog"),
    DRIZZLE_LIGHT(51, "Drizzle: Light intensity"),
    DRIZZLE_MODERATE(53, "Drizzle: Moderate intensity"),
    DRIZZLE_DENSE(55, "Drizzle: Dense intensity"),
    FREEZING_DRIZZLE_LIGHT(56, "Freezing Drizzle: Light intensity"),
    FREEZING_DRIZZLE_DENSE(57, "Freezing Drizzle: Dense intensity"),
    RAIN_SLIGHT(61, "Rain: Slight intensity"),
    RAIN_MODERATE(63, "Rain: Moderate intensity"),
    RAIN_HEAVY(65, "Rain: Heavy intensity"),
    FREEZING_RAIN_LIGHT(66, "Freezing Rain: Light intensity"),
    FREEZING_RAIN_HEAVY(67, "Freezing Rain: Heavy intensity"),
    SNOW_FALL_SLIGHT(71, "Snow fall: Slight intensity"),
    SNOW_FALL_MODERATE(73, "Snow fall: Moderate intensity"),
    SNOW_FALL_HEAVY(75, "Snow fall: Heavy intensity"),
    SNOW_GRAINS(77, "Snow grains"),
    RAIN_SHOWERS_SLIGHT(80, "Rain showers: Slight intensity"),
    RAIN_SHOWERS_MODERATE(81, "Rain showers: Moderate intensity"),
    RAIN_SHOWERS_VIOLENT(82, "Rain showers: Violent intensity"),
    SNOW_SHOWERS_SLIGHT(85, "Snow showers: Slight intensity"),
    SNOW_SHOWERS_HEAVY(86, "Snow showers: Heavy intensity"),
    THUNDERSTORM_SLIGHT(95, "Thunderstorm: Slight intensity"),
    THUNDERSTORM_WITH_SLIGHT_HAIL(96, "Thunderstorm with slight hail"),
    THUNDERSTORM_WITH_HEAVY_HAIL(99, "Thunderstorm with heavy hail");
    companion object {
        private val values = values()
        fun getByCode(code: Int) = values.first { it.code == code }
    }

}
