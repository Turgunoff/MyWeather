package com.turgunoff.myweather.data.repository.remote

import com.turgunoff.myweather.network.RetrofitClient

/**
 * Created by Eldor Turgunov.
 * My Weather
 * eldorturgunov777@gmail.com
 */
class WeatherRepository {
    suspend fun getWeatherByLocation(lat: String, lon: String) =
        RetrofitClient.api.getWeatherByLocation(lat, lon)

    suspend fun getWeatherByCityID(id: String) = RetrofitClient.api.getWeatherByCityID(id)
    suspend fun getWeatherForecast(lat: String, lon: String, exclude: String) =
        RetrofitClient.api.getWeatherForecast(lat, lon, exclude)
}