package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

class ResourceRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {

    override fun getDefaultValue(): Pair<String, Array<out Any>> {
        if (!propertyDescriptor.isLateInit && isVisibleInEditor()) {
            throw IllegalStateException("You initialized the property \"${propertyDescriptor.fqNameSafe}\". Properties of type Resource which are registered using the @RegisterProperty annotation and are visible in the editor are not allowed to have a default value. Use lateinit.")
        }
        return super.getDefaultValue()
    }

    override fun getPropertyTypeHint(): ClassName {
        return ClassName(
            "godot.gdnative.godot_property_hint",
            "GODOT_PROPERTY_HINT_RESOURCE_TYPE"
        )
    }

    override fun getHintString(): String {
        return propertyDescriptor.type.toString()
    }
}
