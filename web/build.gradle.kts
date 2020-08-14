plugins {
  kotlin("js")
  id("org.jetbrains.dokka")
}
dependencies {
  api(project(":common"))
}
kotlin {
  js {
    browser()
  }
}