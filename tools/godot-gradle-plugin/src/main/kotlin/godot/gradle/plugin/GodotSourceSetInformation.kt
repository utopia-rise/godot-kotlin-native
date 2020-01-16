package godot.gradle.plugin

import org.gradle.api.InvalidUserDataException
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import java.io.File


class GodotSourceSetInformation(
        private val projectDir: String,
        private val sourceSet: KotlinSourceSet
) {
    val configs = mutableListOf<String>()
    var libraryPath = ""

    var gdnsPath = ""

    var skipEntryGeneration = false


    fun appendConfigs(confs: Iterable<String>) {
        for (config in confs) {
            val path = File(config)

            if (path.isAbsolute)
                configs.add(path.absolutePath)
            else
                configs.add(projectDir + config)
        }
    }

    fun generateGDNS(path: String) {
        if (gdnsPath != "")
            throw InvalidUserDataException("Multiple definition of .gdns files path for godot $sourceSet")
        gdnsPath = path
    }
}