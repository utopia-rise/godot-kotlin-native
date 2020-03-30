import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import godot.tasks.GenerateApiTask

plugins {
    kotlin("multiplatform")
}

//TODO: this needs to be properly configured! This is just a basic setup to be able to implement the annotations
kotlin {
    linuxX64()
    mingwX64()
    macosX64()

    val nativeMain = sourceSets.create("nativeMain")

    targets.withType<KotlinNativeTarget> {
        compilations.getByName("main").defaultSourceSet { dependsOn(nativeMain) }
    }
}

tasks {
    val generateAPI by creating(GenerateApiTask::class) {
        source.set(project.file("$rootDir/godot-kotlin/godot-headers/api.json"))
        outputDirectory.set(project.file("$rootDir/godot-kotlin/godot-library/src/main/nativeGen/kotlin/"))
    }
}