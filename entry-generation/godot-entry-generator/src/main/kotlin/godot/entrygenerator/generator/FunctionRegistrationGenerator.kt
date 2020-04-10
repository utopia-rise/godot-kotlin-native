package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.mapper.RpcModeAnnotationMapper.Companion.mapRpcModeAnnotationToClassName
import godot.entrygenerator.model.REGISTER_FUNCTION_ANNOTATION
import godot.entrygenerator.model.REGISTER_FUNCTION_ANNOTATION_RPC_MODE_ARGUMENT
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.Name

object FunctionRegistrationGenerator {

    fun registerFunctions(
        functions: List<FunctionDescriptor>,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName
    ) {
        functions.forEach { functionDescriptor ->
            registerClassControlFlow.addStatement(
                "function(%S,·%L,·%M)",
                functionDescriptor.name,
                className.member(functionDescriptor.name.asString()),
                mapRpcModeAnnotationToClassName(getRpcModeEnum(functionDescriptor))
            )
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
            .getAnnotationValue(REGISTER_FUNCTION_ANNOTATION, REGISTER_FUNCTION_ANNOTATION_RPC_MODE_ARGUMENT) {
                IllegalStateException("${functionDescriptor.name} has no RegisterFunction annotation even though the annotation processor found one.")
            }
    }
}
