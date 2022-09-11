package com.module.daggertrails.courses

import javax.inject.Inject
import javax.inject.Named

// Tightly Coupled
/*class Course {
    val syllabus = Syllabus()
    val certifications = Certifications()
}*/

/*// Loosely Coupled
class Course constructor(val syllabus: Syllabus, val certifications: Certifications) {
}*/

// Method Injection
/*class Course @Inject constructor(val syllabus: Syllabus, val certifications: Certifications) {
    var contentDesigner: ContentDesigner? = null

    @Inject
    fun assignedToContentDesigner(contentDesigner: ContentDesigner) {
        this.contentDesigner = contentDesigner
        this.contentDesigner?.assignCourse(this)
    }
}*/

/*class Course @Inject constructor(val syllabus: Syllabus, val certifications: Certifications) {

    @Inject
    lateinit var assignments: Assignments

}*/

/*class Course @Inject constructor(val syllabus: Syllabus, val certifications: Certifications) {
    @Inject
    lateinit var courseMode: ICourseMode


}

class Syllabus @Inject constructor() {
    fun topics() {
        println("Topics...")
    }
}

class Certifications @Inject constructor() {
    fun awards() {
        println("Certification Award...")
    }
}*/

class Student @Inject constructor(val course: Course, val courseMode: ICourseMode)

class Course @Inject constructor(val syllabus: Syllabus, val certifications: Certifications)

class Syllabus constructor(private val topicCovered: Int, private val totalTopics: Int) {
    fun coverage() {
        println("Topics Covered: $topicCovered of $totalTopics")
    }
}

class Certifications @Inject constructor(@Named("Primary") private val authorized: String) {
    fun providedBy() {
        println("Certified By $authorized")
    }
}

interface ICourseMode {
    fun getCourseMode(): String
}

class RegularCourse @Inject constructor() : ICourseMode {
    override fun getCourseMode(): String {
        return "Regular"
    }
}

class DistanceEdu @Inject constructor() : ICourseMode {
    override fun getCourseMode(): String {
        return "Distance"
    }
}

class OneSitting @Inject constructor() : ICourseMode {
    override fun getCourseMode(): String {
        return "OneSitting"
    }
}


class Assignments constructor(
    private val iAssignments: InternalAssignments,
    private val eAssignments: ExternalAssignments
) {

    fun display() {
        iAssignments.displayInfo()
        eAssignments.displayInfo()
    }
}

class InternalAssignments {

    fun displayInfo() {
        println("I'm Internal Assignments")
    }

}

class ExternalAssignments {
    fun displayInfo() {
        println("I'm External Assignments")
    }
}

class ContentDesigner @Inject constructor() {
    var course: Course? = null

    fun assignCourse(course: Course) {
        this.course = course
        println("Course Assigned... $course")
    }
}
