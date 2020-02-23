package org.godotengine.kotlin.entrygenerator

import com.squareup.kotlinpoet.FileSpec
import de.jensklingenberg.mpapt.common.findAnnotation
import de.jensklingenberg.mpapt.model.Element
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.entrygenerator.generator.*
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import java.io.File


class EntryGenerator {
    fun generateEntry(
            kaptGeneratedDirectory: String,
            libraryPath: String,
            godotProjectPath: String,
            classes: Set<Element.ClassElement>,
            properties: Set<Element.PropertyElement>,
            functions: Set<Element.FunctionElement>,
            signals: Set<Element.FunctionElement>
    ) {
        val entryFileSpec: FileSpec.Builder = FileSpec
                .builder("org.godotengine.kotlin", "Entry")
                .addImport("kotlinx.cinterop", "get") //needed for getting pointers like this: args[<number>]
                .addImport("kotlinx.cinterop", "ptr") //needed for getting pointers to `this`: options.ptr

        val gdNativeFunctionBindingGenerator = GDNativeFunctionBindingGenerator()

        classes.forEachIndexed { index, classElement ->
            val generatedConstructorBindings = classElement.generateConstructorBindings(entryFileSpec, index)
            gdNativeFunctionBindingGenerator.registerElement(classElement, bridgeFunctions = *generatedConstructorBindings)

            val generatedInternalFunctionBindings = classElement.generateInternalFunctionBindings(entryFileSpec, index)
            generatedInternalFunctionBindings.forEach { pairOfNameAndFunSpec ->
                gdNativeFunctionBindingGenerator.registerInternalFunction(classElement, pairOfNameAndFunSpec)
            }
        }

        functions.forEachIndexed { index, functionElement ->
            val generatedFunctionBridge = functionElement.func.generateFunctionBinding(entryFileSpec, index)
            gdNativeFunctionBindingGenerator.registerElement(functionElement, bridgeFunctions = *arrayOf(generatedFunctionBridge))
        }

        properties.forEachIndexed { index, propertyElement ->
            val visibleInEditor: Boolean = propertyElement
                    .annotation!!
                    .allValueArguments
                    .getValue(Name.identifier("visibleInEditor"))
                    .value as Boolean

            val generatedPropertyBindings = propertyElement.generatePropertyBinding(entryFileSpec, index)
            gdNativeFunctionBindingGenerator.registerElement(propertyElement, visibleInEditor, *generatedPropertyBindings)
        }

        signals.forEach {
            gdNativeFunctionBindingGenerator.registerElement(it)
        }

        gdNativeFunctionBindingGenerator.generateGDNativeBindingFunctions(entryFileSpec)

        generateGdnsFiles(godotProjectPath, libraryPath, classes)

        entryFileSpec
                .build()
                .writeTo(File(kaptGeneratedDirectory))
    }

    private fun generateGdnsFiles(outputDirectory: String, libraryPath: String, classes: Set<Element.ClassElement>) {
        classes.forEach { classElement ->
            val pathFromAnnotation = classElement
                    .classDescriptor
                    .annotations
                    .findAnnotation(RegisterClass::class.java.name)!!
                    .allValueArguments
                    .filter { it.key.asString() == "outputDir" }
                    .map { it.value.value as String }
                    .firstOrNull { it.isNotBlank() }

            val outputPath = pathFromAnnotation ?: "scripts/${(classElement.classDescriptor.containingDeclaration.name.asString()).replace(".", File.separator)}"

            val out = File("$outputDirectory/$outputPath/${classElement.classDescriptor.name}.gdns")
            out.parentFile.mkdirs()
            out.createNewFile()
            out.writeText("""
                [gd_resource type="NativeScript" load_steps=2 format=2]
                
                [ext_resource path="res://$libraryPath" type="GDNativeLibrary" id=1]
                
                [resource]
                resource_name = "${classElement.classDescriptor.name}"
                class_name = "${classElement.classDescriptor.fqNameSafe}"
                library = ExtResource( 1 )
            """.trimIndent())
        }
    }
}