package godot.entrygenerator.generator

import godot.entrygenerator.filebuilder.EntryFileBuilder
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

fun PropertyDescriptor.generateBindings(entryFileBuilder: EntryFileBuilder) {
    //Same as in ClassDescriptorExt
}

fun PropertyDescriptor.generateSignalBindings(entryFileBuilder: EntryFileBuilder) {
    //Same as in ClassDescriptorExt
}