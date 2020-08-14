plugins {
  kotlin("js")
  id("org.jetbrains.dokka")
}
repositories {
  mavenLocal()
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
