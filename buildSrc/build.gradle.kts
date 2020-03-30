plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.3.71"))
    implementation("com.squareup:kotlinpoet:1.5.0")
}