buildscript {
    repositories {
        mavenLocal()
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
        configure(listOf(sourceSets["macosMain"], sourceSets["linuxMain"], sourceSets["windowsMain"])) {
            this.kotlin.srcDir("src/main/kotlin")
        }


        configure<org.godotengine.kotlin.gradleplugin.ConfigureGodotConvention> {
            this.configureGodot(listOf(sourceSets["macosMain"], sourceSets["linuxMain"], sourceSets["windowsMain"])) {
                sourceSet {
                    kotlin.srcDirs("src/main/kotlin")
                }

                libraryPath("coroutines.gdnlib")
                generateGDNS("${project.rootDir.absolutePath}/../project")

                configs(
                        "src/main/kotlin/godot/samples/coroutines/classes.json"
                )
            }
        }
    }

    val targets = listOf(
            targetFromPreset(presets["godotMingwX64"], "windows"),
            targetFromPreset(presets["godotLinuxX64"], "linux"),
            targetFromPreset(presets["godotMacosX64"], "macos")
    )

    targets.forEach { target ->
        target.compilations.getByName("main") {
            if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation) {
                println("Configuring target ${target.name}")
                this.target.binaries {
                    sharedLib(listOf(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.RELEASE))
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