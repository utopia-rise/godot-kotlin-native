import org.apache.tools.ant.taskdefs.condition.Os

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
    id("com.utopia-rise.godot-kotlin") version "0.1.0"
    kotlin("multiplatform") version "1.3.71"
}

godot {
}

tasks {
    val executeGodotTests by creating(Exec::class) {
        when {
            Os.isFamily(Os.FAMILY_WINDOWS) -> commandLine("${project.rootDir}/bin/Godot_v3.2.1-stable_win64.exe")
            Os.isFamily(Os.FAMILY_UNIX) -> commandLine("${project.rootDir}/bin/Godot_v3.2.1-stable_x11.64")
            Os.isFamily(Os.FAMILY_MAC) -> commandLine("${project.rootDir}/bin/Godot.app/Contents/MacOS/Godot")
            else -> throw IllegalStateException("Godot does not support your OS. Cannot execute tests")
        }
    }

    getByName("check") {
        dependsOn(executeGodotTests)
    }
}
