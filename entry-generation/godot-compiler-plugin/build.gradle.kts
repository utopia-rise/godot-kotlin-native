plugins {
    `kotlin-dsl`
    id("maven")
    id("maven-publish")
}

dependencies {
    implementation(project(":godot-annotation-processor"))
    implementation(project(":godot-compiler-plugin-common"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable")
}

publishing {
    publications {
        register("godotCompilerPlugin", MavenPublication::class.java) {
            from(components["java"])
        }
    }
}

tasks.build {
    dependsOn(":godot-annotation-processor:install")
    finalizedBy(tasks.install)
}