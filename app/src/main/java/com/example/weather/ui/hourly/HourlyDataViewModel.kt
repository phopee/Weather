package com.example.weather.ui.hourly

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.domain.weather.GetHourlyWeatherDataUseCase
import com.example.model.entities.GPSLocation
import com.example.model.entities.HourlyInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject
val latitude= "44.4323".toDouble()
val longitude="26.1063".toDouble()
val timezone ="Europe%2FMoscow"
@HiltViewModel
class HourlyDataViewModel @Inject constructor(private val getHourlyDataUseCase: GetHourlyWeatherDataUseCase) :ViewModel(){
    private val _hourlyData = MutableLiveData<HourlyInfo>()
    val hourlyData : LiveData<HourlyInfo> = _hourlyData
    init{
       val location= getGPSLocation()
        getHoulryInfo()
    }
    fun getGPSLocation():GPSLocation?{
        return null
    }
    fun getHoulryInfo(){
        getHourlyDataUseCase(latitude, longitude, timezone).onEach { result->
            result?.let {
                _hourlyData.value =
                    HourlyInfo(result, GPSLocation(latitude, longitude, "Bucuresti"))
            }
        }
    }
}