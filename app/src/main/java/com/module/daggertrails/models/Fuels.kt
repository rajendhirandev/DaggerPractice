package com.module.daggertrails.models

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Inject

interface IFuel {
    fun getType(): String
}

class PetrolType @Inject constructor() : IFuel {
    override fun getType(): String {
        return "Petrol"
    }
}

class DieselType @Inject constructor() : IFuel {
    override fun getType(): String {
        return "Diesel"
    }
}

class GasType @Inject constructor() : IFuel {
    override fun getType(): String {
        return "Gas"
    }
}

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
