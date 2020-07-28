import godot.gradle.Platform

buildscript {
    repositories {
        mavenLocal()
        jcenter()
    }
}

repositories {
    mavenLocal()
    jcenter()
    maven("https://dl.bintray.com/utopia-rise/godot-kotlin-dev")
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://kotlin.bintray.com/kotlinx")
}

plugins {
    // Change plugin version to last locally built, while there is no release.
    id("com.utopia-rise.godot-kotlin") version "0.1.0-3.2"
    kotlin("multiplatform") version "1.4.0-rc"
}

godot {
    debug.set(true)
    cleanupGeneratedFiles.set(false)
    defaultPlatforms()

//    configureTargets {
//        compilations.getByName("main") {
//            cinterops {
//                // create cinterop here
//            }
//        }
//    }
}
