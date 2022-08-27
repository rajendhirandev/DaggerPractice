package com.module.daggertrails

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.module.daggertrails.courses.Course
import com.module.daggertrails.dagger.DaggerCourseComponent
import com.module.daggertrails.dagger.SyllabusModule
import javax.inject.Inject

class CourseActivity : AppCompatActivity() {
    @Inject
    lateinit var course: Course
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        DaggerCourseComponent.builder()
            .bindsCertificateProvider("Microsoft")
            .bindsSecondaryCertificate("Amazon")
            .buildSyllabusModule(SyllabusModule(4, 10))
            .build().apply {
                inject(this@CourseActivity)
            }
        course.syllabus.coverage()
        course.certifications.providedBy()
        //Log.d("Courses Activity Obj", "onCreate: ${course.syllabus.coverage()}")
        //Log.d("Courses Activity Obj", "onCreate: ${course.certifications.providedBy()}")
        //Log.d("Courses Activity Obj", "onCreate: ${course}")
        //course.certifications.awards()
        //course.syllabus.topics()
        //course.contentDesigner?.course
        //course.assignments.display()
        //println("Course Mode: ${course.courseMode.getCourseMode()}")
    }
}

