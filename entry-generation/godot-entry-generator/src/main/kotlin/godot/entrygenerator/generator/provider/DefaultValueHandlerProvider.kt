package godot.entrygenerator.generator.provider

import godot.entrygenerator.extension.isCoreType
import godot.entrygenerator.extension.isResource
import godot.entrygenerator.extension.isVariantArray
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.types.typeUtil.isEnum

object DefaultValueHandlerProvider {
    fun provideDefaultValueHandler(
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext
    ): RegistrationValuesHandler {
        return when {
            KotlinBuiltIns.isInt(propertyDescriptor.type)
                || KotlinBuiltIns.isInt(propertyDescriptor.type)
                || KotlinBuiltIns.isLong(propertyDescriptor.type)
                || KotlinBuiltIns.isFloat(propertyDescriptor.type)
                || KotlinBuiltIns.isDouble(propertyDescriptor.type)
                || KotlinBuiltIns.isBoolean(propertyDescriptor.type)
                || KotlinBuiltIns.isString(propertyDescriptor.type) -> PrimitiveRegistrationValuesHandler(
                propertyDescriptor,
                bindingContext
            )
            propertyDescriptor.type.isEnum() -> EnumRegistrationValuesHandler(propertyDescriptor, bindingContext)
            propertyDescriptor.type.isCoreType() -> CoreTypeRegistrationValuesHandler(
                propertyDescriptor,
                bindingContext
            )
            propertyDescriptor.type.isResource() -> ResourceRegistrationValuesHandler(
                propertyDescriptor,
                bindingContext
            )
            propertyDescriptor.type.isVariantArray() -> ArrayRegistrationValuesHandler(
                propertyDescriptor,
                bindingContext
            )
            else -> TODO()
        }
    }
}
