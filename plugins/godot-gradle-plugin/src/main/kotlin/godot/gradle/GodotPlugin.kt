package godot.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.internal.os.OperatingSystem
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType

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
            platforms(*Platform.values())
            debug.set(false)
            cleanupGeneratedFiles.set(true)
            gdnsDir.set(project.file("src/gdns/kotlin"))
            entrySourceDir.set(project.buildDir.resolve("godot-entry"))
        }
    }

    private fun setupKotlinPlugin(project: Project, mpp: KotlinMultiplatformExtension, godot: GodotExtension) {
        project.afterEvaluate {
            // create the main source set
            val godotMain = mpp.sourceSets.create(MAIN_SOURCE_SET_NAME)
            val godotTest = mpp.sourceSets.create(TEST_SOURCE_SET_NAME)

            fun KotlinNativeTarget.configureSourceSets(includeEntrySourceDir: Boolean) {
                compilations.getByName("main").defaultSourceSet {
                    dependsOn(godotMain)
                    if (includeEntrySourceDir) {
                        kotlin.srcDirs += godot.entrySourceDir.get().asFile
                    }
                }

                compilations.getByName("test").defaultSourceSet {
                    dependsOn(godotTest)
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

            // create the targets and connect it to the main source set
            godot.platforms.get().forEach { platform ->
                val target = when (platform) {
                    Platform.LINUX_X64 -> mpp.linuxX64("linuxX64")
                    Platform.WINDOWS_X64 -> mpp.mingwX64("windowsX64")
                    Platform.OSX_X64 -> mpp.macosX64("macosX64")
                    Platform.ANDROID_X32 -> mpp.androidNativeArm32("androidX32")
                    Platform.ANDROID_X64 -> mpp.androidNativeArm64("androidX64")
                    Platform.IOS_X64 -> mpp.iosX64("iosX64")
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
                                group = "Godot"
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
    }
}