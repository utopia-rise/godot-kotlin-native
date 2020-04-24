package godot.gradle

import godot.utils.GodotBuildProperties
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.internal.os.OperatingSystem
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType
import org.jetbrains.kotlin.konan.target.HostManager

class GodotPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        require(project.rootProject == project) { "godot-kotlin plugin can only be applied on the root project!" }
        project.pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
            val mpp = project.extensions.getByType<KotlinMultiplatformExtension>()
            val godot = project.extensions.create<GodotExtension>("godot", project.objects)
            setupExtensionDefaults(project, godot)
            setupKotlinPlugin(project, mpp, godot)
        }
    }

    private fun setupExtensionDefaults(project: Project, godot: GodotExtension) {
        with(godot) {
            // we don't have godot-library in the mobile targets yet, limit these to desktop for now
            //has to be change in `build.gradle.kts` of `godot-library` as well
            platforms(
                Platform.LINUX_X64,
                Platform.WINDOWS_X64,
                Platform.OSX_X64
            )
            debug.set(true)
            cleanupGeneratedFiles.set(true)
            gdnsDir.set(project.file("src/gdns/kotlin"))
            gdnlibFile.set(project.file("${project.name.toLowerCase()}.gdnlib"))
            entrySourceDir.set(project.buildDir.resolve("godot-entry"))
        }
    }

    private fun setupKotlinPlugin(project: Project, mpp: KotlinMultiplatformExtension, godot: GodotExtension) {
        project.afterEvaluate {
            // create the main source set
            // val godotMain = mpp.sourceSets.create(MAIN_SOURCE_SET_NAME)
            // val godotTest = mpp.sourceSets.create(TEST_SOURCE_SET_NAME)

            fun KotlinNativeTarget.configureSourceSets(includeEntrySourceDir: Boolean) {
                compilations.getByName("main").defaultSourceSet {
                    kotlin.srcDirs("src/$MAIN_SOURCE_SET_NAME/kotlin")
                    if (includeEntrySourceDir) {
                        kotlin.srcDirs(godot.entrySourceDir.get().asFile)
                    }

                    dependencies {
                        // TODO: remove this once we have published the godot-library artifact.
                        // don't add dependencies to targets not buildable in the current host
                        if (HostManager().isEnabled(this@configureSourceSets.konanTarget)) {
                            implementation("com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}")
                        }
                    }
                }

                compilations.getByName("test").defaultSourceSet {
                    kotlin.srcDirs("src/$TEST_SOURCE_SET_NAME/kotlin")
                }
            }

            // create dummy target and connect it to the main source set
            // this target is only used for generating entry source files.
            val os = OperatingSystem.current()
            val dummyTarget = when {
                os.isLinux -> mpp.linuxX64("dummyTarget")
                os.isWindows -> mpp.mingwX64("dummyTarget")
                os.isMacOsX -> mpp.macosX64("dummyTarget")
                else -> throw AssertionError("Unsupported operating system: $os")
            }
            dummyTarget.configureSourceSets(false)
            godot.configureTarget(dummyTarget)

            val buildTask = project.tasks.getByName("build")

            // clean up task
//            if (godot.cleanupGeneratedFiles.get()) {
//                val cleanGeneratedFilesTask = project.tasks.register<Delete>("cleanGeneratedFiles") {
//                    group = GODOT_TASK_GROUP
//                    delete(godot.gdnsDir.get())
//                }
//                buildTask.dependsOn(cleanGeneratedFilesTask)
//            }

            // create the targets and connect it to the main source set
            godot.platforms.get().forEach { platform ->
                val target = when (platform) {
                    Platform.LINUX_X64 -> mpp.linuxX64("linuxX64")
                    Platform.WINDOWS_X64 -> mpp.mingwX64("windowsX64")
                    Platform.OSX_X64 -> mpp.macosX64("macosX64")
                    Platform.ANDROID_X64 -> mpp.androidNativeX64("androidX64")
                    Platform.ANDROID_ARM64 -> mpp.androidNativeArm64("androidArm64")
                    Platform.IOS_X64 -> mpp.iosX64("iosX64")
                    Platform.IOS_ARM64 -> mpp.iosArm64("iosArm64")
                    else -> throw AssertionError("Unsupported platform: $platform")
                }
                target.configureSourceSets(true)
                with(target) {
                    // link this target's compile task to the dummy target
                    // this ensure that the dummy target is compiled first so that
                    // the entry files are generated before the actual targets gets compiled.
                    target.compilations.getByName("main").compileKotlinTask.dependsOn(
                        dummyTarget.compilations.getByName("main").compileKotlinTask
                    )
                    binaries {
                        val buildType = if (godot.debug.get()) {
                            NativeBuildType.DEBUG
                        } else {
                            NativeBuildType.RELEASE
                        }
                        sharedLib(buildTypes = listOf(buildType)) {
                            // this will create a task dependency
                            // build -> build<Target> -> link<BuildType><Target>
                            project.tasks.register("build${target.name.capitalize()}") {
                                group = GODOT_TASK_GROUP
                                dependsOn(linkTask)
                                buildTask.dependsOn(this)
                            }
                        }
                    }
                }
                godot.configureTarget(target)
            }
        }
    }

    companion object {
        const val MAIN_SOURCE_SET_NAME = "godotMain"
        const val TEST_SOURCE_SET_NAME = "godotTest"
        const val GODOT_TASK_GROUP = "Godot"
    }
}
