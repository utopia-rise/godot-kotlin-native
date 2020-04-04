package godot.compilerplugin

import org.jetbrains.kotlin.config.CompilerConfigurationKey

object CompilerPluginConst {
    const val compilerPluginVersion = "0.1.0" //remember to bump in conjunction with the version defined in the root build.gradle.kts
    const val compilerPluginGroupId = "com.utopia-rise"

    const val compilerPluginArtifactId = "kotlin-compiler-plugin"
    const val compilerNativePluginArtifactId = "kotlin-compiler-native-plugin"
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