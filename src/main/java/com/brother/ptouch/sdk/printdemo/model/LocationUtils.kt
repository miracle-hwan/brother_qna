package com.brother.ptouch.sdk.printdemo.model

import android.content.Context
import android.location.LocationManager

object LocationUtils {
    fun isEnabledLocationService(context: Context): Boolean {
        val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return locationManager.isLocationEnabled
    }
}
