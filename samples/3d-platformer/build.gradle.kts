plugins {
    kotlin("multiplatform") version "1.3.71"
    id("com.utopia-rise.godot-kotlin") version "0.1.0-3.2"
}

repositories {
    mavenLocal()
    jcenter()
}


godot {
    debug.set(true)
}
