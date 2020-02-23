package org.godotengine.kotlin.compilerplugin

import com.google.auto.service.AutoService
import com.intellij.mock.MockProject
import de.jensklingenberg.mpapt.common.MpAptProject
import org.godotengine.kotlin.annotationprocessor.CommandlineArguments
import org.godotengine.kotlin.annotationprocessor.RegisterAnnotationProcessor
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.compiler.plugin.*
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor


@AutoService(ComponentRegistrar::class)
class NativeComponentRegistrar : ComponentRegistrar {
    override fun registerProjectComponents(project: MockProject, configuration: CompilerConfiguration) {
        val generator = RegisterAnnotationProcessor()
        val mpapt = MpAptProject(generator, configuration)

        StorageComponentContainerContributor.registerExtension(project, mpapt)
        IrGenerationExtension.registerExtension(project, mpapt)
    }
}

@AutoService(CommandLineProcessor::class)
class NativeTestComponentCommandLineProcessor : CommandLineProcessor {
    companion object {
        val LIBRARY_PATH_OPTION = CliOption(
                "library-path", "<name>", CommandlineArguments.LIBRARY_PATH.toString(),
                required = true, allowMultipleOccurrences = false
        )

        val GODOT_PROJECT_PATH_OPTION = CliOption(
                "godot-project-path", "<name>", CommandlineArguments.GODOT_PROJECT_PATH.toString(),
                required = true, allowMultipleOccurrences = false
        )

        val PLUGIN_ID = "GodotCompilerPlugin" //has to be the same as the plugin id in KotlinGodotSubplugin
    }

    override val pluginId = PLUGIN_ID
    override val pluginOptions = listOf(LIBRARY_PATH_OPTION, GODOT_PROJECT_PATH_OPTION)

    override fun processOption(option: AbstractCliOption, value: String, configuration: CompilerConfiguration) {
        return when (option) {
            LIBRARY_PATH_OPTION -> configuration.put(CommandlineArguments.LIBRARY_PATH, value)
            GODOT_PROJECT_PATH_OPTION -> configuration.put(CommandlineArguments.GODOT_PROJECT_PATH, value)
            else -> throw CliOptionProcessingException("Unknown option: ${option.optionName}")
        }
    }
}