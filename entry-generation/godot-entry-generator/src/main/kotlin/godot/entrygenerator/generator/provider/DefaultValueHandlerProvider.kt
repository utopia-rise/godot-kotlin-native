package godot.entrygenerator.generator.provider

import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

object DefaultValueHandlerProvider {
    fun provideDefaultValueHandler(
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext
    ): RegistrationValuesHandler {
        return when (propertyDescriptor.type.toString()) {
            "Int" -> IntRegistrationValuesHandler(propertyDescriptor, bindingContext)
            else -> TODO()
        }
    }
}
