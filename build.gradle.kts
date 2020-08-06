subprojects {
  buildscript {
    repositories.jcenter()
    dependencies {
      classpath(kotlin("gradle-plugin", "1.3.10"))
    }
  }
  repositories.jcenter()
}
