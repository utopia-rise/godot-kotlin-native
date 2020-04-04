package godot.annotation.processor

import de.jensklingenberg.mpapt.model.AbstractProcessor
import de.jensklingenberg.mpapt.model.Element
import de.jensklingenberg.mpapt.model.RoundEnvironment
import de.jensklingenberg.mpapt.utils.KotlinPlatformValues
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.platform.TargetPlatform
import java.lang.instrument.IllegalClassFormatException

class GodotAnnotationProcessor(
    private val entryGenerationOutputDir: String,
    private val gdnsGenerationOutputDir: String
) : AbstractProcessor() {
    override fun getSupportedAnnotationTypes(): Set<String> =
        setOf(
            "godot.annotation.RegisterClass",
            "godot.annotation.RegisterProperty",
            "godot.annotation.RegisterFunction",
            "godot.annotation.RegisterSignal"
        )

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

    private val classes: MutableSet<ClassDescriptor> = mutableSetOf()
    private val properties: MutableSet<PropertyDescriptor> = mutableSetOf()
    private val functions: MutableSet<FunctionDescriptor> = mutableSetOf()
    private val signals: MutableSet<PropertyDescriptor> = mutableSetOf()

    override fun process(roundEnvironment: RoundEnvironment) {
        classes.addAll(
            roundEnvironment
                .getElementsAnnotatedWith("godot.annotation.RegisterClass")
                .map { it as Element.ClassElement }
                .map { it.classDescriptor }
        )

        properties.addAll(
            roundEnvironment
                .getElementsAnnotatedWith("godot.annotation.RegisterProperty")
                .map { it as Element.PropertyElement }
                .map { it.propertyDescriptor }
        )

        functions.addAll(
            roundEnvironment
                .getElementsAnnotatedWith("godot.annotation.RegisterFunction")
                .map { it as Element.FunctionElement }
                .map { it.func }
        )

        signals.addAll(
            roundEnvironment
                .getElementsAnnotatedWith("godot.annotation.RegisterSignal")
                .map { it as Element.PropertyElement }
                .map { it.propertyDescriptor }
        )

        performSanityChecks()
    }

    private fun performSanityChecks() {
        classes.forEach {
            if (it.constructors.size > 1) {
                throw IllegalClassFormatException("A Class annotated with \"@RegisterClass\" can only have a default constructor!\nBut ${it.name} contains ${it.constructors.size} constructors")
            }
        }
        functions.forEach {
            if (!classes.contains(it.containingDeclaration)) {
                throw Exception("${it.containingDeclaration.name.asString()} contains a registered function: ${it.name} but is not annotated with @RegisterClass! Classes containing functions which are registered, also have to be registered!")
            }
        }
        properties.forEach {
            if (!classes.contains(it.containingDeclaration)) {
                throw Exception("${it.containingDeclaration.name.asString()} contains a registered property: ${it.name} but is not annotated with @RegisterClass! Classes containing properties which are registered, also have to be registered!")
            }
        }
        signals.forEach {
            if (!classes.contains(it.containingDeclaration)) {
                throw Exception("${it.containingDeclaration.name.asString()} contains a signal: ${it.name} but is not annotated with @RegisterClass! Classes containing signals, also have to be registered!")
            }
        }
    }

    override fun processingOver() {
        //TODO: entry generation
    }
}