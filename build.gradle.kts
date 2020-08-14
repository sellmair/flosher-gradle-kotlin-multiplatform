import org.jetbrains.dokka.gradle.DokkaTask

buildscript {
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
  }
}

plugins {
  id("org.jetbrains.dokka")
}

allprojects {
  repositories {
    jcenter()
    mavenLocal()
  }
  tasks.withType(DokkaTask::class) {
    dokkaSourceSets.configureEach {
      includes.plus("packages.md")
    }
  }
}
