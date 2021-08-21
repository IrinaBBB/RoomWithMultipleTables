package ru.irinavb.roomwithmultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import ru.irinavb.roomwithmultipletables.entities.Student
import ru.irinavb.roomwithmultipletables.entities.StudentSubjectCrossRef
import ru.irinavb.roomwithmultipletables.entities.Subject

data class SubjectWithStudents (
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)