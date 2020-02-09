import java.util.*

plugins {
    id("kotlin-multiplatform")
    id("maven-publish")
    id("com.jfrog.bintray")
}

val bintrayUser: String by project
val bintrayKey: String by project
val platform: String by project
val android_arch: String by project

group = "org.godotengine.kotlin"
version = Dependencies.godotLibraryVersion

kotlin {
    sourceSets {
        sourceSets.create("macosMain")
        sourceSets.create("linuxMain")
        sourceSets.create("windowsMain")
        sourceSets.create("androidArm64Main")
        sourceSets.create("androidX64Main")
        configure(listOf(
                sourceSets["macosMain"],
                sourceSets["linuxMain"],
                sourceSets["windowsMain"],
                sourceSets["androidArm64Main"],
                sourceSets["androidX64Main"]
        )) {
            this.kotlin.srcDir("src/main/kotlin")
        }
    }

    val targets =
            if (project.hasProperty("platform")) {
                when (platform) {
                    "windows" -> listOf(targetFromPreset(presets["mingwX64"], "windows"))
                    "linux" -> listOf(targetFromPreset(presets["linuxX64"], "linux"))
                    "macos" -> listOf(targetFromPreset(presets["macosX64"], "macos"))
                    "android" -> if (project.hasProperty("android_arch")) {
                        when(android_arch) {
                            "X64" -> listOf(targetFromPreset(presets["androidNativeX64"], "androidX64"))
                            "arm64" -> listOf(targetFromPreset(presets["androidNativeArm64"], "androidArm64"))
                            else -> listOf(targetFromPreset(presets["androidNativeArm64"], "androidArm64"))
                        }
                    }
                    else listOf(targetFromPreset(presets["androidNativeArm64"], "androidArm64"))
                    else -> listOf(targetFromPreset(presets["linuxX64"], "linux"))
                }
            } else {
                listOf(
                        targetFromPreset(presets["linuxX64"], "linux"),
                        targetFromPreset(presets["macosX64"], "macos"),
                        targetFromPreset(presets["mingwX64"], "windows"),
                        targetFromPreset(presets["androidNativeArm64"], "androidArm64"),
                        targetFromPreset(presets["androidNativeX64"], "androidX64")
                )
            }

    targets.forEach {
        it.compilations.getByName("main") {
            if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation) {
                println("Configuring target ${it.name}")
                cinterops {
                    create("GDNative") {
                        defFile("src/main/c_interop/godot.def")
                        includeDirs("../lib/godot_headers", "src/main/c_interop")
                    }
                }
            } else {
                System.err.println("Not a native target! TargetName: ${it.name}")
            }
        }
    }
}

tasks.build {
    finalizedBy(tasks.publishToMavenLocal)
}

if (project.hasProperty("bintrayUser") && project.hasProperty("bintrayKey")
        && project.hasProperty("platform")) {
    bintray {
        user = bintrayUser
        key = bintrayKey
        setPublications(platform)
        pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
            userOrg = "utopia-rise"
            repo = "kotlin-godot"

            name = "${project.name}-$platform"
            vcsUrl = "https://github.com/utopia-rise/kotlin-godot-wrapper"
            setLicenses("Apache-2.0")
            version(closureOf<com.jfrog.bintray.gradle.BintrayExtension.VersionConfig> {
                this.name = project.version.toString()
                released = Date().toString()
                description = "Godot library ${project.version}"
                vcsTag = project.version.toString()
            })
        })
    }
}