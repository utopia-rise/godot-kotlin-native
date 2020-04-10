package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import godot.entrygenerator.extension.getSuperTypeNameAsString
import godot.entrygenerator.model.ClassWithMembers
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

object ClassRegistrationGenerator {

    fun registerClasses(
        classesWithMembers: Set<ClassWithMembers>,
        classRegistryControlFlow: FunSpec.Builder
    ) {
        classesWithMembers.forEach { classWithMembers ->
            val classNameAsString = classWithMembers.classDescriptor.name.asString()
            val packagePath = classWithMembers.classDescriptor.fqNameSafe.parent().asString()
            val className = ClassName(packagePath, classNameAsString)
            val superClass = classWithMembers.classDescriptor.getSuperTypeNameAsString()

            val registerClassControlFlow = classRegistryControlFlow.beginControlFlow(
                "registerClass(%S,·%S,·%L)·{",
                className,
                superClass,
                className.constructorReference()
            ) //START: registerClass

            FunctionRegistrationGenerator.registerFunctions(
                classWithMembers.functions,
                registerClassControlFlow,
                className
            )

            registerClassControlFlow.endControlFlow() //END: registerClass
        }
    }
}
