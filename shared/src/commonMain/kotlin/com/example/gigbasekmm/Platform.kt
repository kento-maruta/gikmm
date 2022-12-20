package com.example.gigbasekmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform