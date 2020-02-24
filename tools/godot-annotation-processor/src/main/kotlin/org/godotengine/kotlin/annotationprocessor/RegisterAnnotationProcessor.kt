package org.godotengine.kotlin.annotationprocessor

import de.jensklingenberg.mpapt.model.AbstractProcessor
import de.jensklingenberg.mpapt.model.Element
import de.jensklingenberg.mpapt.model.RoundEnvironment
import de.jensklingenberg.mpapt.utils.KotlinPlatformValues
import org.godotengine.kotlin.annotation.*
import org.godotengine.kotlin.annotationprocessor.CommandlineArguments.GODOT_PROJECT_PATH
import org.godotengine.kotlin.annotationprocessor.CommandlineArguments.LIBRARY_PATH
import org.godotengine.kotlin.entrygenerator.EntryGenerator
import org.jetbrains.kotlin.config.CompilerConfigurationKey
import org.jetbrains.kotlin.platform.TargetPlatform
import java.lang.instrument.IllegalClassFormatException
import java.nio.file.Paths

object CommandlineArguments {
    val LIBRARY_PATH: CompilerConfigurationKey<String> = CompilerConfigurationKey.create("path to godot gdnlib")
    val GODOT_PROJECT_PATH: CompilerConfigurationKey<String> = CompilerConfigurationKey.create("path to root of godot project")
}

class RegisterAnnotationProcessor : AbstractProcessor() {

    override fun getSupportedAnnotationTypes(): Set<String> =
            setOf(
                    RegisterClass::class.java.name,
                    RegisterFunction::class.java.name,
                    RegisterProperty::class.java.name,
                    RegisterSignal::class.java.name
            )

    override fun isTargetPlatformSupported(platform: TargetPlatform): Boolean {
        return when (val targetName = platform.first().platformName) {
            KotlinPlatformValues.JS -> false
            KotlinPlatformValues.JVM -> true
            KotlinPlatformValues.NATIVE -> true
            else -> {
                log("Unknown configured target: $targetName")
                false
            }
        }
    }

    private val classes: MutableSet<Element.ClassElement> = mutableSetOf()
    private val properties: MutableSet<Element.PropertyElement> = mutableSetOf()
    private val functions: MutableSet<Element.FunctionElement> = mutableSetOf()
    private val signals: MutableSet<Element.FunctionElement> = mutableSetOf()

    override fun process(roundEnvironment: RoundEnvironment) {

        classes.addAll(
                roundEnvironment
                        .getElementsAnnotatedWith(RegisterClass::class.java.name)
                        .map { it as Element.ClassElement }
        )

        properties.addAll(
                roundEnvironment
                        .getElementsAnnotatedWith(RegisterProperty::class.java.name)
                        .map { it as Element.PropertyElement }
        )

        functions.addAll(
                roundEnvironment
                        .getElementsAnnotatedWith(RegisterFunction::class.java.name)
                        .map { it as Element.FunctionElement }
        )

        signals.addAll(
                roundEnvironment
                        .getElementsAnnotatedWith(RegisterSignal::class.java.name)
                        .map { it as Element.FunctionElement }
        )

        performSanityChecks()
    }

    private fun performSanityChecks() {
        classes.forEach {
            if (it.classDescriptor.constructors.size > 1) {
                throw IllegalClassFormatException("A Class annotated with \"@RegisterClass\" can only have a default constructor!\nBut ${it.classDescriptor.name} contains ${it.classDescriptor.constructors.size} constructors")
            }
        }
        functions.forEach {
            if (!classes.map { classElement -> classElement.classDescriptor }.contains(it.descriptor)) {
                throw Exception("${it.descriptor.name.asString()} contains a registered function: ${it.func.name} but is not annotated with @RegisterClass! Classes containing functions which are registered, also have to be registered!")
            }
        }
        properties.forEach {
            if (!classes.map { classElement -> classElement.classDescriptor }.contains(it.propertyDescriptor.containingDeclaration)) {
                throw Exception("${it.propertyDescriptor.containingDeclaration.name.asString()} contains a registered property: ${it.propertyDescriptor.name} but is not annotated with @RegisterClass! Classes containing properties which are registered, also have to be registered!")
            }
        }
        signals.forEach {
            //signals are wrapped in a interface
            if (!classes.map { classElement -> classElement.classDescriptor }.contains(it.descriptor.containingDeclaration)) {
                throw Exception("${it.descriptor.containingDeclaration.name.asString()} contains a signal: ${it.func.name} but is not annotated with @RegisterClass! Classes containing signals, also have to be registered!")
            }
        }
    }

    override fun processingOver() {
        EntryGenerator()
                .generateEntry(
                        getKaptGeneratedDirectory(),
                        configuration.get(LIBRARY_PATH)!!,
                        configuration.get(GODOT_PROJECT_PATH)!!,
                        classes,
                        properties,
                        functions,
                        signals
                )
    }

    /**
     * Returns the path as a String to which the generated code should be written
     * @return directory path to where the generated code should be written to as a String
     */
    private fun getKaptGeneratedDirectory(): String {
        return "${Paths.get("").toAbsolutePath()}/build/godot/entries"
    }
}