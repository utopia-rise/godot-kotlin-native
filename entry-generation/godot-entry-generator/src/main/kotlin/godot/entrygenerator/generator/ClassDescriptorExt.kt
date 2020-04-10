package godot.entrygenerator.generator

import godot.entrygenerator.filebuilder.EntryFileBuilder
import org.jetbrains.kotlin.descriptors.ClassDescriptor

fun ClassDescriptor.generateBindings(entryFileBuilder: EntryFileBuilder) {
    //code gen for funSpecs for binding and bindingRegistration
    entryFileBuilder
        .binding {
            //code for the binding
        }
        .bindingRegistration {
            //registerClass(...)
        }
}