import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

val platform: String? by project

plugins {
    kotlin("multiplatform")
    `maven-publish`
}

//TODO: this needs to be properly configured! This is just a basic setup to be able to implement the annotations
kotlin {
    // we don't have godot-library in the mobile targets yet, limit these to desktop for now
    //has to be change in `GodotPlugin` of `godot-gradle-plugin` as well
    if (platform != null) {
        when (platform) {
            "windows" -> mingwX64("windows")
            "linux" -> linuxX64("linux")
            "macos" -> macosX64("macos")
        }
    } else {
        macosX64("macos")
        linuxX64("linux")
        mingwX64("windows")
    }

    // val internalSourceSet = sourceSets.create("nativeInternal")
    // val coreSourceSet = sourceSets.create("nativeCore") { dependsOn(internalSourceSet) }
    // val generatedSourceSet = sourceSets.create("nativeGen") { dependsOn(coreSourceSet) }
    // val publicSourceSet = sourceSets.create("nativePublic") { dependsOn(generatedSourceSet) }


    targets.withType<KotlinNativeTarget> {
        compilations.getByName("main") {
            defaultSourceSet {
                // dependsOn(internalSourceSet)
                // dependsOn(generatedSourceSet)
                // dependsOn(coreSourceSet)
                // dependsOn(publicSourceSet)
                kotlin.srcDirs(
                    listOf(
                        "nativeInternal",
                        "nativeCore",
                        "nativeGen",
                        "nativePublic"
                    ).map { "src/$it/kotlin" })
            }
            val gdnative by cinterops.creating {
                defFile("src/nativeInterop/cinterop/godot.def")
                includeDirs("$rootDir/godot-kotlin/godot-headers/", "src/nativeInterop/cinterop")
            }
        }
    }
}

tasks {
    build {
        finalizedBy(publishToMavenLocal)
    }
}
