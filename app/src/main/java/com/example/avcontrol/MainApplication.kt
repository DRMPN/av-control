package com.example.avcontrol

import android.app.Application
import com.yandex.mapkit.MapKitFactory

class MainApplication : Application() {

    private val MAPKIT_API_KEY: String = BuildConfig.YANDEX_MAPKIT_API_KEY

    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey(MAPKIT_API_KEY)
    }
}