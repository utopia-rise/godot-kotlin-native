import com.jfrog.bintray.gradle.tasks.BintrayUploadTask
import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    `maven-publish`
}

kotlin {
    // we don't have godot-library in the mobile targets yet, limit these to desktop for now
    //has to be change in `GodotPlugin` of `godot-gradle-plugin` as well
    macosX64("macos")
    linuxX64("linux")
    mingwX64("windows")

    targets.withType<KotlinNativeTarget> {
        compilations.getByName("main") {
            defaultSourceSet {
                kotlin.srcDir("src/native/kotlin")
            }
            dependencies {
                implementation("com.utopia-rise:godot-library:${version}")
            }
        }
    }
    sourceSets {
        all {
            languageSettings.enableLanguageFeature("InlineClasses")
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
