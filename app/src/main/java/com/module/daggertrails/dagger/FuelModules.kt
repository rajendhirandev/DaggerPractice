package com.module.daggertrails.dagger

import com.module.daggertrails.models.DieselType
import com.module.daggertrails.models.GasType
import com.module.daggertrails.models.IFuel
import com.module.daggertrails.models.PetrolType
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class PetrolTypeModule() {
    @Provides
    fun providesPetrolType(pType: PetrolType): IFuel = pType
}

@Module
class DieselTypeModule() {
    @Provides
    fun providesDieselType(dType: DieselType): IFuel = dType
}

@Module
abstract class GasTypeModule() {
    @Binds
    abstract fun providesGasType(gType: GasType): IFuel
}
