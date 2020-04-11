package godot.entrygenerator.model

import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

data class ClassWithMembers(
    val classDescriptor: ClassDescriptor,
    val functions: MutableList<FunctionDescriptor> = mutableListOf(),
    val signals: MutableList<PropertyDescriptor> = mutableListOf(),
    val properties: MutableList<PropertyDescriptor> = mutableListOf()
)