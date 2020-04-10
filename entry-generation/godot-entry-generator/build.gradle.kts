plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(kotlin("compiler"))
    implementation("com.squareup:kotlinpoet:${DependenciesVersions.kotlinPoetVersion}")
}