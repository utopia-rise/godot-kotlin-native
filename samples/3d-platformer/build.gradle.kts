plugins {
    kotlin("multiplatform") version "1.3.72"
    id("com.utopia-rise.godot-kotlin") version "0.1.0-3.2-b1e88e7"
}

repositories {
    jcenter()
    // used for developing this binding, omit if not needed.
    mavenLocal()
}


godot {
    debug.set(true)
    defaultPlatforms()
}
