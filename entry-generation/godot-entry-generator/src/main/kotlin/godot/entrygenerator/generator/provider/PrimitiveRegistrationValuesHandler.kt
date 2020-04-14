package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.assignmentPsi
import godot.entrygenerator.extension.getPropertyHintAnnotation
import godot.entrygenerator.mapper.PropertyHintTypeMapper
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageLocation
import org.jetbrains.kotlin.cli.common.messages.MessageCollector
import org.jetbrains.kotlin.cli.common.messages.MessageCollectorUtil
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.ir.util.endOffset
import org.jetbrains.kotlin.ir.util.startOffset
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.psi.KtConstantExpression
import org.jetbrains.kotlin.psi.KtStringTemplateExpression
import org.jetbrains.kotlin.psi.psiUtil.getTextWithLocation
import org.jetbrains.kotlin.psi.psiUtil.startOffset
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.source.KotlinSourceElement

class PrimitiveRegistrationValuesHandler(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : RegistrationValuesHandler(propertyDescriptor, bindingContext) {

    override fun getDefaultValueStringTemplate(): String {
        return if (propertyDescriptor.isLateInit) {
            "%L"
        } else {
            "%T(%L)"
        }
    }

    override fun getDefaultValueStringTemplateValues(): Array<Any> {
        return if (propertyDescriptor.isLateInit) {
            arrayOf("null")
        } else {
            arrayOf(ClassName("godot.core", "Variant"), getDefaultValue())
        }
    }

    override fun getPropertyTypeHint(): ClassName {
        return PropertyHintTypeMapper
            .mapAnnotationDescriptorToPropertyTypeClassName(propertyDescriptor.getPropertyHintAnnotation())
    }

    override fun getHintString(): String {
        return PropertyHintTypeMapper
            .mapAnnotationDescriptorToPropertyHintString(
                propertyDescriptor,
                propertyDescriptor.getPropertyHintAnnotation()
            )
    }

    private fun getDefaultValue(): String {
        val defaultValuePsi = propertyDescriptor.assignmentPsi

        return if (defaultValuePsi is KtConstantExpression
            || (defaultValuePsi is KtStringTemplateExpression && !defaultValuePsi.hasInterpolation())) {
            defaultValuePsi.text
        } else {
            //error
            throw IllegalStateException("") //TODO: error
        }
    }
}
