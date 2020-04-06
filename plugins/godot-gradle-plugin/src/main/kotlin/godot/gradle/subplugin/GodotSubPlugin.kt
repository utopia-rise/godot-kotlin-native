package godot.gradle.subplugin

import godot.compiler.plugin.CompilerPluginConst
import godot.gradle.GodotExtension
import godot.gradle.GodotPlugin
import org.gradle.api.Project
import org.gradle.api.tasks.compile.AbstractCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinGradleSubplugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile

class GodotSubPlugin : KotlinGradleSubplugin<AbstractCompile> {
    override fun apply(
        project: Project,
        kotlinCompile: AbstractCompile,
        javaCompile: AbstractCompile?,
        variantData: Any?,
        androidProjectHandler: Any?,
        kotlinCompilation: KotlinCompilation<KotlinCommonOptions>?
    ): List<SubpluginOption> {
        val extension = project.extensions.getByType(GodotExtension::class.java)
        return listOf(
            SubpluginOption(
                CompilerPluginConst.CommandLineOptionNames.gdnsDirPathOption,
                extension.gdnsDir.get().asFile.absolutePath
            ),
            SubpluginOption(
                CompilerPluginConst.CommandLineOptionNames.entryDirPathOption,
                extension.entrySourceDir.get().asFile.absolutePath
            )
        )
    }

    override fun getCompilerPluginId(): String = CompilerPluginConst.compilerPluginId

    override fun isApplicable(project: Project, task: AbstractCompile): Boolean =
        project.plugins.hasPlugin(GodotPlugin::class.java)

    override fun getPluginArtifact(): SubpluginArtifact = SubpluginArtifact(
        groupId = CompilerPluginConst.compilerPluginGroupId,
        artifactId = CompilerPluginConst.compilerPluginArtifactId,
        version = CompilerPluginConst.compilerPluginVersion
    )

    override fun getNativeCompilerPluginArtifact() = SubpluginArtifact(
        groupId = CompilerPluginConst.compilerPluginGroupId,
        artifactId = CompilerPluginConst.compilerNativePluginArtifactId,
        version = CompilerPluginConst.compilerPluginVersion
    )
}