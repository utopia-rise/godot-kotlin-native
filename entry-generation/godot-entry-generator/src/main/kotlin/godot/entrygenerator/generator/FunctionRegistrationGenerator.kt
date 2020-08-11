package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asTypeName
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.extension.getFirstRegistrableTypeAsFqNameStringOrNull
import godot.entrygenerator.mapper.RpcModeAnnotationMapper.mapRpcModeAnnotationToClassName
import godot.entrygenerator.model.REGISTER_FUNCTION_ANNOTATION
import godot.entrygenerator.model.REGISTER_FUNCTION_ANNOTATION_RPC_MODE_ARGUMENT
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.supertypes

object FunctionRegistrationGenerator {

    fun registerFunctions(
        functions: List<FunctionDescriptor>,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName
    ) {
        functions.forEach { functionDescriptor ->
            val variantToTypeConverterList = getVariantTypeConverterList(functionDescriptor)
            val typeToVariantConverter = getTypeToVariantConverter(functionDescriptor)
            registerClassControlFlow
                .addStatement(
                    getFunctionTemplateString(functionDescriptor, typeToVariantConverter.first, variantToTypeConverterList.first),
                    functionDescriptor.name,
                    mapRpcModeAnnotationToClassName(getRpcModeEnum(functionDescriptor)),
                    className.member(functionDescriptor.name.asString()).reference(),
                    typeToVariantConverter.second,
                    *variantToTypeConverterList.second
                )
        }
    }

    private fun getFunctionTemplateString(
        functionDescriptor: FunctionDescriptor,
        typeToVariantConverter: String,
        variantToTypeConverterList: String
    ): String {
        return if (functionDescriptor.valueParameters.isEmpty()) {
            "function(%S,·%T,·%L,·$typeToVariantConverter)"
        } else {
            "function(%S,·%T,·%L,·$typeToVariantConverter,·$variantToTypeConverterList)"
        }
    }

    private fun getRpcModeEnum(functionDescriptor: FunctionDescriptor): String {
        val compilerRpcModeEnumRepresentation = getCompilerRpcModeEnumRepresentation(functionDescriptor)
        val packagePath = compilerRpcModeEnumRepresentation.first.asString().replace("/", ".")
        val name = compilerRpcModeEnumRepresentation.second
        return "$packagePath.$name"
    }

    private fun getCompilerRpcModeEnumRepresentation(functionDescriptor: FunctionDescriptor): Pair<ClassId, Name> {
        return functionDescriptor
            .annotations
            .getAnnotationValue(
                REGISTER_FUNCTION_ANNOTATION,
                REGISTER_FUNCTION_ANNOTATION_RPC_MODE_ARGUMENT,
                Pair(ClassId(FqName("godot.MultiplayerAPI"), Name.identifier("RPCMode")), Name.identifier("DISABLED"))
            )
    }

    private fun getVariantTypeConverterList(functionDescriptor: FunctionDescriptor): Pair<String, Array<TypeName>> {
        val templateArguments = mutableListOf<TypeName>()
        val template = buildString {
            append("listOf(")
            functionDescriptor.valueParameters.forEach {
                val firstRegistrableType = it.type.getFirstRegistrableTypeAsFqNameStringOrNull()
                    ?: throw IllegalArgumentException("Registered function \"${functionDescriptor.fqNameSafe}\" receives an unregistrable type: ${it.name}. All arguments of a registered functions have to be either primitive or derive from a Godot type")

                if (firstRegistrableType == "godot.core.EnumArray") {
                    throw IllegalArgumentException("Registered function \"${functionDescriptor.fqNameSafe}\" receives an EnumArray as param: ${it.name}. EnumArrays cannot be registered as params for functions. Use IntVariantArray instead.")
                }
                if (firstRegistrableType == "godot.core.ObjectArray") {
                    throw IllegalArgumentException("Registered function \"${functionDescriptor.fqNameSafe}\" receives an ObjectArray as param: ${it.name}. ObjectArray cannot be registered as params for functions. Use VariantArray instead and use the asObjectArray() function for conversion.")
                }

                val typeAsString = firstRegistrableType
                    .replaceBeforeLast(".", "")
                    .replace(".", "")

                val packageAsString = firstRegistrableType
                    .replaceAfterLast(".", "")

                val argumentTemplateString = if (typeAsString == "GodotArray") {
                    "getVariantToTypeConversionFunction<%T<*>>()"
                } else {
                    "getVariantToTypeConversionFunction<%T>()"
                }

                append(argumentTemplateString)
                templateArguments.add(ClassName(packageAsString, typeAsString))

                if (functionDescriptor.valueParameters.last() != it) {
                    append(",·")
                }
            }
            append(")")
        }
        return template to templateArguments.toTypedArray()
    }

    private fun getTypeToVariantConverter(functionDescriptor: FunctionDescriptor): Pair<String, ClassName> {
        return functionDescriptor.returnType?.let { returnType ->
            val className = when {
                isOfType(returnType, "godot.internal.type.CoreType") -> ClassName("godot.internal.type", "CoreType")
                isOfType(returnType, "godot.Object") -> ClassName("godot", "Object")
                isOfType(returnType, "godot.core.Variant") -> ClassName("godot.core", "Variant")
                KotlinBuiltIns.isInt(returnType) -> Int::class.asTypeName()
                KotlinBuiltIns.isLongOrNullableLong(returnType) -> Long::class.asTypeName()
                KotlinBuiltIns.isDoubleOrNullableDouble(returnType) -> Double::class.asTypeName()
                KotlinBuiltIns.isFloatOrNullableFloat(returnType) -> Float::class.asTypeName()
                KotlinBuiltIns.isBooleanOrNullableBoolean(returnType) -> Boolean::class.asTypeName()
                KotlinBuiltIns.isStringOrNullableString(returnType) -> String::class.asTypeName()
                KotlinBuiltIns.isUnit(returnType) -> null
                else -> throw IllegalArgumentException("Registered functions \"${functionDescriptor.fqNameSafe}\" return type is of unregistrable type: ${returnType}. You can only register functions which return either a primitive or a type derived from a Godot type")
            }

            className?.let {
                "getTypeToVariantConversionFunction<%T>()" to className
            } ?: "{·%T()·}" to ClassName("godot.core", "Variant")
        } ?: "{·%T()·}" to ClassName("godot.core", "Variant")
    }

    private fun isOfType(type: KotlinType, typeFqName: String): Boolean {
        return if (type.getJetTypeFqName(false) == typeFqName) {
            true
        } else {
            type
                .supertypes()
                .any { it.getJetTypeFqName(false) == typeFqName }
        }
    }
}
