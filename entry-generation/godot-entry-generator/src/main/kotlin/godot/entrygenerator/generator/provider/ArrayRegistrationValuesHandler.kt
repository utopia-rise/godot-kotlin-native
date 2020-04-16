package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
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
import org.jetbrains.kotlin.types.KotlinType

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

    override fun getHintString(): String {

        propertyDescriptor
            .assignmentPsi

        return when (propertyHintAnnotation?.fqName?.asString()) {
            null -> ""
            else -> throw IllegalStateException("Unknown annotation ${propertyHintAnnotation.fqName}")
        }
    }

    //TODO: this will return the hintString for the array
    private fun getDefaultValueExpression(expression: KtExpression): String? {
        if (expression is KtConstantExpression) {
            return expression.getType(bindingContext)?.getJetTypeFqName(false)
        } else if (expression is KtStringTemplateExpression && !expression.hasInterpolation()) {
            return KotlinType.builtIns.string.fqNameSafe.asString()
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
                val transformedReceiverArgs = getDefaultValueExpression(receiver)
                val expressionRef = expression
                    .selectorExpression
                    ?.referenceExpression()
                    ?.getReferenceTargets(bindingContext)
                    ?.firstOrNull()

                if (transformedReceiverArgs != null && expressionRef?.fqNameSafe?.asString() == "godot.core.toVariantArray") {
                    val fqName = expressionRef.fqNameSafe
                    val pkg = fqName.parent().asString()
                    val functionName = fqName.shortName().asString()

                    val params = mutableListOf<Any>()
                    params.addAll(transformedReceiverArgs.second)
                    params.add(MemberName(pkg, functionName))

//                    return "${transformedReceiverArgs.first}.%M()" to params.toTypedArray()
                    return "" //TODO: cedric
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

                // if an arg is null, then it means that it contained a non static reference
                var hasNullArg = false
                for (arg in transformedArgs) {
                    if (arg == null) {
                        hasNullArg = true
                        break
                    }
                }

                if (psi is KtConstructor<*> && !hasNullArg) {
                    val fqName = psi.containingClassOrObject!!.fqName
                    require(fqName != null)
                    val pkg = fqName.parent().asString()
                    val className = fqName.shortName().asString()
                    val params = mutableListOf<Any>()
                    params.add(ClassName(pkg, className))
                    transformedArgs.forEach { params.addAll(it!!.second) }
//                    return "%T(${transformedArgs.joinToString { it!!.first }})" to params.toTypedArray()
                    return "" //TODO: cedric
                } else if (ref is DeserializedClassConstructorDescriptor && !hasNullArg) {
                    val fqName = ref.constructedClass.fqNameSafe
                    val pkg = fqName.parent().asString()
                    val className = fqName.shortName().asString()
                    val params = mutableListOf<Any>()
                    params.add(ClassName(pkg, className))
                    transformedArgs.forEach { params.addAll(it!!.second) }
//                    return "%T(${transformedArgs.joinToString { it!!.first }})" to params.toTypedArray()
                    return "" //TODO: cedric
                } else if (ref is DeserializedSimpleFunctionDescriptor && ref.fqNameSafe.asString() == "godot.core.variantArrayOf") {
                    val fqName = ref.fqNameSafe
                    val pkg = fqName.parent().asString()
                    val functionName = fqName.shortName().asString()
                    val params = mutableListOf<Any>()
                    params.add(MemberName(pkg, functionName))
                    transformedArgs.forEach { params.addAll(it!!.second) }
//                    return "%M(${transformedArgs.joinToString { it!!.first }})" to params.toTypedArray()
                    return "" //TODO: cedric
                } else if (expression.getType(bindingContext)?.getJetTypeFqName(false) == "kotlin.Array") {
                    //arrayOf -> ref is null in this case
                    val params = mutableListOf<Any>()
                    params.add(expression.children.first().text)
                    transformedArgs.forEach { params.addAll(it!!.second) }
//                    return "%L(${transformedArgs.joinToString { it!!.first }})" to params.toTypedArray()
                    return "" //TODO: cedric
                }
            }
        }

        return null
    }
}
