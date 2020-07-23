package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.assignmentPsi
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

class EnumFlagRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {

    override fun getDefaultValue(): Pair<String, Array<out Any>> {
        if (propertyHintAnnotation == null || propertyHintAnnotation.fqName?.asString() != "godot.annotation.EnumFlag") {
            throw IllegalStateException("The property \"${propertyDescriptor.fqNameSafe}\" is not annotated with @EnumFlag!")
        }
        if (propertyDescriptor.isLateInit || !isVisibleInEditor()) {
            return "%L" to arrayOf("null")
        }
        return getDefaultValueExpression(propertyDescriptor.assignmentPsi) ?: "" to arrayOf()
    }
    override fun getPropertyTypeHint(): ClassName {
        throw UnsupportedOperationException("Hint type for enum is always the same, so it is handled by binding at runtime")
    }

    override fun getHintString(): String {
        throw UnsupportedOperationException("Hint string for enums is handled by the binding at runtime.")
    }
}
