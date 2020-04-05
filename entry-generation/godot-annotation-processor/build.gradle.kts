plugins {
    `kotlin-dsl`
    id("maven-publish")
}

dependencies {
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    compileOnly(kotlin("compiler"))
}