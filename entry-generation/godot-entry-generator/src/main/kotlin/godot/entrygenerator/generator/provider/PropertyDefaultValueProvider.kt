package godot.entrygenerator.generator.provider

import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.source.KotlinSourceElement
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor

object PropertyDefaultValueProvider {
    fun provideDefaultValue(
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext
    ): String {
        if (!propertyDescriptor.isVar) {
            throw IllegalStateException("The property ${propertyDescriptor.fqNameSafe} you annotated with @RegisterProperty is a val. You can only register properties which are mutable as Godot needs to be able to write into it")
        }

        val defaultArgumentPsi = ((propertyDescriptor
            .source as KotlinSourceElement)
            .psi as KtProperty)
            .delegateExpressionOrInitializer!! // should not be null

        val defaultValueExpression = getDefaultValueExpression(defaultArgumentPsi, bindingContext)
        if (defaultValueExpression == null) {
            throw IllegalStateException("You initialized the property ${propertyDescriptor.fqNameSafe} (which you annotated with @RegisterProperty) with a reference: ${defaultArgumentPsi.text}. This is not supported! initialize your property with a compile time constant")
        }

        return defaultValueExpression
    }

    private fun getDefaultValueExpression(expression: KtExpression, bindingContext: BindingContext): String? {
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
                    .firstOrNull { getDefaultValueExpression(it, bindingContext) != null }
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
