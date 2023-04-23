package com.example.avcontrol

import android.app.Application
import com.yandex.mapkit.MapKitFactory

class MainApplication : Application() {

    private val MAPKIT_API_KEY: String = "19108832-fb63-41c2-bd5c-0b9e99684e21"

    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey(MAPKIT_API_KEY)
    }
}