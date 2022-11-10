package com.turgunoff.myweather.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.turgunoff.myweather.data.models.Cities
import com.turgunoff.myweather.data.models.CityUpdate

/**
 * Created by Eldor Turgunov.
 * My Weather
 * eldorturgunov777@gmail.com
 */
@Dao
interface CityDao {
    @Query("SELECT * FROM city_bd WHERE name LIKE :key || '%'")
    suspend fun searchCity(key: String): List<Cities>

    @Update(entity = Cities::class)
    suspend fun updateSavedCity(vararg obj: CityUpdate): Int

    @Query("SELECT * FROM city_bd WHERE isSaved= :key")
    fun getSavedCity(key: Int): LiveData<List<Cities>>

    @Delete
    suspend fun deleteSavedCity(city: Cities)
}