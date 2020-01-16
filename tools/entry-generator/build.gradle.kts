plugins {
    id("java-library")
    id("application")
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
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
        register("entryGenerator", MavenPublication::class) {
            from(components["java"])
        }
    }
}

tasks.build {
    finalizedBy(tasks.publishToMavenLocal)
}