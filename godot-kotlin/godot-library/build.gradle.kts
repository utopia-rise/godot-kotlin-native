import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import com.jfrog.bintray.gradle.tasks.BintrayUploadTask
import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact

plugins {
    kotlin("multiplatform")
    `maven-publish`
}

//TODO: this needs to be properly configured! This is just a basic setup to be able to implement the annotations
kotlin {
    // we don't have godot-library in the mobile targets yet, limit these to desktop for now
    //has to be change in `GodotPlugin` of `godot-gradle-plugin` as well
    macosX64("macos")
    linuxX64("linux")
    mingwX64("windows")

    // val internalSourceSet = sourceSets.create("nativeInternal")
    // val coreSourceSet = sourceSets.create("nativeCore") { dependsOn(internalSourceSet) }
    // val generatedSourceSet = sourceSets.create("nativeGen") { dependsOn(coreSourceSet) }
    // val publicSourceSet = sourceSets.create("nativePublic") { dependsOn(generatedSourceSet) }


    targets.withType<KotlinNativeTarget> {
        compilations.getByName("main") {
            defaultSourceSet {
                // dependsOn(internalSourceSet)
                // dependsOn(generatedSourceSet)
                // dependsOn(coreSourceSet)
                // dependsOn(publicSourceSet)
                kotlin.srcDirs(
                    listOf(
                        "nativeInternal",
                        "nativeCore",
                        "nativeGen",
                        "nativePublic"
                    ).map { "src/$it/kotlin" })
            }
            val gdnative by cinterops.creating {
                defFile("src/nativeInterop/cinterop/godot.def")
                includeDirs("$rootDir/godot-kotlin/godot-headers/", "src/nativeInterop/cinterop")
            }
        }
    }
}

tasks {
    build {
        finalizedBy(publishToMavenLocal)
    }

    // workaround to upload gradle metadata file
    // https://github.com/bintray/gradle-bintray-plugin/issues/229
    withType<BintrayUploadTask> {
        doFirst {
            publishing.publications.withType<MavenPublication> {
                buildDir.resolve("publications/$name/module.json").also {
                    if (it.exists()) {
                        artifact(object: FileBasedMavenArtifact(it) {
                            override fun getDefaultExtension() = "module"
                        })
                    }
                }
            }
        }
    }

    withType<PublishToMavenLocal>().configureEach {
        publication.artifactId += "-${DependenciesVersions.godotVersion}"
    }
}

//TODO: See how to do with mobile platforms
project.extra["artifacts"] = when (currentOS) {
    OS.LINUX -> arrayOf("kotlinMultiplatform", "metadata", "linux")
    OS.WINDOWS -> arrayOf("windows")
    OS.MACOS -> arrayOf("macos")
}

apply {
    plugin(BintrayPublish::class.java)
}
