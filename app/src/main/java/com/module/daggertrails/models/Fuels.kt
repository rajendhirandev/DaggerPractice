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
