plugins {
    kotlin("jvm")
    id("maven-publish")
}

dependencies {
    implementation(project(":godot-entry-generator"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    compileOnly(kotlin("compiler"))
}
