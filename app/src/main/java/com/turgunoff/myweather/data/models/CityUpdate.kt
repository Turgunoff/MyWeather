package com.turgunoff.myweather.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * Created by Eldor Turgunov.
 * My Weather
 * eldorturgunov777@gmail.com
 */
@Entity
data class CityUpdate (
    @ColumnInfo(name = "id")
    var id:Int?=null,

    @ColumnInfo(name = "isSaved")
    var isSaved:Int?=null
)