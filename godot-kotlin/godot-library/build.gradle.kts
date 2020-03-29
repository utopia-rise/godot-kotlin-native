plugins {
    kotlin("multiplatform")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

//TODO: this needs to be properly configured! This is just a basic setup to be able to implement the annotations
kotlin {
    linuxX64()
    mingwX64()
    macosX64()

    val nativeMain = sourceSets.create("nativeMain")

    targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget> {
        compilations.getByName("main").defaultSourceSet { dependsOn(nativeMain) }
    }
}