package godot.compiler.plugin

import com.intellij.mock.MockProject
import de.jensklingenberg.mpapt.common.MpAptProject
import godot.annotation.processor.GodotAnnotationProcessor
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext
import org.jetbrains.kotlin.compiler.plugin.*
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment

class NativeComponentRegistrar : ComponentRegistrar {
    override fun registerProjectComponents(project: MockProject, configuration: CompilerConfiguration) {
        val enabled = checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.ENABLED)) {
            "enabled parameter missing"
        }

        if (enabled) {
            val processor = GodotAnnotationProcessor(
                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH)) { "No path for generated entry file specified" },
                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.GDNS_DIR_PATH)) { "No path for generated gdns files specified" },
                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.GDNLIB_FILE_PATH)) { "No path for generated gdnlib file specified" },
                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.CLEAN_GENERATED_GDNS_FILES)) { "No clean generated gdns files option specified" }
            )
            val mpapt = MpAptProject(processor, configuration)

            StorageComponentContainerContributor.registerExtension(project, mpapt)
            IrGenerationExtension.registerExtension(project, object : IrGenerationExtension {
                override fun generate(moduleFragment: IrModuleFragment, pluginContext: IrPluginContext) {
                    processor.bindingContext = pluginContext.bindingContext
                    mpapt.generate(moduleFragment, pluginContext)
                }
            })
        }
    }
}

class NativeGodotKotlinCompilerPluginCommandLineProcessor : CommandLineProcessor {
    companion object {
        val GDNS_DIR_PATH_OPTION = CliOption(
            CompilerPluginConst.CommandLineOptionNames.gdnsDirPathOption,
            "Absolute Path as String",
            CompilerPluginConst.CommandlineArguments.GDNS_DIR_PATH.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        val GDNLIB_FILE_PATH_OPTION = CliOption(
            CompilerPluginConst.CommandLineOptionNames.gdnlibFileOption,
            "Absolute Path as String",
            CompilerPluginConst.CommandlineArguments.GDNLIB_FILE_PATH.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        val ENTRY_DIR_PATH_OPTION = CliOption(
            CompilerPluginConst.CommandLineOptionNames.entryDirPathOption,
            "Absolute Path as String",
            CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        val ENABLED = CliOption(
            CompilerPluginConst.CommandLineOptionNames.enabledOption,
            "Flag to enable entry generation",
            CompilerPluginConst.CommandlineArguments.ENABLED.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        val CLEAN_GENERATED_GDNS_FILES = CliOption(
            CompilerPluginConst.CommandLineOptionNames.cleanGeneratedGdnsFiles,
            "Flag to enable entry generation",
            CompilerPluginConst.CommandlineArguments.CLEAN_GENERATED_GDNS_FILES.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        const val PLUGIN_ID = CompilerPluginConst.compilerPluginId
    }

    override val pluginId = PLUGIN_ID
    override val pluginOptions = listOf(
        GDNS_DIR_PATH_OPTION,
        GDNLIB_FILE_PATH_OPTION,
        ENTRY_DIR_PATH_OPTION,
        ENABLED,
        CLEAN_GENERATED_GDNS_FILES
    )

    override fun processOption(option: AbstractCliOption, value: String, configuration: CompilerConfiguration) {
        return when (option) {
            GDNS_DIR_PATH_OPTION -> configuration.put(
                CompilerPluginConst.CommandlineArguments.GDNS_DIR_PATH, value
            )
            GDNLIB_FILE_PATH_OPTION -> configuration.put(
                CompilerPluginConst.CommandlineArguments.GDNLIB_FILE_PATH, value
            )
            ENTRY_DIR_PATH_OPTION -> configuration.put(
                CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH, value
            )
            ENABLED -> configuration.put(
                CompilerPluginConst.CommandlineArguments.ENABLED, value.toBoolean()
            )
            CLEAN_GENERATED_GDNS_FILES -> configuration.put(
                CompilerPluginConst.CommandlineArguments.CLEAN_GENERATED_GDNS_FILES, value.toBoolean()
            )
            else -> throw CliOptionProcessingException("Unknown option: ${option.optionName}")
        }
    }
}
