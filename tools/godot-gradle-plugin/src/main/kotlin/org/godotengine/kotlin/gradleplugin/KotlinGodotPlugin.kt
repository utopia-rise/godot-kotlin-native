package org.godotengine.kotlin.gradleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.konan.target.Distribution
import org.jetbrains.kotlin.konan.target.HostManager
import org.jetbrains.kotlin.konan.target.presetName

open class KotlinGodotPluginExtension {
    var godotLibraryVersion = "1.0.0"
    var kotlinVersion = "1.3.61"
    var libraryPath = ""
    var godotProjectPath = ""
    var releaseType = org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG

    override fun toString(): String {
        return "KotlinGodotPluginExtension(godotLibraryVersion='$godotLibraryVersion', kotlinVersion='$kotlinVersion', libraryPath='$libraryPath', godotProjectPath='$godotProjectPath')"
    }
}

class KotlinGodotPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.extensions.create("kotlinGodotPluginExtension", KotlinGodotPluginExtension::class.java)


        project.run {
            //pluginManager.apply(KotlinMultiplatformPluginWrapper::class.java)
            val kotlinMultiplatformExtension = extensions.getByName("kotlin") as KotlinMultiplatformExtension
            val kotlinGodotPluginExtension = extensions.getByName("kotlinGodotPluginExtension") as KotlinGodotPluginExtension

            HostManager(Distribution(), false).targets.forEach { (_, target) ->
                KotlinGodotTargetPreset(
                        "godot" + target.presetName.capitalize(),
                        project,
                        target,
                        kotlinGodotPluginExtension
                ).apply {
                    kotlinMultiplatformExtension.presets.add(this)
                }
            }
        }
    }
}