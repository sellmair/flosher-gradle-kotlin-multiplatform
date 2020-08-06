package org.example.common


data class CommonBean(val x: Int, val y: Int)

expect fun toUtf8String(bytes: ByteArray): String