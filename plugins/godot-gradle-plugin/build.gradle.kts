plugins {
    `kotlin-dsl`
    `maven-publish`
    id("com.gradle.plugin-publish") version "0.10.1"
}

gradlePlugin {
    plugins {
        create("godotPlugin") {
            id = "com.utopia-rise.godot-kotlin"
            displayName = "Gradle plugin for godot-kotlin"
            implementationClass = "godot.gradle.GodotPlugin"
        }
    }
    isAutomatedPublishing = false
}

pluginBundle {
    website = "https://github.com/raniejade/godot-kotlin"
    vcsUrl = "https://github.com/raniejade/godot-kotlin.git"
    tags = listOf("kotlin", "godot", "gamedev")

    mavenCoordinates {
        groupId = "com.utopia-rise"
        artifactId = "godot-gradle-plugin"
        version = "${project.version}"
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("gradle-plugin"))
    implementation(kotlin("gradle-plugin-api"))
}