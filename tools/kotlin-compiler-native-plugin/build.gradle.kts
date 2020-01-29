import java.util.*

buildscript {
    repositories {
        mavenLocal()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath("com.github.jengelman.gradle.plugins:shadow:${Dependencies.shadowJarPluginVersion}")
    }
}

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("kotlin-kapt")
    id("maven")
    id("maven-publish")
    id("com.jfrog.bintray")
}

apply(plugin = "com.github.johnrengelman.shadow")

group = "org.godotengine.kotlin"
version = Dependencies.kotlinNativeCompilerPluginVersion

dependencies {
    implementation(project(":tools:godot-annotation-processor"))
    implementation("de.jensklingenberg:mpapt-runtime:${Dependencies.mpaptVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    compileOnly("org.jetbrains.kotlin:kotlin-compiler")
    compileOnly("com.google.auto.service:auto-service:${Dependencies.googleAutoServiceVersion}")
    kapt("com.google.auto.service:auto-service:${Dependencies.googleAutoServiceVersion}")
}

val fatJar = task<Jar>("fatJar") {
    manifest {
        attributes["Implementation-Title"] = "Godot Kotlin Native Compiler Plugin Fat Jar"
        attributes["Implementation-Version"] = project.version
        attributes["Main-Class"] = "org.godotengine.kotlin.compilerplugin.NativeComponentRegistrar"
    }
    archiveBaseName.set("kotlin-compiler-native-plugin")
    archiveVersion.set(project.version.toString())

    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    with(tasks["jar"] as CopySpec)
}

val shadowJar by tasks.getting(com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar::class) {
    manifest.inheritFrom(fatJar.manifest)
    archiveBaseName.set("kotlin-compiler-native-plugin")
    archiveVersion.set(project.version.toString())
    val classifier: String? = null //needed as we need to specify the type null represents. otherwise we get ambiguous overload exception during build
    archiveClassifier.set(classifier)
}

publishing {
    publications {
        create<MavenPublication>("shadow") {
            configure<com.github.jengelman.gradle.plugins.shadow.ShadowExtension> {
                component(this@create)
            }
        }
    }
}

tasks.install {
    dependsOn(shadowJar)
}

tasks.build {
    dependsOn(":tools:godot-annotation-processor:install", shadowJar)
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

        setPublications("godotCompilerNativePlugin")
        pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
            userOrg = "utopia-rise"
            repo = "kotlin-godot"

            name = project.name
            vcsUrl = "https://github.com/utopia-rise/kotlin-godot-wrapper"
            setLicenses("Apache-2.0")
            version(closureOf<com.jfrog.bintray.gradle.BintrayExtension.VersionConfig> {
                this.name = project.version.toString()
                released = Date().toString()
                description = "Godot Kotlin Compiler native Plugin ${project.version}"
                vcsTag = project.version.toString()
            })
        })
    }
}