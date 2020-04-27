package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.isAnyResourceType
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
        if (!propertyDescriptor.type.isAnyResourceType()) {
            throw IllegalStateException("You defined the type of the property \"${propertyDescriptor.fqNameSafe}\" to be a custom resource type. Custom resource types cannot be registered! Use one of the prebuilt ones from Godot!")
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
