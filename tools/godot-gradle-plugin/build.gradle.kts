import java.util.*

buildscript {
    repositories {
        mavenLocal()
        jcenter()
    }
}

plugins {
    id("java-gradle-plugin")
    id("maven-publish")
    id("org.jetbrains.kotlin.jvm")
    id("com.jfrog.bintray")
}

group = "org.godotengine.kotlin"
version = "1.0.1"

gradlePlugin {
    plugins {
        create("godotGradlePlugin") {
            id = "godot-gradle-plugin"
            implementationClass = "godot.gradle.plugin.KotlinGodotPlugin"
        }
    }
}

//TODO: these are overrides because somehow from somewhere the versions 1.3.30 are used which dont work in gradle 6.0.1 with kotlin 1.3.61. Find out from where those versions come and fix it there and then remove this block. (hint: use gradle :dependencies task)
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation(project(":tools:entry-generator"))
    implementation("org.jetbrains.kotlin:kotlin-native-utils:1.3.61")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
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

if(project.hasProperty("bintrayUser") && project.hasProperty("bintrayKey")) {
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