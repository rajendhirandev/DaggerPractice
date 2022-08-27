package com.module.daggertrails.dagger

import com.module.daggertrails.courses.Assignments
import com.module.daggertrails.courses.ExternalAssignments
import com.module.daggertrails.courses.InternalAssignments
import dagger.Module
import dagger.Provides

@Module
class AssignmentModule {

    @Provides
    fun providesInternalAssignment() = InternalAssignments()

    @Provides
    fun providesExternalAssignment() = ExternalAssignments()

    @Provides
    fun providesAssignments(iAssignments: InternalAssignments, eAssignments: ExternalAssignments) =
        Assignments(iAssignments, eAssignments)
}
