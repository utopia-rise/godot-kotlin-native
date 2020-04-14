package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

abstract class RegistrationValuesHandler(
    val propertyDescriptor: PropertyDescriptor,
    val bindingContext: BindingContext
) {
    abstract fun getDefaultValueStringTemplate(): String
    abstract fun getDefaultValueStringTemplateValues(): Array<Any>
    abstract fun getPropertyTypeHint(): ClassName
    abstract fun getHintString(): String
}
