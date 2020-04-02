plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.3.72"))
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5")
    implementation(kotlin("gradle-plugin", version = "1.3.71"))
    implementation("com.beust:klaxon:3.0.1") //5.2

    //Remember to change version according to DependenciesVersion
    implementation("com.squareup:kotlinpoet:1.5.0")
}
