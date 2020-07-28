plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    mavenCentral()
    gradlePluginPortal()
    maven ("https://dl.bintray.com/kotlin/kotlin-eap")
    maven ("https://kotlin.bintray.com/kotlinx")
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.4.0-rc"))
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.11.0")

    //Remember to change version according to DependenciesVersion
    implementation("com.squareup:kotlinpoet:1.5.0")
}
