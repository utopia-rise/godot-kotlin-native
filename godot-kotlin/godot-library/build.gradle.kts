import godot.tasks.GenerateApiTask
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
}

kotlin {
    macosX64("macos")
//    linuxX64("linux")
//    mingwX64("windows")

    targets.withType<KotlinNativeTarget> {
        compilations.getByName("main") {
            defaultSourceSet {
                kotlin.srcDirs("src/main/nativeGen/kotlin", "src/main/nativeInternal/kotlin")
            }
            val gdnative by cinterops.creating {
                defFile("src/main/nativeInterop/cinterop/godot.def")
                includeDirs("$rootDir/godot-kotlin/godot-headers/", "src/main/nativeInterop/cinterop")
            }
        }
    }
}

val generateAPI by tasks.creating(GenerateApiTask::class) {
    source.set(project.file("$rootDir/godot-kotlin/godot-headers/api.json"))
    outputDirectory.set(project.file("$rootDir/godot-kotlin/godot-library/src/main/nativeGen/kotlin/"))
}

tasks {
    build {
        dependsOn(generateAPI)
    }
}