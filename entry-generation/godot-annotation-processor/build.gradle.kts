plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable")
}