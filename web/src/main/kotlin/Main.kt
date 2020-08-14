import kotlinx.browser.document
import kotlinx.browser.window
import org.example.common.pythagoras
import org.w3c.dom.HTMLCollection
import org.w3c.dom.get

@JsName("main")
fun main() {
  calc()
  alertMe()
}

/**
 * Display an alert message in browser
 */
fun alertMe() {
  window.alert("Alert created by gradle-kotlin-multiplatform!")
}

/**
 * Replaces the contents of all `<div>`s that have `pythagoras` class with a pythagorean formula
 */
fun calc() {
  document.getElementsByClassName("pythagoras").toList().forEach {
    it.textContent = "3² + 4² = ${pythagoras(3, 4)}"
  }
}

fun HTMLCollection.toList() = List(length) { this[it] }.mapNotNull { it }
