package com.turgunoff.myweather.utils

/**
 * Created by Eldor Turgunov.
 * My Weather
 * eldorturgunov777@gmail.com
 */
interface RequestCompleteListener<T> {
    fun onRequestCompleted(data:T)
    fun onRequestFailed(errorMessage:String?)
}