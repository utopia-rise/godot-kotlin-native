package org.godotengine.kotlin.entrygenerator

import com.squareup.kotlinpoet.FileSpec
import de.jensklingenberg.mpapt.model.Element
import org.godotengine.kotlin.entrygenerator.generator.*
import org.godotengine.kotlin.entrygenerator.model.Class
import org.godotengine.kotlin.entrygenerator.model.Classes
import org.godotengine.kotlin.entrygenerator.model.unite
import org.godotengine.kotlin.entrygenerator.parser.JSONParser
import org.godotengine.kotlin.entrygenerator.parser.Parser
import org.godotengine.kotlin.entrygenerator.parser.XMLParser
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.constants.ConstantValue
import java.io.File


class EntryGenerator {
    fun generateEntry(
            kaptGeneratedDirectory: String,
            classes: MutableSet<Element.ClassElement>,
            properties: MutableSet<Element.PropertyElement>,
            functions: MutableSet<Element.FunctionElement>
    ) {
        val entryFileSpec: FileSpec.Builder = FileSpec
                .builder("org.godotengine.kotlin.entry", "Entry")

        val gdNativeFunctionBindingGenerator = GDNativeFunctionBindingGenerator()

        classes.forEachIndexed { index, classElement ->
            val generatedConstructorBindings = classElement.generateConstructorBindings(entryFileSpec, index)
            gdNativeFunctionBindingGenerator.registerElement(classElement, false, *generatedConstructorBindings)

            val generatedInternalFunctionBindings = classElement.generateInternalFunctionBindings(entryFileSpec, index)
            generatedInternalFunctionBindings.forEach { pairOfNameAndFunSpec ->
                gdNativeFunctionBindingGenerator.registerInternalFunction(classElement, pairOfNameAndFunSpec)
            }
        }

        functions.forEachIndexed { index, functionElement ->
            val generatedFunctionBridge = functionElement.func.generateFunctionBinding(entryFileSpec, index)
            gdNativeFunctionBindingGenerator.registerElement(functionElement, false, generatedFunctionBridge)
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

        gdNativeFunctionBindingGenerator.generateGDNativeBindingFunctions(entryFileSpec)

        entryFileSpec
                .build()
                .writeTo(File(kaptGeneratedDirectory))
    }

    companion object {
        fun generate(configs: List<String>, entryOut: (String) -> Unit, gdnsOut: Class.(String) -> Unit, libPath: String) {
            val configsContent = mutableListOf<Classes>()

            for (config in configs) {
                val content = File(config).readText()

                lateinit var parser: Parser
                if (config.endsWith(".json"))
                    parser = JSONParser()
                if (config.endsWith(".xml"))
                    parser = XMLParser()

                configsContent.add(parser.parseConfig(content))
            }


            val classes = configsContent.unite()
            entryOut(classes.generate())


            for (cl in classes.classes) {
                cl.gdnsOut("""
[gd_resource type="NativeScript" load_steps=2 format=2]

[ext_resource path="$libPath" type="GDNativeLibrary" id=1]

[resource]

resource_name = "${cl.name}"
class_name = "${cl.classPath}"
library = ExtResource( 1 )
            """.trimIndent())
            }
        }
    }
}