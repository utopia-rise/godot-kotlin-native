import de.undercouch.gradle.tasks.download.Download
import org.gradle.internal.os.OperatingSystem
import org.gradle.nativeplatform.OperatingSystemFamily.*

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

val godotTaskGroup = "godot"
val binaryOutputDir = "${project.buildDir}/godot/bin"

tasks {
    val downloadGodotBinaries by creating(Download::class.java) {
        val filename = getFileName()
        val url = getUrl(filename)
        val downloadedBinaryPath = project.file("${project.buildDir}/$filename")

        group = godotTaskGroup
        description = "Download godot executable for the current operating system."
        src(url)
        dest(downloadedBinaryPath)
        onlyIfNewer(true)
        onlyIfModified(true)
    }

    val extractGodotBinaries by creating(Copy::class.java) {
        group = godotTaskGroup
        dependsOn(downloadGodotBinaries)
        from(project.zipTree(project.file("${project.buildDir}/${getFileName()}")))
        into(binaryOutputDir)
    }

    val executeGodotTests by creating(Exec::class) {
        dependsOn(extractGodotBinaries)
        group = godotTaskGroup
        when (getCurrentOs()) {
            WINDOWS, LINUX ->
                commandLine("$binaryOutputDir/${getFileName().removeSuffix(".zip")}")
            MACOS ->
                commandLine("$binaryOutputDir/${getFileName().removeSuffix(".zip")}/Contents/MacOS/Godot")
            else -> throw IllegalStateException("Godot does not support your OS. Cannot execute tests")
        }
    }

    getByName("check") {
        dependsOn(executeGodotTests)
    }
}

fun getCurrentOs(): String {
    val current = OperatingSystem.current()
    return when {
        current.isLinux -> LINUX
        current.isMacOsX -> MACOS
        current.isWindows -> WINDOWS
        else -> throw AssertionError("Unsupported os: ${current.name}")
    }
}

fun getFileName(): String {
    val currentOs = getCurrentOs()
    val (base, rc) = getGodotBaseVersionAndPossibleReleaseCandidateVersion()

    val filename = StringBuilder("Godot_v${base}")
    if (rc == null) {
        filename.append("-stable")
    } else {
        filename.append("-rc${rc}")
    }
    when (currentOs) {
        WINDOWS -> filename.append("_win64.exe.zip")
        LINUX -> filename.append("_x11.64.zip")
        MACOS -> filename.append("_osx.64.zip")
        else -> throw AssertionError("Unsupported platform $currentOs")
    }
    return filename.toString()
}

fun getUrl(filename: String): String {
    val (base, rc) = getGodotBaseVersionAndPossibleReleaseCandidateVersion()
    val url = StringBuilder("https://downloads.tuxfamily.org/godotengine")
    url.append("/${base}")
    if (rc != null) {
        url.append("/rc${rc}")
    }
    url.append("/$filename")
    return url.toString()
}

fun getGodotBaseVersionAndPossibleReleaseCandidateVersion(): Pair<String, String?> {
    val godotVersion = "3.2.1" //TODO: don't hardcode
    val match = Regex("(?<base>\\d\\.\\d(?>\\.\\d)?)(?>-rc(?<rc>\\d))?").matchEntire(godotVersion)
    requireNotNull(match) { "Invalid godot version string: $godotVersion" }
    // match.groups[0] is always the full match
    val base = requireNotNull(match.groups[1])
    val rc = match.groups[2]

    return base.value to rc?.value
}
