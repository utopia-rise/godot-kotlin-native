package godot.entrygenerator.generator.provider

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.extension.assignmentPsi
import godot.entrygenerator.extension.getAsGodotPrimitive
import godot.entrygenerator.extension.isGodotPrimitive
import godot.entrygenerator.extension.isString
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

    override fun getHintString(): String {
        return mapFqNameToHintStringSupportedTypeWithAdditionalTypeInfo(
            getArrayTypesAsFqStringsWithAdditionalTypeInformations(propertyDescriptor.assignmentPsi)
        )
    }

    private fun mapFqNameToHintStringSupportedTypeWithAdditionalTypeInfo(
        typesAsFqStringWithAdditionalTypeInfo: Pair<List<String?>, LinkedHashSet<String>>
    ): String {
        if (typesAsFqStringWithAdditionalTypeInfo.first.any { it == null }) {
            return ""
        }
        val godotTypes = typesAsFqStringWithAdditionalTypeInfo
            .first
            .map { requireNotNull(it) { "Already did a nullcheck on type strings. Still one was null. Somewhere the list must be altered. Prevent this!" } }
            .map {
                when {
                    it == "godot.core.VariantArray" -> "Array"
                    it.isString() -> it.split(".").last()
                    it.isGodotPrimitive() -> it.getAsGodotPrimitive()
                    //TODO: add more godot registrable types once they are implemented (ex: NodePath)
                    else -> null
                }
            }
        return if (godotTypes.any { it == null }) {
            ""
        } else {
            val typesAdAdditionalTypeInfos = mutableListOf<String>()
            typesAdAdditionalTypeInfos.addAll(godotTypes.map { it!! })
            typesAdAdditionalTypeInfos.addAll(typesAsFqStringWithAdditionalTypeInfo.second)
            typesAdAdditionalTypeInfos.joinToString(",")
        }
    }

    private fun getArrayTypesAsFqStringsWithAdditionalTypeInformations(expression: KtExpression): Pair<MutableList<String?>, LinkedHashSet<String>> {
        val types = mutableListOf<String?>()
        val additionalTypeInfo = linkedSetOf<String>()

        if (expression is KtConstantExpression) {
            types.add(expression.getType(bindingContext)?.getJetTypeFqName(false))
            return types to additionalTypeInfo
        } else if (expression is KtStringTemplateExpression && !expression.hasInterpolation()) {
            types.add(expression.getType(bindingContext)?.builtIns?.string?.fqNameSafe?.asString())
            return types to additionalTypeInfo
        } else if (expression is KtDotQualifiedExpression) {
            val receiver = expression.receiverExpression
            val receiverRef = receiver.getReferenceTargets(bindingContext).firstOrNull()

            if (receiverRef != null) {
                val psi = receiverRef.findPsi()
                // TODO: receiver ref might be a deserialized descriptor, fix this once we have core classes
                if (psi is KtClass && psi.isEnum()) {
                    val enumStrings = expression
                        .getType(bindingContext)
                        ?.memberScope
                        ?.getVariableNames()
                        ?.map { it.asString() }
                        ?.filter { it != "name" && it != "ordinal" }
                        ?.map { "\"$it\"" }

                    if (enumStrings != null) {
                        additionalTypeInfo.addAll(enumStrings)
                    }
                    types.add("kotlin.Int")

                    return types to additionalTypeInfo
                }
            } else if (receiver.getType(bindingContext)?.getJetTypeFqName(false) == "kotlin.Array") {
                //arrayOf() is receiver
                val receiverTypes = getArrayTypesAsFqStringsWithAdditionalTypeInformations(receiver)
                val expressionRef = expression
                    .selectorExpression
                    ?.referenceExpression()
                    ?.getReferenceTargets(bindingContext)
                    ?.firstOrNull()

                additionalTypeInfo.addAll(receiverTypes.second)

                return when {
                    receiverTypes.first.isNotEmpty() && expressionRef?.fqNameSafe?.asString() == "godot.core.toVariantArray" -> {
                        types.addAll(receiverTypes.first)
                        types to additionalTypeInfo
                    }
                    receiverTypes.first.isNotEmpty() -> {
                        types.add("godot.core.VariantArray")
                        types.addAll(receiverTypes.first)
                        types to additionalTypeInfo
                    }
                    else -> {
                        //TODO: message collector print warning that no hint string is created because of unknown receiver type
                        types to additionalTypeInfo
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
                    .map { getArrayTypesAsFqStringsWithAdditionalTypeInformations(it) }
                    .map {
                        it.first.distinct()
                        it.second.distinct()
                        it
                    }
                    .distinct()

                arrayTypes.forEach {
                    additionalTypeInfo.addAll(it.second)
                }

                if (arrayTypes.size != 1) {
                    //TODO: message collector print warning that no hint string is created because of different types in array
                    return mutableListOf<String?>("") to linkedSetOf()
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
                    types.addAll(
                        getForConstructorCall(
                            psi.containingClassOrObject!!.fqName?.asString(),
                            arrayTypes.first().first
                        )
                    )
                    return types to additionalTypeInfo
                } else if (ref is DeserializedClassConstructorDescriptor && !hasNullArg) {
                    types.addAll(
                        getForConstructorCall(
                            ref.constructedClass.fqNameSafe.asString(),
                            arrayTypes.first().first
                        )
                    )
                    return types to additionalTypeInfo
                } else if (ref is DeserializedSimpleFunctionDescriptor && ref.fqNameSafe.asString() == "godot.core.variantArrayOf") {
                    types.add("godot.core.VariantArray")
                    types.addAll(arrayTypes.first().first)
                    return types to additionalTypeInfo
                } else if (expression.getType(bindingContext)?.getJetTypeFqName(false) == "kotlin.Array") {
                    types.add("godot.core.VariantArray")
                    types.addAll(arrayTypes.first().first)
                    return types to additionalTypeInfo
                }
            }
        }
        //TODO: message collector print warning that no hint string is created because of unknown declaration
        return types to additionalTypeInfo
    }

    private fun getForConstructorCall(fqName: String?, arrayTypes: List<String?>): List<String?> {
        val types = arrayTypes.toMutableList()
        types.removeIf { arrayTypes.indexOf(it) == 0 && it == "godot.core.VariantArray" } //replace first to accumulate for multidimensional arrays

        val typesToReturn = mutableListOf<String?>()
        when (fqName) {
            "godot.core.VariantArray" -> {
                typesToReturn.add("godot.core.VariantArray")
                typesToReturn.addAll(types)
            }
            "godot.core.Variant" -> typesToReturn.add(arrayTypes.first())
            //TODO: add more godot registrable types once they are implemented (ex: NodePath)
            else -> typesToReturn.add("godot.core.Object")
        }
        return typesToReturn
    }
}
