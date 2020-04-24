package godot.entrygenerator

import godot.entrygenerator.filebuilder.EntryFileBuilder
import godot.entrygenerator.generator.GdnsGenerator
import godot.entrygenerator.transformer.transformTypeDeclarationsToClassWithMember
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

class EntryGenerator(bindingContext: BindingContext) {

    private val entryFileBuilder = EntryFileBuilder(bindingContext)

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

    fun generateGdnsFiles(
        outputPath: String,
        gdnLibFile: String,
        cleanGeneratedGdnsFiles: Boolean,
        classes: Set<ClassDescriptor>
    ) {
        GdnsGenerator.generateGdnsFiles(outputPath, gdnLibFile, cleanGeneratedGdnsFiles, classes)
    }
}
