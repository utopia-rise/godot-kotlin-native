package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.assignmentPsi
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor

abstract class RegistrationValuesHandler(
    val propertyDescriptor: PropertyDescriptor,
    val bindingContext: BindingContext
) {
    abstract fun getDefaultValueStringTemplate(): String
    abstract fun getDefaultValueStringTemplateValues(): Array<Any>
    abstract fun getPropertyTypeHint(): ClassName
    abstract fun getHintString(): String

    protected fun getDefaultValue(): String {
        val defaultValue = getDefaultValueExpression(propertyDescriptor.assignmentPsi)
        if (defaultValue == null) {
            throw IllegalStateException("") //TODO: error
        }
        return defaultValue
    }

    private fun getDefaultValueExpression(expression: KtExpression): String? {
        if (expression is KtConstantExpression) {
            return expression.text
        } else if (expression is KtStringTemplateExpression && !expression.hasInterpolation()) {
            return expression.text
        } else if (expression is KtDotQualifiedExpression) {
            val receiver = expression.receiverExpression
            val receiverRef = receiver.getReferenceTargets(bindingContext).firstOrNull()

            if (receiverRef != null) {
                val psi = receiverRef.findPsi()
                if (psi is KtClass && psi.isEnum()) {
                    return "${psi.fqName}.${expression.selectorExpression!!.text}"
                }
            }
        } else if (expression is KtCallExpression) {
            val ref = expression.referenceExpression()?.getReferenceTargets(bindingContext)
                ?.firstOrNull()

            if (ref != null) {
                val psi = ref.findPsi()
                val argWithRef = expression.valueArguments.mapNotNull { it.getArgumentExpression() }
                    .firstOrNull { getDefaultValueExpression(it) != null }
                if (psi is KtConstructor<*> && argWithRef == null) {
                    return "${psi.getContainingClassOrObject().fqName}${expression.valueArgumentList!!.text}"
                } else if (ref is DeserializedClassConstructorDescriptor) {
                    return "${ref.constructedClass.fqNameSafe}${expression.valueArgumentList!!.text}"
                }
            }
        }

        return null
    }
}
