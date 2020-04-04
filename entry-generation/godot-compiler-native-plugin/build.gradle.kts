plugins {
    `kotlin-dsl`
    id("maven")
    id("maven-publish")
}


dependencies {
    implementation(project(":godot-annotation-processor"))
    compileOnly(project(":godot-compiler-plugin-common"))
    compileOnly("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    compileOnly(kotlin("compiler"))
}

publishing {
    publications {
        register("godotCompilerNativePlugin", MavenPublication::class.java) {
            from(components["java"])
        }
    }
}

tasks.build {
    dependsOn(":godot-annotation-processor:install")
    finalizedBy(tasks.install)
}