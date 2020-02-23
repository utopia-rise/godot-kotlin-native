package org.godotengine.kotlin.gradleplugin

import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinTargetPreset
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetPreset
import org.jetbrains.kotlin.konan.target.KonanTarget


class KotlinGodotTargetPreset(
        private val name: String,
        private val project: Project,
        konanTarget: KonanTarget,
        private val kotlinGodotPluginExtension: KotlinGodotPluginExtension
) : KotlinTargetPreset<KotlinNativeTarget> {

    private val nativePreset = KotlinNativeTargetPreset(name, project, konanTarget, kotlinGodotPluginExtension.kotlinVersion)
    private val kotlin = project.extensions.getByName("kotlin") as KotlinMultiplatformExtension


    override fun getName(): String = name

    override fun createTarget(name: String): KotlinNativeTarget {
        val target = nativePreset.createTarget(name)

        target.compilations.getByName("main") {
            it.target.binaries {
                sharedLib(listOf(kotlinGodotPluginExtension.releaseType))
            }
        }

        target.compilations.all { compilation ->
            compilation.apply {

                this.kotlinSourceSets.forEach { kotlinSourceSet ->
                    kotlinSourceSet.kotlin.srcDir(project.buildDir.absolutePath + "/godot/entries/" + kotlinSourceSet.name)
                }
                addGeneratorTasks()
            }
        }
        return target
    }


    private fun KotlinNativeCompilation.addGeneratorTasks() {
        kotlinSourceSets.forEachIndexed { index, sourceSet ->
            val entryPath = project.buildDir.absolutePath + "/godot/entries/" + sourceSet.name
            sourceSet.kotlin.srcDir(entryPath)

            if (index == 0) {
                val dummyTarget = nativePreset.createTarget("entryGeneration${sourceSet.name.capitalize()}").apply {
                    this.compilations.all { compilation ->
                        compilation.source(sourceSet)
                    }
                }
                kotlin.targets.add(dummyTarget)

                val dependencyResolutionTask = project.tasks.create("resolveDependenciesFor${sourceSet.name.capitalize()}") { task ->
                    task.group = "godotInternalTasks"
                    task.doFirst { _ ->
                        project
                                .configurations
                                .filter { it.name.contains("${target.name}Implementation") }
                                .flatMap { it.dependencies }
                                .filter { it.group != null && it.version != null }
                                .forEach {
                                    kotlin.targets.getByName("entryGeneration${sourceSet.name.capitalize()}").compilations.forEach { compilation ->
                                        compilation.apply {
                                            dependencies {
                                                implementation("${it.group}:${it.name}:${it.version}")
                                            }
                                        }
                                    }
                                }
                    }
                }

                project.getTasksByName("compileKotlinEntryGeneration${sourceSet.name.capitalize()}", false).forEach { task ->
                    task.dependsOn(dependencyResolutionTask)
                }
            }

            project.getTasksByName(compileKotlinTaskName, false).forEach { task ->
                task.dependsOn(
                        "compileKotlinEntryGeneration${sourceSet.name.capitalize()}"
                )
            }

            project.tasks.forEach {
                if (it.name.contains("entryGeneration", true)) {
                    it.group = "godotInternalTasks"
                }
            }
        }
    }
}