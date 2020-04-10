package godot.entrygenerator.extension

import org.jetbrains.kotlin.descriptors.annotations.Annotations
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name

inline fun <T> Annotations.getAnnotationValue(
    annotation: String,
    value: String,
    noSuchAnnotationAction: () -> Throwable
): T {
    return this
        .findAnnotation(FqName(annotation))
        ?.let { annotationDescriptor ->
            @Suppress("UNCHECKED_CAST")
            annotationDescriptor
                .allValueArguments
                .entries
                .first { it.key == Name.identifier(value) }
                .value
                .value as T
        }
        ?: throw noSuchAnnotationAction()
}
