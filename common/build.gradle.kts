import org.jetbrains.dokka.gradle.DokkaTask

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
    configureEach {
      includes.plus("packages.md")
    }
  }
}
