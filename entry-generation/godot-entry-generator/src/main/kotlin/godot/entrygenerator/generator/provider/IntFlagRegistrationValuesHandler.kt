package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.model.INT_FLAG_ANNOTATION_NAMES_ARGUMENT
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.constants.StringValue

class IntFlagRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {

    override fun getPropertyTypeHint(): ClassName {
        return ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_FLAGS")
    }

    override fun getHintString(): String {
        if (!KotlinBuiltIns.isInt(propertyDescriptor.type)) {
            throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation, Int::class.qualifiedName)
        }

        return propertyHintAnnotation
            ?.getAnnotationValue(INT_FLAG_ANNOTATION_NAMES_ARGUMENT, ArrayList<StringValue>())
            ?.map { it.value }
            ?.joinToString(",") { it.removeSurrounding("\"") }
            ?: ""
    }
}
