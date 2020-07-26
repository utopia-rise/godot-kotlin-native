package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.TypeName
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.extension.getFirstRegistrableTypeAsFqNameStringOrNull
import godot.entrygenerator.mapper.RpcModeAnnotationMapper.mapRpcModeAnnotationToClassName
import godot.entrygenerator.model.REGISTER_FUNCTION_ANNOTATION
import godot.entrygenerator.model.REGISTER_FUNCTION_ANNOTATION_RPC_MODE_ARGUMENT
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

object FunctionRegistrationGenerator {

    fun registerFunctions(
        functions: List<FunctionDescriptor>,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName
    ) {
        functions.forEach { functionDescriptor ->
            val variantTypeConverterList = getVariantTypeConverterList(functionDescriptor)
            registerClassControlFlow
                .addStatement(
                    getFunctionTemplateString(functionDescriptor, variantTypeConverterList.first),
                    functionDescriptor.name,
                    mapRpcModeAnnotationToClassName(getRpcModeEnum(functionDescriptor)),
                    className.member(functionDescriptor.name.asString()).reference(),
                    *variantTypeConverterList.second
                )
        }
    }

    private fun getFunctionTemplateString(
        functionDescriptor: FunctionDescriptor,
        variantTypeConverterListTemplateString: String
    ): String {
        return if (functionDescriptor.valueParameters.isEmpty()) {
            "function(%S,·%T,·%L)"
        } else {
            "function(%S,·%T,·%L,·$variantTypeConverterListTemplateString)"
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
                Pair(ClassId(FqName("godot.registration"), Name.identifier("RPCMode")), Name.identifier("DISABLED"))
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
                    "getTypeConversionLambda<%T<*>>()"
                } else {
                    "getTypeConversionLambda<%T>()"
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
}
