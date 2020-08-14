plugins {
  kotlin("js")
  id("org.jetbrains.dokka")
}
repositories {
  jcenter()
}
dependencies {
  api(project(":common"))
}
kotlin {
  js {
    browser()
  }
}
