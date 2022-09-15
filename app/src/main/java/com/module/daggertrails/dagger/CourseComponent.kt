package com.module.daggertrails.dagger

import com.module.daggertrails.CourseActivity
import com.module.daggertrails.courses.Course
import com.module.daggertrails.courses.Student
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [AssignmentModule::class, OneSittingModule::class, SyllabusModule::class, UniversityModule::class])
interface CourseComponent {
    fun getCourse(): Course
    fun getStudent(): Student
    fun inject(courseActivity: CourseActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun bindsCertificateProvider(@Named("Primary") authorizer: String): Builder

        fun buildSyllabusModule(syllabus: SyllabusModule): Builder

        fun buildUniversity(university: UniversityModule): Builder

        fun build(): CourseComponent
    }
}
