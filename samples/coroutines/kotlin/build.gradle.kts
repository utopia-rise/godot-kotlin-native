val platform: String by project
val armArch: String by project

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
                    "arm64" -> listOf(targetFromPreset(presets["iosArm64"], "iosArm64"))
                    "X64" -> listOf(targetFromPreset(presets["iosX64"], "iosX64"))
                    else -> listOf(targetFromPreset(presets["iosArm64"], "iosArm64"))
                }
            } else listOf(targetFromPreset(presets["iosArm64"], "iosArm64"))
            else -> listOf(targetFromPreset(presets["linuxX64"], "linux"))
        }
    } else {
        listOf(
                targetFromPreset(presets["godotLinuxX64"], "linux"),
                targetFromPreset(presets["godotMacosX64"], "macos"),
                targetFromPreset(presets["godotMingwX64"], "windows"),
                targetFromPreset(presets["iosArm64"], "iosArm64"),
                targetFromPreset(presets["iosX64"], "iosX64")
        )
    }

    targets.forEach { target ->
        target.compilations.getByName("main") {
            if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation) {
                println("Configuring target ${target.name}")
                this.target.binaries {
                    sharedLib(listOf(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG))
                }
                target.compilations.all {
                    dependencies {
                        implementation("org.godotengine.kotlin:godot-library-extension:1.0.0")
                    }
                }
            } else {
                System.err.println("Not a native target! TargetName: ${target.name}")
            }
        }
    }
}