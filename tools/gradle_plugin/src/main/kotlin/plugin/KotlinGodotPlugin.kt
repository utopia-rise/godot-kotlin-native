package plugin

import org.gradle.api.*
import org.gradle.api.internal.FeaturePreviews
import org.gradle.api.internal.file.FileResolver
import org.gradle.internal.cleanup.BuildOutputCleanupRegistry
import org.gradle.internal.reflect.Instantiator
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper
import org.jetbrains.kotlin.gradle.plugin.KotlinTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetPreset
import org.jetbrains.kotlin.konan.target.KonanTarget
import javax.inject.Inject

//import godot.tools.entry_generator.EntryGenerator


class KotlinGodotPlugin @Inject constructor(
        fileResolver: FileResolver,
        private val instantiator: Instantiator,
        private val buildOutputCleanupRegistry: BuildOutputCleanupRegistry,
        private val featurePreviews: FeaturePreviews
): Plugin<Project> {
    override fun apply(project: Project) {
        project.run {
            pluginManager.apply(KotlinMultiplatformPluginWrapper::class.java)

            val kotlin = extensions.getByName("kotlin") as KotlinMultiplatformExtension

            val preset = KotlinNativeTargetPreset(
                    "godotMingwX64",
                    this,
                    KonanTarget.MINGW_X64,
                    buildOutputCleanupRegistry,
                    "1.2.71")

            kotlin.presets.add(preset)
        }
    }
}