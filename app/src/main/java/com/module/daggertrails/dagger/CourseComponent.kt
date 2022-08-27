package com.module.daggertrails.dagger

import com.module.daggertrails.CourseActivity
import com.module.daggertrails.courses.Course
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [AssignmentModule::class, OneSittingModule::class, SyllabusModule::class])
interface CourseComponent {
    fun getCourse(): Course
    fun inject(courseActivity: CourseActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        @Named("Primary")
        fun bindsCertificateProvider(authorizer: String) : Builder

        @BindsInstance
        @Named("Secondary")
        fun bindsSecondaryCertificate(authorizer: String) : Builder

        fun buildSyllabusModule(syllabus: SyllabusModule): Builder

        fun build(): CourseComponent
    }
}