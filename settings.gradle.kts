pluginManagement {
  repositories {
    mavenLocal()
    gradlePluginPortal()
    jcenter()
  }
  resolutionStrategy {
    eachPlugin {
      if (requested.id.id.startsWith("org.jetbrains.kotlin.")) {
        useVersion("1.4.0")
      }
      if (requested.id.id == "org.jetbrains.dokka") {
        useVersion("1.4.0-rc-SNAPSHOT")
      }
    }
  }
}

include(":common", ":desktop", ":web")
