package org.example.common

import kotlin.math.sqrt

actual fun pythagoras(a: Int, b: Int): Double = sqrt((a * a + b * b).toDouble())