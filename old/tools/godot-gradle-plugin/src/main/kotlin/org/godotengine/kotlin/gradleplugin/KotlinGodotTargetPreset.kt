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

        kotlinGodotPluginExtension.configureTargetAction.invoke(target)

        target.compilations.getByName("main") {
            it.target.binaries {
                sharedLib(listOf(kotlinGodotPluginExtension.releaseType))
            }
        }

        target.compilations.all { compilation ->
            compilation.apply {

                this.kotlinSourceSets.forEach { kotlinSourceSet ->
                    kotlinSourceSet.kotlin.srcDir(project.buildDir.absolutePath + "/godot/entries/")
                }
                addGeneratorTasks()
            }
        }
        return target
    }


    private fun KotlinNativeCompilation.addGeneratorTasks() {
        kotlinSourceSets.forEachIndexed { index, sourceSet ->
            if (sourceSet.name.contains("Test")) return //no entry generation should happen for test builds

            val entryPath = project.buildDir.absolutePath + "/godot/entries/"
            sourceSet.kotlin.srcDir(entryPath)

            if (index == 0 && !project.tasks.any { it.name.contains("resolveDependenciesFor") }) {
                val dummyTarget = nativePreset.createTarget("entryGeneration${sourceSet.name.capitalize()}").apply {
                    this.compilations.all { compilation ->
                        compilation.source(sourceSet)
                    }
                }
                kotlin.targets.add(dummyTarget)
                kotlinGodotPluginExtension.configureTargetAction.invoke(dummyTarget)
            }

            project.getTasksByName(compileKotlinTaskName, false).forEach { task ->
                task.dependsOn(
                        project.tasks.first { it.name.contains("compileKotlinEntryGeneration") }
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