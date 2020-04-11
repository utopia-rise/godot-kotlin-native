package godot.entrygenerator.extension

import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.types.asSimpleType

fun ClassDescriptor.getSuperTypeNameAsString(): String {
    return this
        .typeConstructor
        .supertypes
        .first()
        .asSimpleType()
        .toString()
}
