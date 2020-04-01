import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
}

//TODO: this needs to be properly configured! This is just a basic setup to be able to implement the annotations
kotlin {
    macosX64("macos")
    linuxX64("linux")
    mingwX64("windows")

    targets.withType<KotlinNativeTarget> {
        compilations.getByName("main") {
            defaultSourceSet {
                kotlin.srcDirs("src/main/nativeGen/kotlin", "src/main/nativeInternal/kotlin", "src/main/nativeCore/kotlin", "src/main/nativePublic/kotlin")
            }
            val gdnative by cinterops.creating {
                defFile("src/main/nativeInterop/cinterop/godot.def")
                includeDirs("$rootDir/godot-kotlin/godot-headers/", "src/main/nativeInterop/cinterop")
            }
        }
    }
}