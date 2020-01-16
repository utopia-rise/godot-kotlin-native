buildscript {
    repositories {
        mavenLocal()
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
        classpath("org.godotengine.kotlin:godot-gradle-plugin:1.0.1")
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

apply(plugin = "godot-gradle-plugin")

repositories {
    mavenLocal()
    jcenter()
}

kotlin {
    sourceSets {
        sourceSets.create("macosMain")
        sourceSets.create("linuxMain")
        sourceSets.create("windowsMain")
        configure(listOf(sourceSets["macosMain"], sourceSets["linuxMain"], sourceSets["windowsMain"])) {
            this.kotlin.srcDir("src/main/kotlin")
        }


        configure<godot.gradle.plugin.ConfigureGodotConvention> {
            this.configureGodot(listOf(sourceSets["macosMain"], sourceSets["linuxMain"], sourceSets["windowsMain"])) {
                sourceSet {
                    kotlin.srcDirs("src/main/kotlin")
                }

                libraryPath("samples.gdnlib")
                generateGDNS("${project.rootDir.absolutePath}/project")

                configs(
                        "src/main/kotlin/godot/samples/games/shmup/classes.json",
                        "src/main/kotlin/godot/samples/games/dodge/classes.json",
                        "src/main/kotlin/godot/samples/games/catchBall/classes.json",
                        "src/main/kotlin/godot/samples/games/main/classes.json",
                        "src/main/kotlin/godot/samples/games/fastFinish/classes.json",
                        "src/main/kotlin/godot/samples/games/pong/classes.json"
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
                    sharedLib(listOf(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG))
                }
                target.compilations.all {
                    dependencies {
                        implementation("org.godotengine.kotlin:godot-library:1.0.0")
                    }
                }
            } else {
                System.err.println("Not a native target! TargetName: ${target.name}")
            }
        }
    }
}

//to build the game samples either build them from the corresponding build task or set skipSamplesBuild in gradle.properties to false
tasks.build {
    onlyIf {
        println("Skipping game samples build: ${project.property("skipSamplesBuild")}")
        !(project.property("skipSamplesBuild") as String).toBoolean()
    }
}
