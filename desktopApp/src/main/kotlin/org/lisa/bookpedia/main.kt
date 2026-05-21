package org.lisa.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "bookpediaCMP",
    ) {
        App()
    }
}