package com.davidp.ejemploroom.main

import com.davidp.ejemploroom.data.User

data class MainState(
    val name: String = "",
    val users: List<User> = emptyList()
)
