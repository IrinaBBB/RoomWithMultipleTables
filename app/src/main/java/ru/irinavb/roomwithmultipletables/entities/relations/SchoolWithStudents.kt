package ru.irinavb.roomwithmultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import ru.irinavb.roomwithmultipletables.entities.School
import ru.irinavb.roomwithmultipletables.entities.Student

data class SchoolWithStudents(

    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)
