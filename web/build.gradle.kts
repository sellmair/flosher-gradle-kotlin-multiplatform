apply(plugin = "kotlin-platform-js")

dependencies {
  add("expectedBy", project(":common"))
  add("implementation", kotlin("stdlib-js"))
}