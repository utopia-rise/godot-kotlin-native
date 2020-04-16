package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.extension.assignmentPsi
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.containingClassOrObject
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.calls.callUtil.getType
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor
import org.jetbrains.kotlin.types.typeUtil.builtIns

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

    //Pair(propertyDescriptor.assignmentPsi.text, getHintString(propertyDescriptor.assignmentPsi))
    override fun getHintString(): String {
        return getHintString(propertyDescriptor.assignmentPsi) ?: ""
    }

    //TODO: this will return the hintString for the array
    private fun getHintString(expression: KtExpression): String? {
        if (expression is KtConstantExpression) {
            return expression.getType(bindingContext)?.getJetTypeFqName(false)
        } else if (expression is KtStringTemplateExpression && !expression.hasInterpolation()) {
            return expression.getType(bindingContext)?.builtIns?.string?.fqNameSafe?.asString()
        } else if (expression is KtDotQualifiedExpression) {
            val receiver = expression.receiverExpression
            val receiverRef = receiver.getReferenceTargets(bindingContext).firstOrNull()

            if (receiverRef != null) {
                val psi = receiverRef.findPsi()
                // TODO: receiver ref might be a deserialized descriptor, fix this once we have core classes
                if (psi is KtClass && psi.isEnum()) {
                    val fqName = psi.fqName
                    require(fqName != null)
                    val pkg = fqName.parent().asString()
                    val className = fqName.shortName().asString()
//                    return "%T.%L" to arrayOf(ClassName(pkg, className), expression.selectorExpression!!.text)
                    return "" //TODO: ranie
                }
            } else if (receiver.getType(bindingContext)?.getJetTypeFqName(false) == "kotlin.Array") {
                //arrayOf() is receiver
                val receiverType = getHintString(receiver)
                val expressionRef = expression
                    .selectorExpression
                    ?.referenceExpression()
                    ?.getReferenceTargets(bindingContext)
                    ?.firstOrNull()

                return when {
                    receiverType != null && expressionRef?.fqNameSafe?.asString() == "godot.core.toVariantArray" -> {
                        receiverType
                    }
                    receiverType != null -> {
                        "godot.core.VariantArray,${receiverType}"
                    }
                    else -> {
                        null
                    }
                }
            }
        } else if (expression is KtCallExpression) {
            val ref = expression
                .referenceExpression()
                ?.getReferenceTargets(bindingContext)
                ?.firstOrNull()

            if (ref != null) {
                val psi = ref.findPsi()

                val transformedArgs = expression
                    .valueArguments
                    .mapNotNull { it.getArgumentExpression() }
                    .map { getDefaultValueExpression(it) }

                val arrayTypes = expression
                    .valueArguments
                    .mapNotNull { it.getArgumentExpression() }
                    .map { getHintString(it) }
                    .distinct()

                if (arrayTypes.size != 1) {
                    return null
                }

                // if an arg is null, then it means that it contained a non static reference
                var hasNullArg = false
                for (arg in transformedArgs) {
                    if (arg == null) {
                        hasNullArg = true
                        break
                    }
                }

                if (psi is KtConstructor<*> && !hasNullArg) {
                    return when {
                        psi.containingClassOrObject!!.fqName?.asString() == "godot.core.VariantArray" -> {
                            val types = arrayTypes
                                .first()
                                ?.replaceFirst(
                                    "godot.core.VariantArray",
                                    ""
                                ) //replace first to accumulate for multidimensional arrays
                                ?.removePrefix(",")

                            "godot.core.VariantArray,$types"
                        }
                        psi.containingClassOrObject!!.fqName?.asString() == "godot.core.Variant" -> {
                            return arrayTypes.first()
                        }
                        else -> {
                            "godot.core.Object"
                        }
                    }
                } else if (ref is DeserializedClassConstructorDescriptor && !hasNullArg) {
                    return when {
                        ref.constructedClass.fqNameSafe.asString() == "godot.core.VariantArray" -> {
                            val types = arrayTypes
                                .first()
                                ?.replaceFirst(
                                    "godot.core.VariantArray",
                                    ""
                                ) //replace first to accumulate for multidimensional arrays
                                ?.removePrefix(",")

                            "godot.core.VariantArray,$types"
                        }
                        ref.constructedClass.fqNameSafe.asString() == "godot.core.Variant" -> {
                            return arrayTypes.first()
                        }
                        else -> {
                            "godot.core.Object"
                        }
                    }
                } else if (ref is DeserializedSimpleFunctionDescriptor && ref.fqNameSafe.asString() == "godot.core.variantArrayOf") {
                    return "godot.core.VariantArray,${arrayTypes.first()}"

                } else if (expression.getType(bindingContext)?.getJetTypeFqName(false) == "kotlin.Array") {
                    return "godot.core.VariantArray,${arrayTypes.first()}"
                }
            }
        }
        return null
    }
}
