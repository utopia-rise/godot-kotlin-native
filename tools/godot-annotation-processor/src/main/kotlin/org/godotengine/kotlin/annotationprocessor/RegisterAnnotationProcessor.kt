package org.godotengine.kotlin.annotationprocessor

import de.jensklingenberg.mpapt.model.AbstractProcessor
import de.jensklingenberg.mpapt.model.Element
import de.jensklingenberg.mpapt.model.RoundEnvironment
import de.jensklingenberg.mpapt.utils.KotlinPlatformValues
import org.godotengine.kotlin.entrygenerator.EntryGenerator
import org.godotengine.kotlin.annotation.Register
import org.jetbrains.kotlin.platform.TargetPlatform
import java.lang.instrument.IllegalClassFormatException
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

    private val classes: MutableSet<Element.ClassElement> = mutableSetOf()
    private val properties: MutableSet<Element.PropertyElement> = mutableSetOf()
    private val functions: MutableSet<Element.FunctionElement> = mutableSetOf()

    override fun process(roundEnvironment: RoundEnvironment) {
        log("Starting to process \"Register\" annotations") //TODO: remove when done with developing the code generation

        roundEnvironment.getElementsAnnotatedWith(Register::class.java.name).forEach {
            log("${it.simpleName} is annotated with Register")
            when (it) {
                is Element.ClassElement -> classes.add(it)
                is Element.PropertyElement -> properties.add(it)
                is Element.FunctionElement -> functions.add(it)
                else -> log("$it is not handled by register code generation logic!")
            }
        }

        performSanityChecks()

        //code generation logic

        log("Finished processing \"Register\" annotations") //TODO: remove when done with developing the code generation
    }

    private fun performSanityChecks() {
        classes.forEach {
            if (it.classDescriptor.constructors.size > 1) {
                throw IllegalClassFormatException("A Class annotated with \"@Register\" can only have a default constructor!\nBut ${it.classDescriptor.name} contains ${it.classDescriptor.constructors.size} constructors")
            }
        }
    }

    override fun processingOver() {
        //write generated code logic
        EntryGenerator()
                .generateEntry(
                        getKaptGeneratedDirectory(),
                        classes,
                        properties,
                        functions
                )
        log("***Processor over***") //TODO: remove when done with developing the code generation
    }

    /**
     * Returns the path as a String to which the generated code should be written
     * @return directory path to where the generated code should be written to as a String
     */
    private fun getKaptGeneratedDirectory(): String {
        return "${Paths.get("").toAbsolutePath()}/build/godot/entriesTest" //TODO: change to entries
    }
}