package com.module.daggertrails.dagger

import com.module.daggertrails.models.third_party.FogLights
import com.module.daggertrails.models.third_party.LedLights
import com.module.daggertrails.models.third_party.Lights
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class LightsModule() {

    private var fogLightColor: String = ""

    @Inject
    constructor(fogLight: String) : this() {
        fogLightColor = fogLight
    }

    @Provides
    fun providesLEDLights() = LedLights()

    /*@Provides
    fun providesFogLights() = FogLights()*/

    @Provides
    fun providesLights(fogLight: FogLights, ledLights: LedLights) = Lights(fogLight, ledLights)

    /*@Provides
    fun providesFogLightsWith() = FogLights().apply {
        fogLightColor(fogLightColor)
    }*/

      @Provides
      fun providesFogLight(): FogLights {
          return FogLights(fogLightColor)
      }

    /*@Provides
    fun getLightColor() = fogLightColor*/

}
