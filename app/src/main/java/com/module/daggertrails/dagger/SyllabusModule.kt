package com.module.daggertrails.dagger

import com.module.daggertrails.courses.Syllabus
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class SyllabusModule @Inject constructor(
    private val topicCovered: Int,
    private val totalTopics: Int
) {
    @Provides
    fun providesSyllabus() = Syllabus(topicCovered, totalTopics)
}
