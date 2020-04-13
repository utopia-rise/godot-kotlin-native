package godot.entrygenerator.generator.provider

import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.source.KotlinSourceElement
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor
import org.jetbrains.kotlin.types.asSimpleType

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

        if (isContainingReference(defaultArgumentPsi, bindingContext)) {
            throw IllegalStateException("You initialized the property ${propertyDescriptor.fqNameSafe} (which you annotated with @RegisterProperty) with a reference: ${defaultArgumentPsi.text}. This is not supported! initialize your property with a compile time constant")
        }

        val fqTypeName = propertyDescriptor.type.asSimpleType().getJetTypeFqName(false)

        return if (fqTypeName.startsWith("kotlin")) {
            defaultArgumentPsi.text
        } else {
            "${fqTypeName.substringBeforeLast(".")}.${defaultArgumentPsi.text}"
        }
    }

    private fun isContainingReference(
        expression: KtExpression,
        bindingContext: BindingContext
    ): Boolean {
        return when (expression) {
            // constants
            is KtConstantExpression -> false
            // string constants
            is KtStringTemplateExpression -> expression.hasInterpolation()
            // Enum expressions
            is KtDotQualifiedExpression -> {
                val receiver = expression.receiverExpression
                val receiverRef = receiver.getReferenceTargets(bindingContext).firstOrNull()

                if (receiverRef != null) {
                    val psi = receiverRef.findPsi()
                    !(psi is KtClass && psi.isEnum())
                } else {
                    true
                }
            }
            // constructor call
            is KtCallExpression -> {
                val ref = expression.referenceExpression()?.getReferenceTargets(bindingContext)
                    ?.firstOrNull()

                if (ref != null) {
                    val psi = ref.findPsi()
                    val argWithRef = expression.valueArguments.mapNotNull { it.getArgumentExpression() }
                        .firstOrNull { isContainingReference(it, bindingContext) }
                    !((psi is KtConstructor<*> || ref is DeserializedClassConstructorDescriptor) && argWithRef == null)
                } else {
                    true
                }
            }
            else -> true
        }
    }
}
