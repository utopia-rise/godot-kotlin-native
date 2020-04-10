package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import org.jetbrains.kotlin.descriptors.FunctionDescriptor

object FunctionRegistrationGenerator {

    fun registerFunctions(
        functions: List<FunctionDescriptor>,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName
    ) {
        functions.forEach { functionDescriptor ->
            registerClassControlFlow.addStatement(
                "function(%S,·%L)",
                className.member(functionDescriptor.name.asString())
            )
        }
    }
}
