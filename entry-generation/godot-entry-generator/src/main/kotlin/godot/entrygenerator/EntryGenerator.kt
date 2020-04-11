package godot.entrygenerator

import godot.entrygenerator.filebuilder.EntryFileBuilder
import godot.entrygenerator.transformer.transformTypeDeclarationsToClassWithMember
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

        entryFileBuilder
            .registerClassesWithMembers(
                transformTypeDeclarationsToClassWithMember(
                    classes,
                    properties,
                    functions,
                    signals
                )
            )
            .build(outputPath)
    }

    fun generateGdnsFiles(outputPath: String) {

    }
}
