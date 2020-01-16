plugins {
    id("kotlin-multiplatform")
    id("maven-publish")
}

group = "org.godotengine.kotlin"
version = "1.0.0"

kotlin {
    sourceSets {
        sourceSets.create("macosMain")
        sourceSets.create("linuxMain")
        sourceSets.create("windowsMain")
        configure(listOf(sourceSets["macosMain"], sourceSets["linuxMain"], sourceSets["windowsMain"])) {
            this.kotlin.srcDir("src/main/kotlin")
        }
    }

    val windows = targetFromPreset(presets["mingwX64"], "windows")
    val linux = targetFromPreset(presets["linuxX64"], "linux")
    val macos = targetFromPreset(presets["macosX64"], "macos")
    val targets = listOf(
            windows,
            linux,
            macos
    )

    targets.forEach { target ->
        target.compilations.all {
            dependencies {
                implementation(project(":wrapper:godot-library"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-native:1.3.3")
            }
        }
    }
}

tasks.build {
    finalizedBy(tasks.publishToMavenLocal)
}