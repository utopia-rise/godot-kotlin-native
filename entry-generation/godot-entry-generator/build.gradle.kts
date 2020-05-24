plugins {
    `kotlin-dsl`
    `maven-publish`
}

dependencies {
    compileOnly(kotlin("compiler"))
    implementation("com.squareup:kotlinpoet:${DependenciesVersions.kotlinPoetVersion}")
}

tasks {
    build {
        finalizedBy(publishToMavenLocal)
    }

    withType<PublishToMavenLocal>().configureEach {
        publication.artifactId += "-${DependenciesVersions.godotVersion}"
    }
}
