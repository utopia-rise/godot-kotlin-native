package godot.gradle

import godot.compiler.plugin.CompilerPluginConst
import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilerPluginSupportPlugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

class GodotCompilerPlugin : KotlinCompilerPluginSupportPlugin {
    private lateinit var project: Project

    override fun apply(project: Project) {
        this.project = project
    }

    override fun applyToCompilation(kotlinCompilation: KotlinCompilation<*>): Provider<List<SubpluginOption>> {
        return project.provider {
            val extension = project.extensions.getByType(GodotExtension::class.java)
            listOf(
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.enabledOption,
                    (kotlinCompilation.compileKotlinTaskName == "compileKotlinDummyTarget").toString()
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
    }

    override fun isApplicable(kotlinCompilation: KotlinCompilation<*>): Boolean {
        // TODO: maybe kotlinCompilation.compileKotlinTaskName == "compileKotlinDummyTarget"
        return true
    }

    override fun getCompilerPluginId(): String = CompilerPluginConst.compilerPluginId

    override fun getPluginArtifact(): SubpluginArtifact = SubpluginArtifact(
        groupId = CompilerPluginConst.compilerPluginGroupId,
        artifactId = CompilerPluginConst.compilerPluginArtifactId,
        version = GodotBuildProperties.godotKotlinVersion
    )

    override fun getPluginArtifactForNative() = SubpluginArtifact(
        groupId = CompilerPluginConst.compilerPluginGroupId,
        artifactId = CompilerPluginConst.compilerNativePluginArtifactId,
        version = GodotBuildProperties.godotKotlinVersion
    )
}
