package ru.irinavb.roomwithmultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import ru.irinavb.roomwithmultipletables.entities.Director
import ru.irinavb.roomwithmultipletables.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)

