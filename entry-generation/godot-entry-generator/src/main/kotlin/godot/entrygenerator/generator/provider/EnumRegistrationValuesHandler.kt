package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

class EnumRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {

    override fun getPropertyTypeHint(): ClassName {
        throw UnsupportedOperationException("Hint type for enum is always the same, so it is handled by binding at runtime")
    }

    override fun getHintString(): String {
        throw UnsupportedOperationException("Hint string for enums is handled by the binding at runtime.")
    }
}
