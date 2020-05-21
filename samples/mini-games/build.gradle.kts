buildscript {
    repositories {
        mavenLocal()
        jcenter()
    }
}

repositories {
    mavenLocal()
    jcenter()
}

plugins {
    //Change plugin version to last locally built, while there is no release.
    id("com.utopia-rise.godot-kotlin") version "0.1.0-3.2.169+20200521T124527Z"
    kotlin("multiplatform") version "1.3.71"
}

godot {
    debug.set(true)
    cleanupGeneratedFiles.set(true)

    configureTargets {
        compilations.getByName("main") {
            cinterops {
                // create cinterop here
            }
        }
    }
}
