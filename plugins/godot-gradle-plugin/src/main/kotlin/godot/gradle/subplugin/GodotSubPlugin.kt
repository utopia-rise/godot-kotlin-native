package godot.gradle.subplugin

import godot.compiler.plugin.CompilerPluginConst
import godot.gradle.GodotExtension
import godot.gradle.GodotPlugin
import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.api.tasks.compile.AbstractCompile
import org.gradle.kotlin.dsl.findByType
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinGradleSubplugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

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
                CompilerPluginConst.CommandLineOptionNames.enabledOption,
                (kotlinCompile.name == "compileKotlinDummyTarget").toString()
            ),
            SubpluginOption(
                CompilerPluginConst.CommandLineOptionNames.gdnsDirPathOption,
                extension.gdnsDir.get().asFile.absolutePath
            ),
            SubpluginOption(
                CompilerPluginConst.CommandLineOptionNames.gdnlibFileOption,
                project.relativePath(extension.gdnlibFile.get().asFile.absolutePath)
            ),
            SubpluginOption(
                CompilerPluginConst.CommandLineOptionNames.entryDirPathOption,
                extension.entrySourceDir.get().asFile.absolutePath
            ),
            SubpluginOption(
                CompilerPluginConst.CommandLineOptionNames.cleanGeneratedGdnsFiles,
                extension.cleanupGeneratedFiles.get().toString()
            )
        )
    }

    override fun getCompilerPluginId(): String = CompilerPluginConst.compilerPluginId

    override fun isApplicable(project: Project, task: AbstractCompile): Boolean =
        //&& task is KotlinNativeCompile -> we cannot do this check here as the compiler plugin get's called in the
        // linking stage again, which then fails as the subPlugin is disabled for it and thus does not provide the
        // needed command line arguments
        project.extensions.findByType<GodotExtension>() != null

    override fun getPluginArtifact(): SubpluginArtifact = SubpluginArtifact(
        groupId = CompilerPluginConst.compilerPluginGroupId,
        artifactId = CompilerPluginConst.compilerPluginArtifactId,
        version = GodotBuildProperties.godotKotlinVersion
    )

    override fun getNativeCompilerPluginArtifact() = SubpluginArtifact(
        groupId = CompilerPluginConst.compilerPluginGroupId,
        artifactId = CompilerPluginConst.compilerNativePluginArtifactId,
        version = GodotBuildProperties.godotKotlinVersion
    )
}
