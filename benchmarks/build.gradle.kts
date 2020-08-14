import godot.gradle.GodotPlatform
import org.gradle.internal.os.OperatingSystem
import de.undercouch.gradle.tasks.download.Download

plugins {
    kotlin("multiplatform") version "1.3.72"
    id("com.utopia-rise.godot-kotlin") version "0.1.0-3.2-b1e88e7"
    id("de.undercouch.download") version "4.1.1"
    id("org.ajoberstar.grgit") version "4.0.2"
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
    val current = OperatingSystem.current()

    val downloadGodot by creating(Download::class) {
        src(when {
            current.isLinux -> "https://downloads.tuxfamily.org/godotengine/3.2.2/Godot_v3.2.2-stable_linux_headless.64.zip"
            current.isMacOsX -> TODO()
            current.isWindows -> TODO()
            else -> throw AssertionError("Unsupported os: ${current.name}")
        })
        dest("$buildDir/godot.zip")
        onlyIfNewer(true)
    }

    val unzipGodot by creating(Copy::class) {
        dependsOn(downloadGodot)
        from(zipTree(downloadGodot.dest))
        into("$buildDir/extracted")
    }

    val runBenchmarks by creating(Exec::class) {
        dependsOn(build, unzipGodot)
        executable = when {
            current.isLinux -> "$buildDir/extracted/Godot_v3.2.2-stable_linux_headless.64"
            current.isMacOsX -> TODO()
            current.isWindows -> TODO()
            else -> throw AssertionError("Unsupported os: ${current.name}")
        }
        val currentCommit = grgit.head()
        args(mutableListOf(
            "--no-window",
            "-q",
            "--commit=${currentCommit.abbreviatedId}",
            "-s",
            "${file("scripts/Main.gd")}"
        ))
    }
}
