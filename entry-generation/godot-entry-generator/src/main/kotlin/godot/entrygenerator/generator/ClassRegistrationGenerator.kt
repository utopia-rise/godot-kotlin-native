package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.extension.getSuperTypeNameAsString
import godot.entrygenerator.model.ClassWithMembers
import godot.entrygenerator.model.REGISTER_CLASS_ANNOTATION
import godot.entrygenerator.model.REGISTER_CLASS_ANNOTATION_TOOL_ARGUMENT
import org.jetbrains.kotlin.descriptors.ClassDescriptor
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
                "registerClass(%S,·%S,·%L,·${isTool(classWithMembers.classDescriptor)})·{",
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

    private fun isTool(classDescriptor: ClassDescriptor): Boolean {
        return classDescriptor
            .annotations
            .getAnnotationValue(REGISTER_CLASS_ANNOTATION, REGISTER_CLASS_ANNOTATION_TOOL_ARGUMENT) {
                IllegalStateException("${classDescriptor.name} has no RegisterClass annotation even though the annotation processor found one.")
            }
    }
}
