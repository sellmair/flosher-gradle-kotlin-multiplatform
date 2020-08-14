plugins {
  kotlin("jvm")
  id("org.jetbrains.dokka")
}

repositories {
  mavenLocal()
  jcenter()
}

dependencies {
  api(project(":common"))
}
