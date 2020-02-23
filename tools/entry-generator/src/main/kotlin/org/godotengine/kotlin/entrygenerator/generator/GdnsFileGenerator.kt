package org.godotengine.kotlin.entrygenerator.generator

import de.jensklingenberg.mpapt.common.findAnnotation
import de.jensklingenberg.mpapt.model.Element
import org.godotengine.kotlin.annotation.RegisterClass
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import java.io.File

class GdnsFileGenerator {
    fun generateGdnsFiles(outputDirectory: String, libraryPath: String, classes: Set<Element.ClassElement>) {
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