package org.example.desktop

import org.example.common.pythagoras
import java.awt.FlowLayout
import java.awt.GraphicsEnvironment
import java.awt.Point
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.WindowConstants
import kotlin.math.roundToInt

/**
 * The main method of the :desktop module!
 */
fun main(vararg args: String) {
  val frame = JFrame("gradle-kotlin-multiplatform Desktop app").apply {
    defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
    layout = FlowLayout(FlowLayout.CENTER, 20, 20)
    add(JLabel("3²+4²=${pythagoras(3,4)}"))
    pack()
    location = GraphicsEnvironment.getLocalGraphicsEnvironment().maximumWindowBounds.let {
      Point((it.centerX / 2.0 - width / 2.0).roundToInt(), (it.centerY / 2.0 - height / 2.0).roundToInt())
    }
    isVisible = true
  }
}
