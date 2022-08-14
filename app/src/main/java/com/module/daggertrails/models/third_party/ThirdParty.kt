package com.module.daggertrails.models.third_party

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

class Lights constructor(private val fgLights: FogLights, private val ledLights: LedLights) {

    fun display() {
        Log.d("CAR", "Fog Color: ${fgLights.defaultColor} | LED Color: ${ledLights.defaultColor}")
    }
}

class FogLights() {
    var defaultColor = "White"

    constructor(color: String) : this() {
        defaultColor = color
    }

    fun fogLightColor(color: String) {
        defaultColor = color
    }
}

class LedLights {
    val defaultColor = "blue"
}

class FrontSeats constructor(val seatType: String)

class BackSeats constructor(val seatType: String)

class CarSeats(private val frontSeat: FrontSeats, private val backSeats: BackSeats) {

    fun seatQuality() {
        println("Make: Front Seat: " + frontSeat.seatType + "|| Back Seat: " + backSeats.seatType)
    }
}


class Brakes constructor(private val dBrakes: DiscBrake, private val hBrake: HandBrake) {

    fun brakeDetails() {
        println("Car B1: " + dBrakes.brkType + " B2: " + hBrake.brkType)
    }
}

class DiscBrake {
    val brkType = "Disc-Bajaj"
}

class HandBrake {
    val brkType = "Hand brake - Honda"
}

@Singleton
class Owner @Inject constructor()