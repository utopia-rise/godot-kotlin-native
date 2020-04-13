package godot.entrygenerator.extension

import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.resolve.source.KotlinSourceElement

fun PropertyDescriptor.getPropertyHintAnnotation(): AnnotationDescriptor? {
    val propertyHintAnnotations = propertyHintAnnotations
        .map { FqName(it) }
        .filter { annotations.hasAnnotation(it) }
        .map { annotations.findAnnotation(it) }

    if (propertyHintAnnotations.size > 1) {
        throw IllegalStateException("The property ${this.name} has multiple PropertyHintAnnotations. You can only specify one! Defined Annotations: $propertyHintAnnotations")
    }

    if (propertyHintAnnotations.isNotEmpty() && !annotations.hasAnnotation(FqName("godot.annotation.RegisterProperty"))) {
        throw IllegalStateException("The property ${this.name} has a ${propertyHintAnnotations.first()?.fqName} annotation but is not annotated with @RegisterProperty. Add the @RegisterProperty annotation or remove the ${propertyHintAnnotations.first()?.fqName} annotation")
    }

    return propertyHintAnnotations.firstOrNull()
}

val PropertyDescriptor.assignmentPsi: KtExpression
    get() = ((this
        .source as KotlinSourceElement)
        .psi as KtProperty)
        .delegateExpressionOrInitializer!! // should not be null


private val propertyHintAnnotations: List<String> =
    listOf(
        "godot.annotation.IntRange",
        "godot.annotation.FloatRange",
        "godot.annotation.DoubleRange",
        "godot.annotation.ExpRange",
        "godot.annotation.EnumTypeHint",
        "godot.annotation.ExpEasing",
        "godot.annotation.Lenght",
        "godot.annotation.Flags",
        "godot.annotation.Layers2DRender",
        "godot.annotation.Layers2DPhysics",
        "godot.annotation.Layers3DRender",
        "godot.annotation.Layers3DPhysics",
        "godot.annotation.File",
        "godot.annotation.Dir",
        "godot.annotation.ResourceType",
        "godot.annotation.MultilineText",
        "godot.annotation.PlaceHolderText",
        "godot.annotation.ColorNoAlpha",
        "godot.annotation.ImageCompressLossy",
        "godot.annotation.ImageCompressLossLess",
        "godot.annotation.ObjectId",
        "godot.annotation.TypeString",
        "godot.annotation.NodePathToEditedNode",
        "godot.annotation.MethodOfVariantType",
        "godot.annotation.MethodOfBaseType",
        "godot.annotation.MethodOfInstance",
        "godot.annotation.MethodOfScript",
        "godot.annotation.PropertyOfVariantType",
        "godot.annotation.PropertyOfBaseType",
        "godot.annotation.PropertyOfInstance",
        "godot.annotation.PropertyOfScript",
        "godot.annotation.ObjectTooBig",
        "godot.annotation.NodePathValidTypes",
        "godot.annotation.SaveFile",
        "godot.annotation.IntIsObjectId",
        "godot.annotation.Max"
    )
