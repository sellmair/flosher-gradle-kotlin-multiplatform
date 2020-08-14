import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.Platform

plugins {
  kotlin("jvm")
  id("org.jetbrains.dokka")
}

dependencies {
  api(project(":common"))
}
