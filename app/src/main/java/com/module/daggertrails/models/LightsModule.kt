package com.module.daggertrails.models

import com.module.daggertrails.models.third_party.FogLights
import com.module.daggertrails.models.third_party.LedLights
import com.module.daggertrails.models.third_party.Lights
import dagger.Module
import dagger.Provides

@Module
class LightsModule {

    @Provides
    fun providesLEDLights() = LedLights()

    @Provides
    fun providesFogLights() = FogLights()

    @Provides
    fun providesLights(fogLight: FogLights, ledLights: LedLights) = Lights(fogLight, ledLights)
}