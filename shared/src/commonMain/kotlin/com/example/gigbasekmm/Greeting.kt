package com.example.gigbasekmm

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, base ${platform.name}!"
    }

    fun test(): String {
        val range = (1..30)
        return range.random().toString()
    }
}