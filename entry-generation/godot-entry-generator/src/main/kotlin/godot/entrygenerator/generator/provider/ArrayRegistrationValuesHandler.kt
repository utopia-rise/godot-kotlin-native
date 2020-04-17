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
        // at this point we know type is either a List, Array, VariantArray or a primitive array
        val type = propertyDescriptor.type

        if (KotlinBuiltIns.isPrimitiveArray(type)) {
            return getPrimitiveArrayHint(type)
        }

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
                        if (KotlinBuiltIns.isPrimitiveArray(currentType)) {
                            hintBuilder += getPrimitiveArrayHint(currentType)
                            break
                        }
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

    private fun getPrimitiveArrayHint(type: KotlinType): String {
        return when (type.getJetTypeFqName(false)) {
            "kotlin.IntArray", "kotlin.LongArray", "kotlin.ShortArray", "kotlin.ByteArray" -> "Array,int"
            "kotlin.FloatArray", "kotlin.DoubleArray" -> "Array,float"
            "kotlin.BooleanArray" -> "Array,bool"
            else -> throw AssertionError("Unknown primitive array type $type")
        }
    }
}
