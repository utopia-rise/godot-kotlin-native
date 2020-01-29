import java.util.*

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("kotlin-kapt")
    id("maven")
    id("com.jfrog.bintray")
}

group = "org.godotengine.kotlin"
version = Dependencies.kotlinCompilerPluginVersion

dependencies {
    implementation(project(":tools:godot-annotation-processor"))
    implementation("de.jensklingenberg:mpapt-runtime:${Dependencies.mpaptVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compileOnly("org.jetbrains.kotlin:kotlin-compiler-embeddable")
    compileOnly("com.google.auto.service:auto-service:${Dependencies.googleAutoServiceVersion}")
    kapt("com.google.auto.service:auto-service:${Dependencies.googleAutoServiceVersion}")
}

tasks.build {
    dependsOn(":tools:godot-annotation-processor:install")
    finalizedBy(tasks.install)
}

kapt {
    includeCompileClasspath = true
}

val bintrayUser: String by project
val bintrayKey: String by project

if (project.hasProperty("bintrayUser") && project.hasProperty("bintrayKey")) {
    bintray {
        user = bintrayUser
        key = bintrayKey

        setPublications("godotCompilerPlugin")
        pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
            userOrg = "utopia-rise"
            repo = "kotlin-godot"

            name = project.name
            vcsUrl = "https://github.com/utopia-rise/kotlin-godot-wrapper"
            setLicenses("Apache-2.0")
            version(closureOf<com.jfrog.bintray.gradle.BintrayExtension.VersionConfig> {
                this.name = project.version.toString()
                released = Date().toString()
                description = "Godot Kotlin Compiler Plugin ${project.version}"
                vcsTag = project.version.toString()
            })
        })
    }
}