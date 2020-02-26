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
val armArch: String by project

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

kotlin {
    if (project.hasProperty("platform")) {
        when (platform) {
            "windows" -> mingwX64("windows")
            "linux" -> linuxX64("linux")
            "macos" -> macosX64("macos")
            "android" -> if (project.hasProperty("armArch")) {
                when(armArch) {
                    "X64" -> androidNativeX64("androidX64")
                    "arm64" -> androidNativeArm64("androidArm64")
                    else -> androidNativeArm64("androidArm64")
                }
            } else androidNativeArm64("androidArm64")
            "ios" -> if (project.hasProperty("armArch")) {
                when(armArch) {
                    "arm64" -> iosArm64("iosArm64")
                    "X64" -> iosX64("iosX64")
                }
            } else iosArm64("iosArm64")
            else -> {
                linuxX64("linux")
                mingwX64("windows")
                macosX64("macos")
                androidNativeX64("androidX64")
                androidNativeArm64("androidArm64")
                iosArm64("iosArm64")
                iosX64("iosX64")
            }
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

        configure(getSourceSetsToConfigure()) {
            dependencies {
                implementation(project(":wrapper:godot-library"))
            }
        }
    }
}

tasks.build {
    finalizedBy(tasks.publishToMavenLocal)
}

tasks {
    // workaround to upload gradle metadata file
    // https://github.com/bintray/gradle-bintray-plugin/issues/229
    withType<com.jfrog.bintray.gradle.tasks.BintrayUploadTask> {
        doFirst {
            publishing.publications.withType<MavenPublication> {
                buildDir.resolve("publications/$name/module.json").also {
                    if (it.exists()) {
                        artifact(object: org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact(it) {
                            override fun getDefaultExtension() = "module"
                        })
                    }
                }
            }
        }
    }
}

if (project.hasProperty("bintrayUser") && project.hasProperty("bintrayKey") && project.hasProperty("platform")) {
    bintray {
        user = bintrayUser
        key = bintrayKey
        val armString = if (project.hasProperty("armArch")) armArch else ""
        setPublications(platform + armString.capitalize())
        pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
            userOrg = "utopia-rise"
            repo = "kotlin-godot"

            name = "${project.name}-$platform$armString"
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

fun getSourceSetsToConfigure(): List<org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet> {
    return if (project.hasProperty("platform")) {
        listOf(when (platform) {
            "windows" -> kotlin.sourceSets["windowsMain"]
            "linux" -> kotlin.sourceSets["linuxMain"]
            "macos" -> kotlin.sourceSets["macosMain"]
            "android" -> if (project.hasProperty("armArch")) {
                when(armArch) {
                    "X64" -> kotlin.sourceSets["androidX64Main"]
                    "arm64" -> kotlin.sourceSets["androidArm64Main"]
                    else -> kotlin.sourceSets["androidArm64Main"]
                }
            } else kotlin.sourceSets["androidArm64Main"]
            "ios" -> if (project.hasProperty("armArch")) {
                when(armArch) {
                    "arm64" -> kotlin.sourceSets["iosArm64Main"]
                    "X64" -> kotlin.sourceSets["iosX64Main"]
                    else -> kotlin.sourceSets["iosArm64Main"]
                }
            } else kotlin.sourceSets["iosArm64Main"]
            else -> kotlin.sourceSets["linuxMain"]
        })
    } else {
        listOf(
                kotlin.sourceSets["linuxMain"],
                kotlin.sourceSets["androidX64Main"],
                kotlin.sourceSets["androidArm64Main"],
                kotlin.sourceSets["macosMain"],
                kotlin.sourceSets["iosX64Main"],
                kotlin.sourceSets["iosArm64Main"],
                kotlin.sourceSets["windowsMain"]
        )
    }
}