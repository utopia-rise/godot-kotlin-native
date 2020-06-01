plugins {
    kotlin("jvm")
    `maven-publish`
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly(kotlin("compiler"))
    implementation("com.squareup:kotlinpoet:${DependenciesVersions.kotlinPoetVersion}")
}

tasks {
    val sourceJar by creating(Jar::class) {
        archiveBaseName.set(project.name)
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
        val godotEntryGenerator by creating(MavenPublication::class) {
            pom {
                groupId = "${project.group}"
                artifactId = project.name
                version = "${project.version}"
            }
            from(components.getByName("java"))
            artifact(tasks.getByName("sourceJar"))
        }
    }
}

project.extra["artifacts"] = arrayOf("godotEntryGenerator")

apply {
    plugin(BintrayPublish::class.java)
}
