package godot.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import godot.codegen.generateApiFrom

open class GenerateApiTask : DefaultTask() {

    @InputFile
    val source = project.objects.fileProperty()

    @OutputDirectory
    val outputDirectory = project.objects.directoryProperty()

    @TaskAction
    fun generateAPI() {
        // First, we clear output directory
        outputDirectory.get().asFile.deleteRecursively()
        outputDirectory.asFile.get() generateApiFrom source.asFile.get()
    }
}
