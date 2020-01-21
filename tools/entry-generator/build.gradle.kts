import java.util.*

plugins {
    id("java-library")
    id("application")
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
    id("com.jfrog.bintray")
    application
}

version = "1.0.0"
group = "org.godotengine.kotlin"

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.beust:klaxon:3.0.1")//5.2
    implementation("com.beust:klaxon:3.0.1")//5.2
}

application {
    mainClassName = "MainKt"
}

publishing {
    publications {
        register("entryGenerator", MavenPublication::class.java) {
            from(components["java"])
        }
    }
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

        setPublications("entryGenerator")
        pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
            userOrg = "utopia-rise"
            repo = "kotlin-godot"

            name = project.name
            vcsUrl = "https://github.com/utopia-rise/kotlin-godot-wrapper"
            setLicenses("Apache-2.0")
            version(closureOf<com.jfrog.bintray.gradle.BintrayExtension.VersionConfig> {
                this.name = project.version.toString()
                released = Date().toString()
                description = "Godot entry generator ${project.version}"
                vcsTag = project.version.toString()
            })
        })
    }
}