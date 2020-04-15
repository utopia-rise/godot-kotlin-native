package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

class ResourceRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {

    override fun getDefaultValue(): Pair<String, Array<Any>> {
        if (!propertyDescriptor.isLateInit && isVisibleInEditor()) {
            throw IllegalStateException("You initialized the property \"${propertyDescriptor.fqNameSafe}\". Properties of type Resource which are registered using the @RegisterProperty annotation and are visible in the editor are not allowed to have a default value. Use lateinit.")
        }
        return super.getDefaultValue()
    }

    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation?.fqName?.asString()) {
            //TODO: implement ResourceType
            null -> ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_NONE")
            else -> throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation)
        }
    }

    override fun getHintString(): String {
        //TODO: implement ResourceType
        return ""
    }
}
