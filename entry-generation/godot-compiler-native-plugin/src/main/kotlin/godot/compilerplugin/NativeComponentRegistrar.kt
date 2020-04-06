package godot.compilerplugin

import com.intellij.mock.MockProject
import de.jensklingenberg.mpapt.common.MpAptProject
import godot.annotation.processor.GodotAnnotationProcessor
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.compiler.plugin.*
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor

class NativeComponentRegistrar : ComponentRegistrar {
    override fun registerProjectComponents(project: MockProject, configuration: CompilerConfiguration) {
        val processor = GodotAnnotationProcessor(
            configuration.get(CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH)!!,
            configuration.get(CompilerPluginConst.CommandlineArguments.GDNS_DIR_PATH)!!
        )
        val mpapt = MpAptProject(processor, configuration)

        StorageComponentContainerContributor.registerExtension(project, mpapt)
        IrGenerationExtension.registerExtension(project, mpapt)
    }
}

class NativeGodotKotlinCompilerPluginCommandLineProcessor : CommandLineProcessor {
    companion object {
        val GDNS_DIR_PATH_OPTION = CliOption(
            CompilerPluginConst.CommandLineOptionNames.gdnsDirPathOption,
            "Path to where the generated gdns files should be written to",
            CompilerPluginConst.CommandlineArguments.GDNS_DIR_PATH.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        val ENTRY_DIR_PATH_OPTION = CliOption(
            CompilerPluginConst.CommandLineOptionNames.entryDirPathOption,
            "Path to where the generated entry file should be written to",
            CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        const val PLUGIN_ID = CompilerPluginConst.compilerPluginId
    }

    override val pluginId = PLUGIN_ID
    override val pluginOptions = listOf(GDNS_DIR_PATH_OPTION, ENTRY_DIR_PATH_OPTION)

    override fun processOption(option: AbstractCliOption, value: String, configuration: CompilerConfiguration) {
        return when (option) {
            GDNS_DIR_PATH_OPTION -> configuration.put(CompilerPluginConst.CommandlineArguments.GDNS_DIR_PATH, value)
            ENTRY_DIR_PATH_OPTION -> configuration.put(CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH, value)
            else -> throw CliOptionProcessingException("Unknown option: ${option.optionName}")
        }
    }
}