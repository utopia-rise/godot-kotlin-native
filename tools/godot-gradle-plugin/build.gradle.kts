import java.util.*

buildscript {
    repositories {
        mavenLocal()
        jcenter()
        mavenCentral()
    }
}

plugins {
    id("java-gradle-plugin")
    id("maven-publish")
    id("org.jetbrains.kotlin.jvm")
    id("com.jfrog.bintray")
    id("kotlin-kapt")
}

group = "org.godotengine.kotlin"
version = Dependencies.godotGradlePluginVersion

gradlePlugin {
    plugins {
        create("godotGradlePlugin") {
            id = "godot-gradle-plugin"
            implementationClass = "org.godotengine.kotlin.gradleplugin.KotlinGodotPlugin"
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation(project(":tools:entry-generator"))

    compileOnly("com.google.auto.service:auto-service:${Dependencies.googleAutoServiceVersion}")
    kapt("com.google.auto.service:auto-service:${Dependencies.googleAutoServiceVersion}")

    implementation("org.jetbrains.kotlin:kotlin-native-utils:${Dependencies.kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Dependencies.kotlinVersion}")
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
}

tasks.build {
    finalizedBy(tasks.publishToMavenLocal)
}

val bintrayUser: String by project
val bintrayKey: String by project

if (project.hasProperty("bintrayUser") && project.hasProperty("bintrayKey")) {
    bintray {
        user = bintrayUser
        key = bintrayKey
        setPublications("pluginMaven")
        pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
            userOrg = "utopia-rise"
            repo = "kotlin-godot"

            name = project.name
            vcsUrl = "https://github.com/utopia-rise/kotlin-godot-wrapper"
            setLicenses("Apache-2.0")
            version(closureOf<com.jfrog.bintray.gradle.BintrayExtension.VersionConfig> {
                this.name = project.version.toString()
                released = Date().toString()
                description = "Godot gradle plugin ${project.version}"
                vcsTag = project.version.toString()
            })
        })
    }
}