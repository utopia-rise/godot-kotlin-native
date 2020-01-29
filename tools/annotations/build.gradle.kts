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
version = Dependencies.annotationsVersion

val bintrayUser: String by project
val bintrayKey: String by project
val platform: String by project

kotlin {
    if (project.hasProperty("platform")) {
        when (platform) {
            "windows" -> mingwX64("windows")
            "linux" -> linuxX64("linux")
            "macos" -> macosX64("macos")
            else -> linuxX64("linux")
        }
    } else {
        linuxX64("linux")
        mingwX64("windows")
        macosX64("macos")
        jvm()
    }


    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        if (!project.hasProperty("platform")) {
            configure(listOf(sourceSets["jvmMain"])) {
                dependencies {
                    implementation(kotlin("stdlib-jdk8"))
                }
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
            repo = "annotations"

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