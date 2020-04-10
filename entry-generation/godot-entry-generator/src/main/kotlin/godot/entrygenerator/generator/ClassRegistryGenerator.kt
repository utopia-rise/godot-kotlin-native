package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.filebuilder.EntryFileBuilder
import godot.entrygenerator.model.ClassWithMembers

class ClassRegistryGenerator(private val entryFileBuilder: EntryFileBuilder) {

    fun registerClassesWithMembers(classesWithMembers: Set<ClassWithMembers>) {
        entryFileBuilder.bindingRegistration {
            val classRegistryControlFlow = beginControlFlow("with(%T(handle))·{", ClassName("godot.core", "ClassRegistry")) //START: with ClassRegistry //TODO: change package name to correct one (once known)

            classesWithMembers.forEach {
                //TODO: generate registerClass(...) containing function(...)
            }

            endControlFlow() //END: with ClassRegistry
        }
    }
}