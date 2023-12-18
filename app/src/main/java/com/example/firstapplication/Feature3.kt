import android.os.Looper
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationSettingsRequest

pprivate val locationCallback = object : LocationCallback() {
    override fun onLocationResult(locationResult: LocationResult) {
        super.onLocationResult(locationResult)
        locationResult.lastLocation.let { location ->
            // Use the user's location to send a reminder.
        }
    }
}

private fun getUserLocation() {
    val locationRequest = LocationRequest.create().apply {
        priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        interval = 10000
        fastestInterval = 5000
    }

    val locationSettingsRequest = LocationSettingsRequest.Builder()
        .addLocationRequest(locationRequest)
        .build()

    val settingsClient = LocationServices.getSettingsClient(this)
    settingsClient.checkLocationSettings(locationSettingsRequest)

    val locationClient = LocationServices.getFusedLocationProviderClient(this)
    locationClient.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper())
}