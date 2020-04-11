plugins {
    kotlin("jvm")
    id("maven-publish")
}

dependencies {
    implementation(project(":godot-annotation-processor"))
    implementation(project(":godot-compiler-plugin-common"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    compileOnly(kotlin("compiler"))
}
