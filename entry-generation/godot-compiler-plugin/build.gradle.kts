plugins {
    `kotlin-dsl`
    id("maven-publish")
}

dependencies {
    implementation(project(":godot-annotation-processor"))
    implementation(project(":godot-compiler-plugin-common"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    compileOnly(kotlin("compiler"))
}

tasks.build {
    dependsOn(":godot-annotation-processor:publishToMavenLocal")
    finalizedBy(tasks.publishToMavenLocal)
}