package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.assignmentPsi
import godot.entrygenerator.extension.getPropertyHintAnnotation
import godot.entrygenerator.mapper.PropertyHintTypeMapper
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.psi.KtConstantExpression
import org.jetbrains.kotlin.resolve.BindingContext

class IntRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {

    override fun getDefaultValueStringTemplate(): String {
        return if (propertyDescriptor.isLateInit) {
            "%L"
        } else {
            "%T(%L)"
        }
    }

    override fun getDefaultValueStringTemplateValues(): Array<Any> {
        return if (propertyDescriptor.isLateInit) {
            arrayOf("null")
        } else {
            arrayOf(ClassName("godot.core", "Variant"), getDefaultValue())
        }
    }

    override fun getPropertyTypeHint(): ClassName {
        return PropertyHintTypeMapper
            .mapAnnotationDescriptorToPropertyTypeClassName(propertyDescriptor.getPropertyHintAnnotation())
    }

    override fun getHintString(): String {
        return PropertyHintTypeMapper
            .mapAnnotationDescriptorToPropertyHintString(
                propertyDescriptor,
                propertyDescriptor.getPropertyHintAnnotation()
            )
    }

    private fun getDefaultValue(): String {
        val defaultValuePsi = propertyDescriptor.assignmentPsi

        return if (defaultValuePsi is KtConstantExpression) {
            defaultValuePsi.text
        } else {
            //error
            throw IllegalStateException("") //TODO: error
        }
    }
}
