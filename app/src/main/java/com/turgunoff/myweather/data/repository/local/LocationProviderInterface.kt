package com.turgunoff.myweather.data.repository.local

import com.turgunoff.myweather.data.models.LocationData
import com.turgunoff.myweather.utils.RequestCompleteListener

/**
 * Created by Eldor Turgunov.
 * My Weather
 * eldorturgunov777@gmail.com
 */
interface LocationProviderInterface {
    fun getUserCurrentLocation(callback: RequestCompleteListener<LocationData>)
}