package com.module.daggertrails.models.third_party

import android.util.Log

class Lights constructor(private val fgLights: FogLights, private val ledLights: LedLights) {

    fun display() {
        Log.d("CAR", "Fog Color: ${fgLights.defaultColor} | LED Color: ${ledLights.defaultColor}")
    }
}

class FogLights {
    val defaultColor = "White"
}

class LedLights {
    val defaultColor = "blue"
}
