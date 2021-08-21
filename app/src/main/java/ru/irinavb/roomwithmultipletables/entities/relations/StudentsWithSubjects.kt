package ru.irinavb.roomwithmultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import ru.irinavb.roomwithmultipletables.entities.Student
import ru.irinavb.roomwithmultipletables.entities.StudentSubjectCrossRef
import ru.irinavb.roomwithmultipletables.entities.Subject

data class StudentsWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subject: List<Subject>
)


