package org.godotengine.kotlin.annotationprocessor

import de.jensklingenberg.mpapt.model.AbstractProcessor
import de.jensklingenberg.mpapt.model.RoundEnvironment
import de.jensklingenberg.mpapt.utils.KotlinPlatformValues
import org.godotengine.kotlin.annotation.Register
import org.jetbrains.kotlin.platform.TargetPlatform
import java.nio.file.Paths

class RegisterAnnotationProcessor : AbstractProcessor() {

    override fun getSupportedAnnotationTypes(): Set<String> = setOf(Register::class.java.name)

    override fun isTargetPlatformSupported(platform: TargetPlatform): Boolean {
        return when (val targetName = platform.first().platformName) {
            KotlinPlatformValues.JS -> false
            KotlinPlatformValues.JVM -> false
            KotlinPlatformValues.NATIVE -> true
            else -> {
                log("Unknown configured target: $targetName")
                false
            }
        }
    }

    override fun initProcessor() {
        log("***Processor started***") //TODO: remove when done with developing the code generation
    }

    override fun process(roundEnvironment: RoundEnvironment) {
        val generatedDirectory = getKaptGeneratedDirectory()
        log("Starting to process \"Register\" annotations") //TODO: remove when done with developing the code generation

        roundEnvironment.getElementsAnnotatedWith(Register::class.java.name).forEach {
            log("${it.simpleName} is annotated with Register")
        }

        //code generation logic

        log("Finished processing \"Register\" annotations") //TODO: remove when done with developing the code generation
    }

    override fun processingOver() {
        //write generated code logic
        log("***Processor over***") //TODO: remove when done with developing the code generation
    }

    /**
     * Returns the path as a String to which the generated code should be written
     * @return directory path to where the generated code should be written to as a String
     */
    private fun getKaptGeneratedDirectory(): String {
        return "${Paths.get("").toAbsolutePath()}/build/godot/entries"
    }
}