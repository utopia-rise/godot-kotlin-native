plugins {
    `kotlin-dsl`
    id("maven")
}

dependencies {
    compileOnly("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    compileOnly(kotlin("compiler"))
}