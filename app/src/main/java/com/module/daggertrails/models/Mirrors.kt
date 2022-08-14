package com.module.daggertrails.models

import javax.inject.Inject
import javax.inject.Named

class Glasses @Inject constructor(@Named("glassType") private val glassType: String?, @Named("glassThick") private val thickness: Double?) {

    fun glassDetails() {
        println("Glass: Type=> $glassType Thickness: $thickness")
    }
}
