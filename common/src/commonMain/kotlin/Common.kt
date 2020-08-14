package org.example.common

data class CommonBean(val x: Int, val y: Int) {
  val pythagoras = pythagoras(x, y)
}

/**
 * A simple function that calculates the length of the hypotenuse in a right-angled triangle given the two other sides
 */
expect fun pythagoras(a: Int, b: Int): Double