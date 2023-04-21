package com.example.avcontrol

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView


class MainActivity : AppCompatActivity() {

    private var mapView: MapView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE)

        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_main)

        mapView = findViewById(R.id.mapview)
        mapView?.map?.move(CameraPosition(Point(59.945933, 30.320045), 10F, 0F, 0F))

        val button = findViewById<Button>(R.id.buttonToCamera)
        button.setOnClickListener {openActivity2()}
    }

    override fun onStop() {
        mapView?.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        mapView?.onStart()
        MapKitFactory.getInstance().onStart()
        super.onStart()
    }

    private fun openActivity2() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}