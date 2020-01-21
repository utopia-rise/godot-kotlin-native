plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("maven-publish")
}

repositories {
    mavenLocal()
    jcenter()
    mavenCentral()
}

group = "org.godotengine.kotlin"
version = "0.0.1-SNAPSHOT"

kotlin {
    jvm()
    linuxX64("linux")
    mingwX64("windows")
    macosX64("macos")

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