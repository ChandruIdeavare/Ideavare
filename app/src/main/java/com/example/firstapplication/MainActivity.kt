package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    private val LOCATION_REQUEST_CODE = 1000

    private fun requestLocationPermission() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf("Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION"),
            LOCATION_REQUEST_CODE
        )
    }
    }
