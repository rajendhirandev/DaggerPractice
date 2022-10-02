package com.module.daggertrails

import android.app.Application
import com.module.daggertrails.dagger.CarComponent
import com.module.daggertrails.dagger.DaggerCarComponent
import com.module.daggertrails.dagger.LightsModule
import com.module.daggertrails.dagger.SeatModule
import com.module.daggertrails.models.third_party.BackSeats
import com.module.daggertrails.models.third_party.FrontSeats

class DaggerApplication : Application() {

    //private lateinit var carComponent: CarComponent
    override fun onCreate() {
        super.onCreate()
       /* carComponent = DaggerCarComponent.builder().apply {
            glassType("Saint-Gobain")
            glassThickness(12.59)
            engineCapacity(19.2)
            engineName("Toyota")
            seatModule(SeatModule(FrontSeats("Hard"), BackSeats("Wire")))
            lightsModule(LightsModule("Sky Blue"))
        }.build()*/
    }

    //fun getAppCarComponent() = carComponent

}