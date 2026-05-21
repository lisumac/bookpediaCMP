package org.lisa.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform