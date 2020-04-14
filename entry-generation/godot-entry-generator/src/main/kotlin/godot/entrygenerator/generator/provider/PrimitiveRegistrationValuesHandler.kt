package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.getPropertyHintAnnotation
import godot.entrygenerator.mapper.PropertyHintTypeMapper
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

class PrimitiveRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {
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
}
