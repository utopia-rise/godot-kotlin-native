import godot.gradle.GodotPlatform

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
    platforms(
        GodotPlatform.SERVER_X64,
        GodotPlatform.WINDOWS_X64,
        GodotPlatform.OSX_X64
    )
}
