plugins {
    `kotlin-dsl`
    id("maven-publish")
}

dependencies {
    compileOnly(kotlin("compiler"))
}

tasks.build {
    finalizedBy(tasks.publishToMavenLocal)
}