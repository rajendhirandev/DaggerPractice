package com.module.daggertrails.dagger

import com.module.daggertrails.courses.DistanceEdu
import com.module.daggertrails.courses.ICourseMode
import com.module.daggertrails.courses.OneSitting
import com.module.daggertrails.courses.RegularCourse
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class RegularModule {
    @Provides
    fun providesRegular(rCourse: RegularCourse): ICourseMode = rCourse
}

@Module
class DistanceModule {
    @Provides
    fun providesDistance(disEdu: DistanceEdu): ICourseMode = disEdu
}

@Module
abstract class OneSittingModule {
    @Binds
    abstract fun bindsOneSitting(oneSit: OneSitting): ICourseMode
}
