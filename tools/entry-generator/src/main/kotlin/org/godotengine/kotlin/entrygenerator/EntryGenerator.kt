package org.godotengine.kotlin.entrygenerator

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import de.jensklingenberg.mpapt.model.Element
import org.godotengine.kotlin.entrygenerator.generator.GDNativeFunctionBindingGenerator
import org.godotengine.kotlin.entrygenerator.generator.generateConstructorBindings
import org.godotengine.kotlin.entrygenerator.generator.generateFunctionBinding
import org.godotengine.kotlin.entrygenerator.model.Class
import org.godotengine.kotlin.entrygenerator.model.Classes
import org.godotengine.kotlin.entrygenerator.model.unite
import org.godotengine.kotlin.entrygenerator.parser.JSONParser
import org.godotengine.kotlin.entrygenerator.parser.Parser
import org.godotengine.kotlin.entrygenerator.parser.XMLParser
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
            val generateConstructorBindings = classElement.generateConstructorBindings(entryFileSpec, index)
            gdNativeFunctionBindingGenerator.registerElement(classElement, true, *generateConstructorBindings)
        }
        functions.forEachIndexed { index, functionElement ->
            val generatedFunctionBridge = functionElement.generateFunctionBinding(entryFileSpec, index)
            gdNativeFunctionBindingGenerator.registerElement(functionElement, false, generatedFunctionBridge)
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