import godot.gradle.GodotPlatform
import org.gradle.internal.os.OperatingSystem

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

tasks {
    val build by getting
    val runBenchmark by creating(Exec::class) {
        dependsOn(build)
        val current = OperatingSystem.current()
        executable = when {
            current.isLinux -> "bin/linux/godot"
            current.isMacOsX -> TODO()
            current.isWindows -> TODO()
            else -> throw AssertionError("Unsupported os: ${current.name}")
        }
        args(mutableListOf(
            "--no-window",
            "-q",
            "-s",
            "${file("scripts/Main.gd")}"
        ))
    }
}
