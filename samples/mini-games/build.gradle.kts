repositories {
    mavenLocal()
    jcenter()
}

plugins {
    id("com.utopia-rise.godot-kotlin") version "0.1.0"
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