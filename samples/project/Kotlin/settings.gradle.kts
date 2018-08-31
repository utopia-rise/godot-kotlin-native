rootProject.name = "samples"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            url = uri("./plugin/")
        }
    }
}