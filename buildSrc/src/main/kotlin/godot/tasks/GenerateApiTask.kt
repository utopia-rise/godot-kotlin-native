package godot.tasks

import godot.codegen.Generator
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

open class GenerateApiTask : DefaultTask() {

    @InputFile
    val source = project.objects.fileProperty()

    @OutputDirectory
    val outputDirectory = project.objects.directoryProperty()

    @TaskAction
    fun generateAPI() {
        // First, we clear output directory
        outputDirectory.get().asFile.deleteRecursively()
        Generator.generate(source.asFile.get(), outputDirectory.asFile.get())
    }
}

// Here to test
fun main() {
    GenerateApiTask().generateAPI()
}