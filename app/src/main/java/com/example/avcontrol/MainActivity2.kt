package com.example.avcontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main2)

        val button = findViewById<Button>(R.id.buttonToMap)
        button.setOnClickListener {openActivity1()}
    }

    private fun openActivity1() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}