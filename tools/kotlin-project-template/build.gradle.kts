val platform: String by project
val armArch: String by project
val iosSigningIdentity: String by project
val buildType: String? by project

buildscript {
    repositories {
        mavenLocal()
        maven("https://dl.bintray.com/utopia-rise/kotlin-godot")
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
        classpath("org.godotengine.kotlin:godot-gradle-plugin:1.0.1")
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform") version ("1.3.61")
}

apply(plugin = "godot-gradle-plugin")

repositories {
    mavenLocal()
    maven("https://dl.bintray.com/utopia-rise/kotlin-godot")
    jcenter()
}

configure<org.godotengine.kotlin.gradleplugin.KotlinGodotPluginExtension> {
    this.releaseType = if (buildType?.toLowerCase() == "release") {
        org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.RELEASE
    } else {
        org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG
    }
    this.godotProjectPath = "${project.rootDir.absolutePath}/.."
    this.libraryPath = "kotlin.gdnlib"
}

kotlin {
    sourceSets {
        sourceSets.create("macosMain")
        sourceSets.create("linuxMain")
        sourceSets.create("windowsMain")
        sourceSets.create("androidArm64Main")
        sourceSets.create("androidX64Main")
        sourceSets.create("iosArm64Main")
        sourceSets.create("iosX64Main")
        configure(listOf(
                sourceSets["macosMain"],
                sourceSets["linuxMain"],
                sourceSets["windowsMain"],
                sourceSets["androidArm64Main"],
                sourceSets["androidX64Main"],
                sourceSets["iosArm64Main"],
                sourceSets["iosX64Main"]
        )) {
            this.kotlin.srcDir("src/main/kotlin")
        }
    }

    val targets = if (project.hasProperty("platform")) {
        when (platform) {
            "windows" -> listOf(targetFromPreset(presets["godotMingwX64"], "windows"))
            "linux" -> listOf(targetFromPreset(presets["godotLinuxX64"], "linux"))
            "macos" -> listOf(targetFromPreset(presets["godotMacosX64"], "macos"))
            "android" -> if (project.hasProperty("armArch")) {
                when(armArch) {
                    "X64" -> listOf(targetFromPreset(presets["godotAndroidNativeX64"], "androidX64"))
                    "arm64" -> listOf(targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"))
                    else -> listOf(targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"))
                }
            } else listOf(targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"))
            "ios" -> if (project.hasProperty("armArch")) {
                when (armArch) {
                    "arm64" -> listOf(targetFromPreset(presets["godotIosArm64"], "iosArm64"))
                    "X64" -> listOf(targetFromPreset(presets["godotIosX64"], "iosX64"))
                    else -> listOf(targetFromPreset(presets["godotIosArm64"], "iosArm64"))
                }
            } else listOf(targetFromPreset(presets["godotIosArm64"], "iosArm64"))
            else -> listOf(targetFromPreset(presets["godotLinuxX64"], "linux"))
        }
    } else {
        listOf(
                targetFromPreset(presets["godotLinuxX64"], "linux"),
                targetFromPreset(presets["godotMacosX64"], "macos"),
                targetFromPreset(presets["godotMingwX64"], "windows"),
                targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"),
                targetFromPreset(presets["godotAndroidNativeX64"], "androidX64"),
                targetFromPreset(presets["godotIosArm64"], "iosArm64"),
                targetFromPreset(presets["godotIosX64"], "iosX64")
        )
    }

    targets.forEach { target ->
        target.compilations.getByName("main") {
            if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation) {
                println("Configuring target ${target.name}")
                target.compilations.all {
                    dependencies {
                        implementation("org.godotengine.kotlin:godot-library:1.0.0")
                        implementation("org.godotengine.kotlin:annotations:0.0.2")
                    }
                }
                if (project.hasProperty("iosSigningIdentity") && this.target.name == "iosArm64") {
                    tasks.build {
                        doLast {
                            exec {
                                commandLine = listOf("codesign", "-f", "-s", iosSigningIdentity, "build/bin/iosArm64/debugShared/libkotlin.dylib")
                            }
                            exec {
                                commandLine = listOf("install_name_tool", "-id", "@executable_path/dylibs/ios/libkotlin.dylib", "build/bin/iosArm64/debugShared/libkotlin.dylib")
                            }
                        }
                    }
                } else if (project.hasProperty("iosSigningIdentity") && this.target.name == "iosX64") {
                    tasks.build {
                        doLast {
                            exec {
                                commandLine = listOf("codesign", "-f", "-s", iosSigningIdentity, "build/bin/iosX64/debugShared/libkotlin.dylib")
                            }
                            exec {
                                commandLine = listOf("install_name_tool", "-id", "@executable_path/dylibs/ios/libkotlin.dylib", "build/bin/iosX64/debugShared/libkotlin.dylib")
                            }
                        }
                    }
                }
            } else {
                System.err.println("Not a native target! TargetName: ${target.name}")
            }
        }
    }
}
