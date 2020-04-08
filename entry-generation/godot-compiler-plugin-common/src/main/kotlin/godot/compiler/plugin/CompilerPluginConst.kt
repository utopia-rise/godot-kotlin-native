package godot.compiler.plugin

import org.jetbrains.kotlin.config.CompilerConfigurationKey

object CompilerPluginConst {
    const val compilerPluginGroupId = "com.utopia-rise"

    const val compilerPluginArtifactId = "godot-compiler-plugin"
    const val compilerNativePluginArtifactId = "godot-compiler-native-plugin"
    const val compilerPluginId = "GodotCompilerPlugin"

    object CommandLineOptionNames {
        const val gdnsDirPathOption = "gdns-dir-path"
        const val entryDirPathOption = "entry-dir-path"
    }

    object CommandlineArguments {
        val GDNS_DIR_PATH: CompilerConfigurationKey<String> =
            CompilerConfigurationKey.create("path to root of godot project")
        val ENTRY_DIR_PATH: CompilerConfigurationKey<String> =
            CompilerConfigurationKey.create("path to the folder in which the generated entry file should be written")
    }
}