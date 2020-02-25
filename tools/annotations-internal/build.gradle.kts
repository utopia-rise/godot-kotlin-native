import java.util.*

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("maven-publish")
    id("com.jfrog.bintray")
}

repositories {
    mavenLocal()
    jcenter()
    mavenCentral()
}

group = "org.godotengine.kotlin"
version = Dependencies.internalAnnotationsVersion

val bintrayUser: String by project
val bintrayKey: String by project
val platform: String by project
val armArch: String by project

kotlin {
    if (project.hasProperty("platform")) {
        when (platform) {
            "windows" -> mingwX64("windows")
            "linux" -> linuxX64("linux")
            "macos" -> macosX64("macos")
            "android" -> if (project.hasProperty("armArch")) {
                when (armArch) {
                    "X64" -> androidNativeX64("androidX64")
                    "arm64" -> androidNativeArm64("androidArm64")
                    else -> androidNativeArm64("androidArm64")
                }
            } else androidNativeArm64("androidArm64")
            "ios" -> if (project.hasProperty("armArch")) {
                when (armArch) {
                    "arm64" -> iosArm64("iosArm64")
                    "X64" -> iosX64("iosX64")
                }
            } else iosArm64("iosArm64")
            else -> linuxX64("linux")
        }
    } else {
        linuxX64("linux")
        mingwX64("windows")
        macosX64("macos")
        androidNativeX64("androidX64")
        androidNativeArm64("androidArm64")
        iosArm64("iosArm64")
        iosX64("iosX64")
    }
    jvm()


    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        configure(listOf(sourceSets["jvmMain"])) {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
    }
}

tasks.build {
    finalizedBy(tasks.publishToMavenLocal)
}

if (project.hasProperty("bintrayUser") && project.hasProperty("bintrayKey") && project.hasProperty("platform")) {
    bintray {
        user = bintrayUser
        key = bintrayKey
        setPublications(platform)
        pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
            userOrg = "utopia-rise"
            repo = "annotations-internal"

            name = "${project.name}-$platform"
            vcsUrl = "https://github.com/utopia-rise/kotlin-godot-wrapper"
            setLicenses("Apache-2.0")
            version(closureOf<com.jfrog.bintray.gradle.BintrayExtension.VersionConfig> {
                this.name = project.version.toString()
                released = Date().toString()
                description = "Godot annotations ${project.version}"
                vcsTag = project.version.toString()
            })
        })
    }
}