import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.Platform
import java.net.URL

plugins {
  kotlin("multiplatform")
  id("org.jetbrains.dokka")
}

repositories {
  jcenter()
}

kotlin {

  jvm()
  js {
    browser()
  }

  sourceSets {
    commonMain {
      dependencies {
        implementation(kotlin("stdlib"))
      }
    }
    val jsMain by getting {
      dependencies {
        implementation(kotlin("stdlib-js"))
      }
    }
    val jvmMain by getting
  }
}

tasks.withType(DokkaTask::class) {
  dokkaSourceSets {
    val jsMain by registering
    val jvmMain by registering
    configureEach {
      includes.plus("packages.md")
    }
  }
}
