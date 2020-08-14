plugins {
  kotlin("jvm")
  id("org.jetbrains.dokka")
}

repositories {
  jcenter()
}

dependencies {
  api(project(":common"))
}
