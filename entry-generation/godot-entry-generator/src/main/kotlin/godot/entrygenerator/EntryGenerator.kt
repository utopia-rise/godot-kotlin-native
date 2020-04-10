package godot.entrygenerator

import godot.entrygenerator.filebuilder.EntryFileBuilder
import godot.entrygenerator.generator.generateBindings
import godot.entrygenerator.generator.generateSignalBindings
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

class EntryGenerator {

    private val entryFileBuilder = EntryFileBuilder()

    fun generateEntryFile(
        outputPath: String,
        classes: Set<ClassDescriptor>,
        properties: Set<PropertyDescriptor>,
        functions: Set<FunctionDescriptor>,
        signals: Set<PropertyDescriptor>
    ) {

        classes.forEach {
            it.generateBindings(entryFileBuilder)
        }

        properties.forEach {
            it.generateBindings(entryFileBuilder)
        }

        functions.forEach {
            it.generateBindings(entryFileBuilder)
        }

        signals.forEach {
            it.generateSignalBindings(entryFileBuilder)
        }

        entryFileBuilder.build(outputPath)
    }

    fun generateGdnsFiles(outputPath: String) {

    }
}
