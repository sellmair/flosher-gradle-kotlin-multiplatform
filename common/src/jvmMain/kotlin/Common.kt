package org.example.common

actual fun pythagoras(a: Int, b: Int): Double = Math.sqrt(Math.pow(a.toDouble(), 2.0) + Math.pow(b.toDouble(), 2.0))

/**
 * An empty function only defined for JVM
 */
fun jvmOnlyFun() {}