plugins {
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
}

group = "org.godotengine.kotlin"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenLocal()
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.squareup:kotlinpoet:${properties["kotlinPoetVersion"]}")
}

tasks.build {
    finalizedBy(tasks.publishToMavenLocal)
}