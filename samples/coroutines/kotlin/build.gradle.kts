val platform: String by project
val armArch: String by project
val iosSigningIdentity: String by project
val buildType: String? by project

buildscript {
    repositories {
        mavenLocal()
        maven("https://dl.bintray.com/utopia-rise/kotlin-godot")
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
        classpath("org.godotengine.kotlin:godot-gradle-plugin:1.0.1")
    }
}

repositories {
    mavenLocal()
    maven("https://dl.bintray.com/utopia-rise/kotlin-godot")
    jcenter()
}

plugins {
    id("org.jetbrains.kotlin.multiplatform") version ("1.3.61")
}

apply(plugin = "godot-gradle-plugin")

kotlin {
    sourceSets {
        sourceSets.create("macosMain")
        sourceSets.create("linuxMain")
        sourceSets.create("windowsMain")
        sourceSets.create("iosArm64Main")
        sourceSets.create("iosX64Main")
        configure(listOf(
                sourceSets["macosMain"],
                sourceSets["linuxMain"],
                sourceSets["windowsMain"],
                sourceSets["iosArm64Main"],
                sourceSets["iosX64Main"]
        )) {
            this.kotlin.srcDir("src/main/kotlin")
        }


        configure<org.godotengine.kotlin.gradleplugin.ConfigureGodotConvention> {
            this.configureGodot(listOf(
                    sourceSets["macosMain"],
                    sourceSets["linuxMain"],
                    sourceSets["windowsMain"],
                    sourceSets["iosArm64Main"],
                    sourceSets["iosX64Main"]
            )) {
                sourceSet {
                    kotlin.srcDirs("src/main/kotlin")
                }

                libraryPath("coroutines.gdnlib")
                generateGDNS("${project.rootDir.absolutePath}/..")

                configs(
                        "src/main/kotlin/godot/samples/coroutines/classes.json"
                )
            }
        }
    }

    val targets = if (project.hasProperty("platform")) {
        when (platform) {
            "windows" -> listOf(targetFromPreset(presets["godotMingwX64"], "windows"))
            "linux" -> listOf(targetFromPreset(presets["godotLinuxX64"], "linux"))
            "macos" -> listOf(targetFromPreset(presets["godotMacosX64"], "macos"))
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
                targetFromPreset(presets["godotIosArm64"], "iosArm64"),
                targetFromPreset(presets["godotIosX64"], "iosX64")
        )
    }

    targets.forEach { target ->
        target.compilations.getByName("main") {
            if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation) {
                println("Configuring target ${this.target.name}")
                this.target.binaries {
                    val libTarget = when(buildType?.toLowerCase()) {
                        "release" -> listOf(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.RELEASE)
                        "debug" -> listOf(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG)
                        else -> {
                            logger.warn("Build target not specified, defaulting to DEBUG. To set release target, specify: -PbuildType=RELEASE")
                            listOf(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG)
                        }
                    }
                    sharedLib(libTarget)
                }
                this.target.compilations.all {
                    dependencies {
                        implementation("org.godotengine.kotlin:godot-library-extension:1.0.0")
                    }
                }
                if (project.hasProperty("iosSigningIdentity") && this.target.name == "iosArm64") {
                    tasks.build {
                        doLast {
                            exec {
                                commandLine = listOf("codesign", "-f", "-s", iosSigningIdentity, "build/bin/iosArm64/releaseShared/libkotlin.dylib")
                            }
                            exec {
                                commandLine = listOf("install_name_tool", "-id", "@executable_path/dylibs/ios/libkotlin.dylib", "build/bin/iosArm64/releaseShared/libkotlin.dylib")
                            }
                        }
                    }
                } else if (project.hasProperty("iosSigningIdentity") && this.target.name == "iosX64") {
                    tasks.build {
                        doLast {
                            exec {
                                commandLine = listOf("codesign", "-f", "-s", iosSigningIdentity, "build/bin/iosX64/releaseShared/libkotlin.dylib")
                            }
                            exec {
                                commandLine = listOf("install_name_tool", "-id", "@executable_path/dylibs/ios/libkotlin.dylib", "build/bin/iosX64/releaseShared/libkotlin.dylib")
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