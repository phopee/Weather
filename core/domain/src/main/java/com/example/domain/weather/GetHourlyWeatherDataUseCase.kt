package com.example.domain.weather

import com.example.data.repository.Interfaces.IWeatherDataRepository
import com.example.model.entities.Hour
import com.example.model.entities.HourlyValues
import com.example.network.dto.toHours
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class GetHourlyWeatherDataUseCase @Inject constructor(private val weatherRepo :IWeatherDataRepository) {
    operator fun invoke(latitude:Double, longitude:Double, timezone:String) : Flow<List<Hour>?> = flow{
        try{
            val data= weatherRepo.getHourlyWeatherForecast(latitude,longitude,timezone)
            emit(data?.toHours())
        }catch(e:java.lang.Exception){
            e.printStackTrace()
        }

    }
}