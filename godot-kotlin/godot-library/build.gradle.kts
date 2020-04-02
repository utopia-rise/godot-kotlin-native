import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
}

//TODO: this needs to be properly configured! This is just a basic setup to be able to implement the annotations
kotlin {
    macosX64("macos")
    linuxX64("linux")
    mingwX64("windows")

    val internal = sourceSets.create("nativeInternal")
    val generated = sourceSets.create("nativeGen")
    val core = sourceSets.create("nativeCore")
    val public = sourceSets.create("nativePublic")

    core.dependsOn(internal)
    generated.dependsOn(core)
    public.dependsOn(generated)

    targets.withType<KotlinNativeTarget> {
        compilations.getByName("main") {
            defaultSourceSet {
                dependsOn(internal)
                dependsOn(generated)
                dependsOn(core)
                dependsOn(public)
            }
            val gdnative by cinterops.creating {
                defFile("src/nativeInterop/cinterop/godot.def")
                includeDirs("$rootDir/godot-kotlin/godot-headers/", "src/nativeInterop/cinterop")
            }
        }
    }
}