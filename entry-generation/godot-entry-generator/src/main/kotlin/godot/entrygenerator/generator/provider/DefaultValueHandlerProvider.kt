package godot.entrygenerator.generator.provider

import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

object DefaultValueHandlerProvider {
    fun provideDefaultValueHandler(
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext
    ): RegistrationValuesHandler {
        return when  {
            KotlinBuiltIns.isInt(propertyDescriptor.type)
                || KotlinBuiltIns.isInt(propertyDescriptor.type)
                || KotlinBuiltIns.isLong(propertyDescriptor.type)
                || KotlinBuiltIns.isFloat(propertyDescriptor.type)
                || KotlinBuiltIns.isDouble(propertyDescriptor.type)
                || KotlinBuiltIns.isBoolean(propertyDescriptor.type)
                || KotlinBuiltIns.isString(propertyDescriptor.type) -> PrimitiveRegistrationValuesHandler(propertyDescriptor, bindingContext)
            else -> TODO()
        }
    }
}
