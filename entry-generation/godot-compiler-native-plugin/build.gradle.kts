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
    id("maven-publish")
}

apply(plugin = "com.github.johnrengelman.shadow")

dependencies {
    implementation(project(":godot-annotation-processor"))
    implementation(project(":godot-compiler-plugin-common"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    compileOnly(kotlin("compiler"))
}

val fatJar = task<Jar>("fatJar") {
    manifest {
        attributes["Implementation-Title"] = "Godot Kotlin Native Compiler Plugin Fat Jar"
        attributes["Implementation-Version"] = project.version
        attributes["Main-Class"] = "godot.compilerplugin.NativeComponentRegistrar"
    }
    archiveBaseName.set("godot-compiler-native-plugin")
    archiveVersion.set(project.version.toString())

    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    with(tasks["jar"] as CopySpec)
}

val shadowJar by tasks.getting(com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar::class) {
    manifest.inheritFrom(fatJar.manifest)
    archiveBaseName.set("godot-compiler-native-plugin")
    archiveVersion.set(project.version.toString())
    val classifier: String? = null //needed as we need to specify the type null represents. otherwise we get ambiguous overload exception during build
    archiveClassifier.set(classifier)
}

tasks.publishToMavenLocal {
    dependsOn(shadowJar)
}

tasks.build {
    dependsOn(":godot-annotation-processor:publishToMavenLocal", shadowJar)
    finalizedBy(tasks.publishToMavenLocal)
}