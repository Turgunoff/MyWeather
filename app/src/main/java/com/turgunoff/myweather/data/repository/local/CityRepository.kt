package com.turgunoff.myweather.data.repository.local

import com.turgunoff.myweather.data.models.Cities
import com.turgunoff.myweather.data.models.CityUpdate
import com.turgunoff.myweather.db.CityDatabase

/**
 * Created by Eldor Turgunov.
 * My Weather
 * eldorturgunov777@gmail.com
 */
class CityRepository(private val database: CityDatabase) {

    suspend fun searchCities(key: String) = database.getCityDao().searchCity(key)
    suspend fun updateSavedCities(obj: CityUpdate) = database.getCityDao().updateSavedCity(obj)
    fun getSavedCities(key: Int) = database.getCityDao().getSavedCity(key)
    suspend fun deleteSavedCities(cities: Cities) = database.getCityDao().deleteSavedCity(cities)
}