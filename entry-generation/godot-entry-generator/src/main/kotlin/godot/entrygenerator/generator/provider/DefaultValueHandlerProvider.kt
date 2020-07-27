package godot.entrygenerator.generator.provider

import godot.entrygenerator.extension.isCompatibleList
import godot.entrygenerator.extension.isCoreType
import godot.entrygenerator.extension.isResource
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.types.typeUtil.isEnum

object DefaultValueHandlerProvider {
    fun provideDefaultValueHandler(
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext
    ): RegistrationValuesHandler {
        return when {
            KotlinBuiltIns.isInt(propertyDescriptor.type) ->
                if (propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.IntFlag"))) {
                    IntFlagRegistrationValuesHandler(
                        propertyDescriptor,
                        bindingContext
                    )
                } else {
                    PrimitiveRegistrationValuesHandler(
                        propertyDescriptor,
                        bindingContext
                    )
                }

            KotlinBuiltIns.isString(propertyDescriptor.type) ->
                if (propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.MultilineText"))) {
                    MultiLineTextRegistrationValuesHandler(
                        propertyDescriptor,
                        bindingContext
                    )
                } else if (propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.PlaceHolderText"))) {
                    PlaceholderTextRegistrationValuesHandler(
                        propertyDescriptor,
                        bindingContext
                    )
                } else {
                    PrimitiveRegistrationValuesHandler(
                        propertyDescriptor,
                        bindingContext
                    )
                }

            KotlinBuiltIns.isLong(propertyDescriptor.type)
                || KotlinBuiltIns.isFloat(propertyDescriptor.type)
                || KotlinBuiltIns.isDouble(propertyDescriptor.type)
                || KotlinBuiltIns.isBoolean(propertyDescriptor.type) -> PrimitiveRegistrationValuesHandler(
                propertyDescriptor,
                bindingContext
            )
            propertyDescriptor.type.isEnum() -> EnumRegistrationValuesHandler(propertyDescriptor, bindingContext)
            propertyDescriptor.type.isCoreType() && !propertyDescriptor.type.isCompatibleList() -> CoreTypeRegistrationValuesHandler(
                propertyDescriptor,
                bindingContext
            )
            propertyDescriptor.type.isResource() -> ResourceRegistrationValuesHandler(
                propertyDescriptor,
                bindingContext
            )
            propertyDescriptor.type.isCompatibleList() -> ArrayRegistrationValuesHandler(
                propertyDescriptor,
                bindingContext
            )
            KotlinBuiltIns.isSetOrNullableSet((propertyDescriptor.type)) -> EnumFlagRegistrationValuesHandler(
                propertyDescriptor,
                bindingContext
            )
            else -> TODO()
        }
    }
}
