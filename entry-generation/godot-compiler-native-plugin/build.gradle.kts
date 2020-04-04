buildscript {
    repositories {
        mavenLocal()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath("com.github.jengelman.gradle.plugins:shadow:${DependenciesVersions.shadowJarPluginVersion}")
    }
}

plugins {
    `kotlin-dsl`
    id("maven")
    id("maven-publish")
}

apply(plugin = "com.github.johnrengelman.shadow")

dependencies {
    implementation(project(":godot-annotation-processor"))
    implementation(project(":godot-compiler-plugin-common"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable")
}

val fatJar = task<Jar>("fatJar") {
    @Suppress("UnstableApiUsage")
    manifest {
        attributes["Implementation-Title"] = "Godot Kotlin Native Compiler Plugin Fat Jar"
        attributes["Implementation-Version"] = project.version
        attributes["Main-Class"] = "godot.compilerplugin.NativeComponentRegistrar"
    }
    archiveBaseName.set("godot-compiler-native-plugin")
    archiveVersion.set(project.version.toString())
    isZip64 = true //needed to include the compiler embeddable in the zip as the zip is getting large with it

    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    kotlin {
        tasks["jar"] as CopySpec
    }
//    kotlin.with(tasks["jar"] as CopySpec)
}

val shadowJar by tasks.getting(com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar::class) {
    @Suppress("UnstableApiUsage")
    manifest.inheritFrom(fatJar.manifest)
    archiveBaseName.set("godot-compiler-native-plugin")
    archiveVersion.set(project.version.toString())
    isZip64 = true //needed to include the compiler embeddable in the zip as the zip is getting large with it
    val classifier: String? = null //needed as we need to specify the type null represents. otherwise we get ambiguous overload exception during build
    archiveClassifier.set(classifier)
}

publishing {
    publications {
        register<MavenPublication>("godotCompilerNativePlugin") {
            configure<com.github.jengelman.gradle.plugins.shadow.ShadowExtension> {
                component(this@register)
            }
        }
    }
}

tasks.install {
    dependsOn(shadowJar)
}

tasks.build {
    dependsOn(":godot-annotation-processor:install", shadowJar)
    finalizedBy(tasks.install)
}