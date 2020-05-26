plugins {
    kotlin("jvm")
    `maven-publish`
}

dependencies {
    implementation(project(":godot-annotation-processor"))
    implementation(project(":godot-compiler-plugin-common"))
    implementation("de.jensklingenberg:mpapt-runtime:${DependenciesVersions.mpaptVersion}")
    compileOnly(kotlin("compiler"))
}

tasks {
    val sourceJar by creating(Jar::class) {
        archiveBaseName.set("${project.name}-${DependenciesVersions.godotVersion}")
        archiveVersion.set(project.version.toString())
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }

    build {
        finalizedBy(publishToMavenLocal)
    }
}

publishing {
    publications {
        val godotCompilerPlugin by creating(MavenPublication::class) {

            pom {
                groupId = "${project.group}"
                artifactId = "${project.name}-${DependenciesVersions.godotVersion}"
                version = "${project.version}"
            }
            from(components.getByName("java"))
            artifact(tasks.getByName("sourceJar"))
        }
    }
}

project.extra["artifacts"] = arrayOf("godotCompilerPlugin")

apply {
    plugin(BintrayPublish::class.java)
}
