package godot.compiler.plugin

import org.jetbrains.kotlin.config.CompilerConfigurationKey

object CompilerPluginConst {
    const val compilerPluginGroupId = "com.utopia-rise"

    const val compilerPluginArtifactId = "godot-compiler-plugin"
    const val compilerNativePluginArtifactId = "godot-compiler-native-plugin"
    const val compilerPluginId = "GodotCompilerPlugin"

    object CommandLineOptionNames {
        const val gdnsDirPathOption = "gdns-dir-path"
        const val gdnlibFileOption = "gdnlib-file-path"
        const val entryDirPathOption = "entry-dir-path"
        const val enabledOption = "enabled"
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
    }
}
