package org.godotengine.kotlin.entrygenerator.generator

import com.squareup.kotlinpoet.*
import de.jensklingenberg.mpapt.common.findAnnotation
import de.jensklingenberg.mpapt.common.hasAnnotation
import de.jensklingenberg.mpapt.model.Element
import org.godotengine.kotlin.annotation.Signal
import org.godotengine.kotlin.entrygenerator.model.getVariantType
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.types.asSimpleType

class GDNativeFunctionBindingGenerator {
    private val nativeScriptInitFunctionBuilder: FunSpec.Builder = createNativeScriptInitFunctionBuilder()

    fun registerElement(element: Element, visibleInEditor: Boolean = true, vararg bridgeFunctions: FunSpec) {
        when (element) {
            is Element.ClassElement -> nativeScriptInitFunctionBuilder.addStatement("%M(\"${getFullClassName(element)}\",·\"${getBaseClassOfClass(element)}\"${convertBridgeFunctionsToString(bridgeFunctions)})", MemberName("godot.registration", "registerClass"))
            is Element.PropertyElement -> nativeScriptInitFunctionBuilder.addStatement("%M(\"${getFullClassName(element)}\",·\"${element.propertyDescriptor.name}\", $visibleInEditor${convertBridgeFunctionsToString(bridgeFunctions)})", MemberName("godot.registration", "registerProperty"))
            is Element.FunctionElement -> {
                if (element.func.hasAnnotation(Signal::class.java.name)) {
                    nativeScriptInitFunctionBuilder.addStatement("%M(\"${getFullClassName(element)}\",·${element.simpleName}${getSignalArgumentsAsString(element)}${getSignalDefaultArgumentsAsString(element)})", MemberName("godot.registration", "registerSignal"))
                } else {
                    nativeScriptInitFunctionBuilder.addStatement("%M(\"${getFullClassName(element)}\",·\"${element.simpleName}\"${convertBridgeFunctionsToString(bridgeFunctions)})", MemberName("godot.registration", "registerMethod"))
                }
            }
            else -> throw IllegalArgumentException("Element of kind ${element.elementKind} is not registrable")
        }
    }

    fun registerInternalFunction(classElement: Element.ClassElement, pairOfNameAndFunSpec: Pair<Name, FunSpec>) {
        nativeScriptInitFunctionBuilder.addStatement("%M(\"${getFullClassName(classElement)}\",·\"${pairOfNameAndFunSpec.first.asString()}\",·${pairOfNameAndFunSpec.second.name}())", MemberName("godot.registration", "registerMethod"))
    }

    fun generateGDNativeBindingFunctions(entryFileSpecBuilder: FileSpec.Builder) {
        entryFileSpecBuilder
                .addFunction(generateGDNativeInitFunction())
                .addFunction(generateGDNativeTerminateFunction())
                .addFunction(nativeScriptInitFunctionBuilder.build())
    }


    private fun getSignalArgumentsAsString(element: Element.FunctionElement): String {
        val arguments = element
                .func
                .valueParameters
                .map {
                    val name = it.name.asString()
                    val type = it.type.toString().replace("?", "").getVariantType()
                    Pair(name, type)
                }

        val signalArgumentsArrayString = buildString {
            append(",·arrayOf(")
            arguments.forEachIndexed { index, pair ->
                append("${pair.first}·to·${pair.second}")
                if (index != arguments.size - 1) {
                    append(",·")
                }
            }
            append(")")
        }

        return if (arguments.isNotEmpty()) {
            signalArgumentsArrayString
        } else {
            ""
        }
    }

    private fun getSignalDefaultArgumentsAsString(element: Element.FunctionElement): String {
        val defaultArguments = element
                .func
                .findAnnotation(Signal::class.java.name)
                ?.allValueArguments
                ?.values
                ?.map { it.value as String }

        if (defaultArguments?.size != element.func.valueParameters.size) {
            throw IllegalArgumentException("Amount of default arguments provided does not match the amount of arguments of the signal")
        }

        val signalArgumentsArrayString = buildString {
            append(",·arrayOf(")
            defaultArguments.forEachIndexed { index, defaultArgument ->
                append("Variant($defaultArgument)")
                if (index != defaultArguments.size - 1) {
                    append(",·")
                }
            }
            append(")")
        }

        return if (defaultArguments.isNotEmpty()) {
            signalArgumentsArrayString
        } else {
            ""
        }
    }

    private fun convertBridgeFunctionsToString(bridgeFunctions: Array<out FunSpec>): String {
        return buildString {
            if (bridgeFunctions.isNotEmpty()) {
                append(",·")
            }
            bridgeFunctions.forEachIndexed { index, funSpec ->
                append("${funSpec.name}()")
                if (index != bridgeFunctions.size - 1) {
                    append(",·")
                }
            }
        }
    }

    private fun getBaseClassOfClass(element: Element.ClassElement): String {
        return element.classDescriptor.typeConstructor.supertypes.first().asSimpleType().toString()
    }

    private fun getFullClassName(element: Element.ClassElement): String {
        return element.classDescriptor.fqNameSafe.asString()
    }

    private fun getFullClassName(element: Element.FunctionElement): String {
        return element.func.containingDeclaration.fqNameSafe.asString()
    }

    private fun getFullClassName(element: Element.PropertyElement): String {
        return element.propertyDescriptor.containingDeclaration.fqNameSafe.asString()
    }

    private fun createNativeScriptInitFunctionBuilder(): FunSpec.Builder {
        return FunSpec
                .builder("NativeScriptInit")
                .addAnnotation(
                        AnnotationSpec
                                .builder(ClassName("kotlin.native", "CName"))
                                .addMember("%S", "godot_nativescript_init")
                                .build()
                )
                .addParameter("handle", ClassName("kotlinx.cinterop", "COpaquePointer"))
                .addStatement("godot_wrapper_nativescript_init(handle)")
    }

    private fun generateGDNativeInitFunction(): FunSpec {
        return FunSpec
                .builder("GDNativeInit")
                .addAnnotation(
                        AnnotationSpec
                                .builder(ClassName("kotlin.native", "CName"))
                                .addMember("%S", "godot_gdnative_init")
                                .build()
                )
                .addParameter("options", ClassName("godot.gdnative", "godot_gdnative_init_options"))
                .addStatement("godot_wrapper_gdnative_init(options.ptr)")
                .build()
    }

    private fun generateGDNativeTerminateFunction(): FunSpec {
        return FunSpec
                .builder("GDNativeTerminate")
                .addAnnotation(
                        AnnotationSpec
                                .builder(ClassName("kotlin.native", "CName"))
                                .addMember("%S", "godot_gdnative_terminate")
                                .build()
                )
                .addParameter("options", ClassName("godot.gdnative", "godot_gdnative_terminate_options"))
                .addStatement("godot_wrapper_gdnative_terminate(options.ptr)")
                .build()
    }
}