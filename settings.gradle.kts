pluginManagement {
  plugins {
    id("org.jetbrains.dokka") version "1.4.0-dev-35"
  }
  repositories {
    gradlePluginPortal()
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-dev/")
  }
  resolutionStrategy {
    eachPlugin {
      if (requested.id.id.startsWith("org.jetbrains.kotlin.")) {
        useVersion("1.4.0")
      }
    }
  }
}

include(":common", ":desktop", ":web")
