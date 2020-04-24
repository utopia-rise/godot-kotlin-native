package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.assignmentPsi
import godot.entrygenerator.extension.getPropertyHintAnnotation
import godot.entrygenerator.mapper.PropertyHintTypeMapper
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

class EnumFlagRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {

    override fun getDefaultValue(): Pair<String, Array<Any>> {
        if (propertyHintAnnotation == null || propertyHintAnnotation.fqName?.asString() != "godot.annotation.EnumFlag") {
            throw IllegalStateException("The property \"${propertyDescriptor.fqNameSafe}\" is not annotated with @EnumFlag!")
        }
        return super.getDefaultValue()
    }
    override fun getPropertyTypeHint(): ClassName {
        throw UnsupportedOperationException("Hint type for enum is always the same, so it is handled by binding at runtime")
    }

    override fun getHintString(): String {
        throw UnsupportedOperationException("Hint string for enums is handled by the binding at runtime.")
    }
}
