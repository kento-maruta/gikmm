package com.example.gigkmm

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun test(): String {
        val range = (1..99)
        return range.random().toString()
    }
}