package com.module.daggertrails.dagger

import com.module.daggertrails.models.third_party.Brakes
import com.module.daggertrails.models.third_party.DiscBrake
import com.module.daggertrails.models.third_party.HandBrake
import dagger.Module
import dagger.Provides

/*Since no instance to be created so made it as a abstract class and the functions are static,
else dagger component class will generated with the deprecated builder */

@Module
abstract class BrakeModule {

    companion object {
        @Provides
        fun provideDiscBrake() = DiscBrake()

        @Provides
        fun provideHandBrake() = HandBrake()

        @Provides
        fun provideBrakes(dBrk: DiscBrake, hBrk: HandBrake) = Brakes(dBrk, hBrk)
    }
}
