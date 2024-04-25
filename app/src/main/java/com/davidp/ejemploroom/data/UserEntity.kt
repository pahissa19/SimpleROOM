package com.davidp.ejemploroom.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val idn: Int,
    val name: String
)
