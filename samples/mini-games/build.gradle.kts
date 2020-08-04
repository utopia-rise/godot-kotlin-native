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
}

plugins {
    //Change plugin version to last locally built, while there is no release.
    id("com.utopia-rise.godot-kotlin") version "0.1.0-3.2"
    kotlin("multiplatform") version "1.3.72"
}

godot {
    debug.set(true)
    cleanupGeneratedFiles.set(true)

    configureTargets {
        compilations.getByName("main") {
            defaultSourceSet {
                dependencies {
                    implementation("com.utopia-rise:godot-extension-injection:0.1.0-3.2")
                }
            }
            cinterops {
                // create cinterop here
            }
        }
    }
}
