package com.davidp.ejemploroom.main

data class MainState(
    val name: String = "",
    val names: List<String> = emptyList()
)
