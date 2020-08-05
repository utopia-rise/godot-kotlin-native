plugins {
    kotlin("multiplatform") version "1.3.72"
    id("com.utopia-rise.godot-kotlin") version "0.1.0-3.2"
}

repositories {
    jcenter()
}


godot {
    debug.set(true)
    defaultPlatforms()
}
