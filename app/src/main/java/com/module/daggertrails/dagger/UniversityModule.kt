package com.module.daggertrails.dagger

import com.module.daggertrails.courses.University
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton


@Module
class UniversityModule  @Inject constructor(private val uName:String) {

    @Provides
    @Singleton
    fun getUniversity():University = University(uName)
}