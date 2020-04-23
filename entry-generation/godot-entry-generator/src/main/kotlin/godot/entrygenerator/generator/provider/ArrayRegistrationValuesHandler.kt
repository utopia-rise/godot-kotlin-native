package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.extension.getAsGodotPrimitive
import godot.entrygenerator.extension.isCompatibleList
import godot.entrygenerator.extension.isGodotPrimitive
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.isEnum

class ArrayRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation?.fqName?.asString()) {
            null -> ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_NONE")
            else -> throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation)
        }
    }

    override fun getHintString(): String {
        // at this point we know type is a VariantArray
        val type = propertyDescriptor.type

        val elementType = type.arguments[0].type
        return when {
            KotlinBuiltIns.isAny(elementType) -> ""
            elementType.isEnum() -> {
                // return value is not used, hint is computed at runtime
                ""
            }
            else -> {
                var hintBuilder = "Array"
                var currentType: KotlinType? = elementType

                while (currentType != null) {
                    if (currentType.isCompatibleList()) {
                        hintBuilder += ",Array"
                        currentType = currentType.arguments.firstOrNull()?.type
                    } else if (currentType.getJetTypeFqName(false).isGodotPrimitive()) {
                        hintBuilder += ",${currentType.getJetTypeFqName(false).getAsGodotPrimitive()}"
                        break
                    } else {
                        // Any
                        hintBuilder = ""
                        break
                    }
                }
                hintBuilder
            }
        }
    }
}
