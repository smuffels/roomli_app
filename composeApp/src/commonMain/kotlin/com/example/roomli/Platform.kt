package com.example.roomli

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform