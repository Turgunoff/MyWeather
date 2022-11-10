package com.turgunoff.myweather.utils

import androidx.recyclerview.widget.DiffUtil
import com.turgunoff.myweather.data.models.Cities
import com.turgunoff.myweather.data.models.Daily

/**
 * Created by Eldor Turgunov.
 * My Weather
 * eldorturgunov777@gmail.com
 */
class DiffUtilCallback : DiffUtil.ItemCallback<Cities>() {
    override fun areItemsTheSame(oldItem: Cities, newItem: Cities): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Cities, newItem: Cities): Boolean {
        return oldItem == newItem
    }
}

class DiffUtilCallbackForecast : DiffUtil.ItemCallback<Daily>() {
    override fun areItemsTheSame(oldItem: Daily, newItem: Daily): Boolean {
        return oldItem.dt == newItem.dt
    }

    override fun areContentsTheSame(oldItem: Daily, newItem: Daily): Boolean {
        return oldItem == newItem
    }

}