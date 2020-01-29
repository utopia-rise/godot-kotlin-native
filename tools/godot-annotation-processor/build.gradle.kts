import java.util.*

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("maven")
    id("kotlin-kapt")
    id("com.jfrog.bintray")
}

group = "org.godotengine.kotlin"
version = Dependencies.godotAnnotationProcessorVersion

repositories {
    mavenLocal()
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(project(":tools:annotations"))
    implementation("de.jensklingenberg:mpapt-runtime:${Dependencies.mpaptVersion}")
    implementation("com.squareup:kotlinpoet:${Dependencies.kotlinPoetVersion}")

    compileOnly("org.jetbrains.kotlin:kotlin-compiler-embeddable")
    compileOnly("com.google.auto.service:auto-service:${Dependencies.googleAutoServiceVersion}")
    kapt("com.google.auto.service:auto-service:${Dependencies.googleAutoServiceVersion}")
}

kapt {
    includeCompileClasspath = true
}

tasks.build {
    finalizedBy(tasks.install)
}

val bintrayUser: String by project
val bintrayKey: String by project

if (project.hasProperty("bintrayUser") && project.hasProperty("bintrayKey")) {
    bintray {
        user = bintrayUser
        key = bintrayKey

        setPublications("godotAnnotationProcessor")
        pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
            userOrg = "utopia-rise"
            repo = "kotlin-godot"

            name = project.name
            vcsUrl = "https://github.com/utopia-rise/kotlin-godot-wrapper"
            setLicenses("Apache-2.0")
            version(closureOf<com.jfrog.bintray.gradle.BintrayExtension.VersionConfig> {
                this.name = project.version.toString()
                released = Date().toString()
                description = "Godot annotation processor ${project.version}"
                vcsTag = project.version.toString()
            })
        })
    }
}