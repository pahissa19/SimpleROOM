package com.davidp.ejemploroom.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Persona(
    @PrimaryKey(autoGenerate = true)
    val idn: Int,
    val name: String
)
