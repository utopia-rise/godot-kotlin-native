plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
    id("org.jetbrains.kotlin.konan") version "0.8.2"
    id("com.github.johnrengelman.shadow") version "2.0.4"
}

group = "kotlin-godot"
version = "0.1"

gradlePlugin {
    plugins {
        register("kotlinGodot") {
            id = "kotlin-godot"
            implementationClass = "plugin.KotlinGodotPlugin"
        }
    }
}

publishing {
    repositories {
        maven(url = "build/repository")
    }
}

repositories {
    jcenter()

    maven {
        url = uri("https://dl.bintray.com/jetbrains/kotlin-native-dependencies")
    }
}

dependencies {

    implementation(files("libs/entry_generator.jar"))
}