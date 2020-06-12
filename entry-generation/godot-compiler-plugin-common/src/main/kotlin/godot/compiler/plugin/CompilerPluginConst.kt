package godot.compiler.plugin

import org.jetbrains.kotlin.config.CompilerConfigurationKey

object CompilerPluginConst {
    const val compilerPluginGroupId = "com.utopia-rise"

    const val compilerPluginArtifactId = "godot-compiler-plugin"
    const val compilerNativePluginArtifactId = "godot-compiler-native-plugin"
    const val compilerPluginId = "GodotCompilerPlugin"

    //Remember to change according to gradle.properties
    const val godotVersion = "3.2"

    object CommandLineOptionNames {
        const val gdnsDirPathOption = "gdns-dir-path"
        const val gdnlibFileOption = "gdnlib-file-path"
        const val entryDirPathOption = "entry-dir-path"
        const val enabledOption = "enabled"
        const val cleanGeneratedGdnsFiles = "clean-generated-gdns-files"
    }

    object CommandlineArguments {
        val GDNS_DIR_PATH: CompilerConfigurationKey<String> =
            CompilerConfigurationKey.create("path to root of godot project")
        val GDNLIB_FILE_PATH: CompilerConfigurationKey<String> =
            CompilerConfigurationKey.create("path to where the gdnlib file should be generated")
        val ENTRY_DIR_PATH: CompilerConfigurationKey<String> =
            CompilerConfigurationKey.create("path to the folder in which the generated entry file should be written")
        val ENABLED: CompilerConfigurationKey<Boolean> =
            CompilerConfigurationKey.create("flag to enable entry generation")
        val CLEAN_GENERATED_GDNS_FILES: CompilerConfigurationKey<Boolean> =
            CompilerConfigurationKey.create("flag to clean generated gdns files that don't have an associated class anymore")
    }
}
