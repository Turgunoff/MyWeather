package com.turgunoff.myweather.network

import com.turgunoff.myweather.App
import com.turgunoff.myweather.utils.APP_ID
import com.turgunoff.myweather.utils.PrefManager
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by Eldor Turgunov.
 * My Weather
 * eldorturgunov777@gmail.com
 */
class QueryParameterAddInterceptor : Interceptor {

    val context = App.context
    private val prefManager = PrefManager(context)

    override fun intercept(chain: Interceptor.Chain): Response {
        val url = chain.request().url().newBuilder()
            .addQueryParameter("appid", APP_ID)
            .addQueryParameter("units", prefManager.tempUnit)
            .build()

        val request = chain.request().newBuilder()
            .url(url)
            .build()

        return chain.proceed(request)
    }
}