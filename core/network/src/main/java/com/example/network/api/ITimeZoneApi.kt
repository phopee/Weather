package com.example.network.api
import com.example.network.dto.TimeZoneDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface  ITimeZoneApi {


    @GET("list-time-zone")
    suspend fun getTimeZoneByCode(@Query("key")  apiKey :String,
                                  @Query("format")  format :String ="json",
                                  @Query("country")  country :String,
                                  @Query("zone")  zone: String) : Response<TimeZoneDto>
}