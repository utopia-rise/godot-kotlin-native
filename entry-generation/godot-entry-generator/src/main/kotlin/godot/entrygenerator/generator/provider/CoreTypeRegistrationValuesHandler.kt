package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

class CoreTypeRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {

    override fun getPropertyTypeHint(): ClassName {

        return when (propertyHintAnnotation?.fqName?.asString()) {
            "godot.annotation.ColorNoAlpha" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_COLOR_NO_ALPHA")
            //TODO: implement ImageCompressLossy
            //TODO: implement ImageCompressLossLess
            //TODO: implement NodePathToEditedNode
            //TODO: implement NodePathValidTypes
            null -> ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_NONE")
            else -> throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation)
        }
    }

    override fun getHintString(): String {
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
