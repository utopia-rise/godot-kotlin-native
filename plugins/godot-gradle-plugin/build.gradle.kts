plugins {
    `kotlin-dsl`
    `maven-publish`
    id("com.gradle.plugin-publish") version "0.10.1"
}

gradlePlugin {
    plugins {
        create("godotPlugin") {
            id = "com.utopia-rise.godot-kotlin"
            displayName = "Gradle plugin for godot-kotlin"
            implementationClass = "godot.gradle.GodotPlugin"
        }
    }
    isAutomatedPublishing = false
}

pluginBundle {
    website = "https://github.com/utopia-rise/godot-kotlin"
    vcsUrl = "https://github.com/utopia-rise/godot-kotlin.git"
    tags = listOf("kotlin", "godot", "gamedev")

    mavenCoordinates {
        groupId = "${project.group}"
        artifactId = "godot-gradle-plugin-${project.extra["godotVersion"]}"
        version = "${project.version}"
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("gradle-plugin"))
    implementation(kotlin("gradle-plugin-api"))

    godotProjectImplementation(":godot-build-props", project.extra["godotVersion"] as String)
    godotProjectCompileOnly(":godot-compiler-plugin-common", project.extra["godotVersion"] as String)
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
        // this is only used for publishing locally.
        val godotPlugin by creating(MavenPublication::class) {
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
