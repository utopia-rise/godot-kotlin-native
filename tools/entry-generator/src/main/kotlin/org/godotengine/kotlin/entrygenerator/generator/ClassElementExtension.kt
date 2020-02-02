package org.godotengine.kotlin.entrygenerator.generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import de.jensklingenberg.mpapt.common.hasAnnotation
import de.jensklingenberg.mpapt.model.Element
import de.jensklingenberg.mpapt.model.ElementUtils
import org.jetbrains.kotlin.descriptors.CallableMemberDescriptor
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperclassesWithoutAny
import org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter

fun Element.ClassElement.generateConstructorBindings(entryFileSpecBuilder: FileSpec.Builder, index: Int): Array<FunSpec> {
    val returnType = ClassName(ElementUtils().getPackageOf(this), this.classDescriptor.name.asString())
    val constructorBindingFuncSpec = FunSpec
            .builder("constructorFunction${index}Constructor")
            .addModifiers(KModifier.PRIVATE)
            .returns(returnType)
            .addStatement("return·${ElementUtils().getPackageOf(this)}.${this.classDescriptor.name.asString()}()")
            .build()

    val constructorBindingFunctionReferenceProperty = PropertySpec
            .builder("constructorFunctionReferenceProperty${index}", returnType, KModifier.PRIVATE)
            .initializer("::${constructorBindingFuncSpec.name}")
            .build()

    val constructorBridgeFuncSpec = FunSpec
            .builder("constructorBridge${index}")
            .addModifiers(KModifier.PRIVATE)
            .returns(getBridgeReturnType(isConstructor = true))
            .addStatement("return·%M·{·mem·->·%M(mem,·${constructorBindingFunctionReferenceProperty.name})·}", MemberName("kotlinx.cinterop", "staticCFunction"), MemberName("godot.registration", "constructFromRawMem"))
            .build()

    val destructorBridgeFuncSpec = FunSpec
            .builder("destructorBridge${index}")
            .addModifiers(KModifier.PRIVATE)
            .returns(getBridgeReturnType(isConstructor = false))
            .addStatement("return·%M·{·mem·->·%M<${returnType.canonicalName}>(mem)·}", MemberName("kotlinx.cinterop", "staticCFunction"), MemberName("godot.registration", "deconstructFromRawMem"))
            .build()

    entryFileSpecBuilder
            .addFunction(constructorBindingFuncSpec)
            .addProperty(constructorBindingFunctionReferenceProperty)
            .addFunction(constructorBridgeFuncSpec)
            .addFunction(destructorBridgeFuncSpec)

    return arrayOf(constructorBridgeFuncSpec, destructorBridgeFuncSpec)
}

fun Element.ClassElement.generateInternalFunctionBindings(entryFileSpecBuilder: FileSpec.Builder, index: Int): Array<Pair<Name, FunSpec>> {
    return classDescriptor
            .getAllSuperclassesWithoutAny()
            .map { it.defaultType.memberScope }
            .flatMap { it.getContributedDescriptors(DescriptorKindFilter.FUNCTIONS) }
            .filterIsInstance<CallableMemberDescriptor>() //should be callable anyway as we applied the DescriptorKindFilter.FUNCTIONS, but it's safer and like that we don't need to cast anything
            .filter { it.annotations.hasAnnotation("godot.registration.RegisterInternal") } //TODO: don't hardcode the fully qualified annotation name
            .distinctBy { it.name } //to remove duplicate functions as each godot subtype inherits all functions from it's supertype
            .mapIndexed { superClassFunctionIndex, callableMemberDescriptor ->
                Pair(
                        callableMemberDescriptor.name,
                        callableMemberDescriptor.generateFunctionBinding(entryFileSpecBuilder, superClassFunctionIndex, "internalFunctionOf${index}Registration", this.classDescriptor.fqNameSafe.asString())
                )
            }
            .toTypedArray()
}

private fun getBridgeReturnType(isConstructor: Boolean): ParameterizedTypeName {
    return ClassName("kotlinx.cinterop", "CPointer")
            .parameterizedBy(
                    ClassName("kotlinx.cinterop", "CFunction")
                            .parameterizedBy(
                                    LambdaTypeName.get(
                                            parameters = *arrayOf(ClassName("kotlinx.cinterop", "COpaquePointer").copy(nullable = true)),
                                            returnType = if (isConstructor) ClassName("kotlinx.cinterop", "COpaquePointer").copy(nullable = true) else Unit::class.asTypeName()
                                    )
                            )
            )
}