package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.extension.assignmentPsi
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

class ArrayRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {

    override fun getPropertyTypeHint(): ClassName {

        return when (propertyHintAnnotation?.fqName?.asString()) {
            null -> ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_NONE")
            else -> throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation)
        }
    }

    override fun getHintString(): String {

        propertyDescriptor
            .assignmentPsi

        return when (propertyHintAnnotation?.fqName?.asString()) {
            "godot.annotation.ColorNoAlpha" -> getColorNoAlphaHintString()
            //TODO: implement ImageCompressLossy
            //TODO: implement ImageCompressLossLess
            //TODO: implement NodePathToEditedNode
            //TODO: implement NodePathValidTypes
            null -> ""
            else -> throw IllegalStateException("Unknown annotation ${propertyHintAnnotation.fqName}")
        }
    }

    private fun getColorNoAlphaHintString(): String {
        if (propertyDescriptor.type.toString() != "Color") {
            throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation, "Color")
        }
        return "" //hint string is empty for this typehint
    }
}
