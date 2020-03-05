package org.godotengine.kotlin.entrygenerator.generator

import com.squareup.kotlinpoet.*
import de.jensklingenberg.mpapt.common.findAnnotation
import de.jensklingenberg.mpapt.common.hasAnnotation
import de.jensklingenberg.mpapt.model.Element
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty
import org.godotengine.kotlin.annotation.RegisterSignal
import org.godotengine.kotlin.annotation.rpcAnnotations
import org.godotengine.kotlin.entrygenerator.mapper.RpcModeAnnotationMapper
import org.godotengine.kotlin.entrygenerator.utils.getVariantType
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.types.asSimpleType

/**
 * This class is responsible for registering classes, properties, functions and signals<br>
 * It also assembles additional parameters the engine might need (ex: propertyType hint, rpcMode, etc.)
 */
class GDNativeFunctionBindingGenerator {
    private val nativeScriptInitFunctionBuilder: FunSpec.Builder = createNativeScriptInitFunctionBuilder()

    /**
     * register an element (class, property, function, signal) along with the corresponding bridge functions
     */
    fun registerElement(element: Element, visibleInEditor: Boolean = true, vararg bridgeFunctions: FunSpec) {
        when (element) {
            is Element.ClassElement -> nativeScriptInitFunctionBuilder.addStatement("%M(\"${getFullClassName(element)}\",·\"${getBaseClassOfClass(element)}\"${convertBridgeFunctionsToString(bridgeFunctions)})", MemberName("godot.registration", "registerClass"))
            is Element.PropertyElement -> nativeScriptInitFunctionBuilder.addStatement("%M(\"${getFullClassName(element)}\",·\"${element.propertyDescriptor.name}\",·$visibleInEditor${convertBridgeFunctionsToString(bridgeFunctions)}${getRpcMode(element)}${getPropertyHints(element)})", MemberName("godot.registration", "registerProperty"))
            is Element.FunctionElement -> {
                if (element.func.hasAnnotation(RegisterSignal::class.java.name)) {
                    nativeScriptInitFunctionBuilder.addStatement("%M(\"${getFullClassName(element, true)}\",·\"${element.simpleName}\"${getSignalArgumentsAsString(element)})", MemberName("godot.registration", "registerSignal"))
                } else {
                    nativeScriptInitFunctionBuilder.addStatement("%M(\"${getFullClassName(element)}\",·\"${element.simpleName}\"${convertBridgeFunctionsToString(bridgeFunctions)}${getRpcMode(element)})", MemberName("godot.registration", "registerMethod"))
                }
            }
            else -> throw IllegalArgumentException("Element of kind ${element.elementKind} is not registrable")
        }
    }

    /**
     * assembles a propertyTypeHint along with a propertyHintString if needed
     */
    private fun getPropertyHints(element: Element.PropertyElement): String {
        val allValueArguments = element
                .propertyDescriptor
                .annotations
                .findAnnotation(RegisterProperty::class.java.asClassName().canonicalName)!!
                .allValueArguments

        @Suppress("UNCHECKED_CAST") //see comment at cast
        val typeHintAsString = if (allValueArguments.containsKey(Name.identifier("propertyHint"))) {
            val typeHintAsEnumPair = ((allValueArguments.getValue(Name.identifier("propertyHint"))).value as Pair<ClassId, Name>) //represents an enum. If it cannot be cast, something is wrong and it should fail hard
            "${typeHintAsEnumPair.first.asString().replace("/", ".")}.${typeHintAsEnumPair.second}"
        } else {
            null
        }
        val hintString = if (allValueArguments.containsKey(Name.identifier("hintString"))) {
            allValueArguments.getValue(Name.identifier("hintString")).value as String
        } else {
            null
        }

        return buildString {
            if (typeHintAsString != null && typeHintAsString != "godot.registration.PropertyHint.None") { //TODO: replace hardcoded cannonical name with class reference once expect/actual implementation for jvm is done
                append(",·propertyHint·=·$typeHintAsString")
            }
            if (hintString != null && hintString.isNotEmpty()) {
                append(",·hintString·=·\"$hintString\"")
            }
        }
    }

    /**
     * get's the rpcMode for a function
     */
    private fun getRpcMode(element: Element.FunctionElement): String {
        val annotations = element.func.annotations.map { it.fqName!!.asString() }
        val registerAnnotation = element.func.annotations.findAnnotation(RegisterFunction::class.java.asClassName().canonicalName)
        return buildRpcModeString(element, annotations, registerAnnotation)
    }

    /**
     * get's the rpcMode for a property
     */
    private fun getRpcMode(element: Element.PropertyElement): String {
        val annotations = element.propertyDescriptor.annotations.map { it.fqName!!.asString() }
        val registerAnnotation = element.propertyDescriptor.annotations.findAnnotation(RegisterProperty::class.java.asClassName().canonicalName)
        return buildRpcModeString(element, annotations, registerAnnotation)
    }

    /**
     * assembles the rpcMode string by rpcModeAnnotation or by RegisterAnnotation parameter
     */
    private fun buildRpcModeString(element: Element, annotations: List<String>, registerAnnotation: AnnotationDescriptor?): String {
        var rpcAnnotation = rpcAnnotations()
                .map { it.asTypeName().canonicalName }
                .firstOrNull { annotations.contains(it) }

        if (registerAnnotation == null && rpcAnnotation != null) {
            throw IllegalArgumentException("$element is annotated with an rpc mode but is not registered with a Register annotation!\nAll elements with an rpc mode have to be registered as well")
        }

        if (rpcAnnotation == null) {
            val rpcModeAnnotation = registerAnnotation!!
                    .allValueArguments
                    .filterKeys { it.asString() == "rpcMode" }
                    .ifEmpty { null }
                    ?.getValue(Name.identifier("rpcMode"))
                    ?.value

            if (rpcModeAnnotation != null) {
                @Suppress("UNCHECKED_CAST")
                val enumMapping = (rpcModeAnnotation as Pair<ClassId, Name>) //represents an enum. If it cannot be cast, something is wrong and it should fail hard
                rpcAnnotation = "${enumMapping.first.asString().replace("/", ".")}.${enumMapping.second}"
            }
        }

        return buildString {
            if (rpcAnnotation != null) {
                append(",·rpcMode·=·${RpcModeAnnotationMapper.mapRpcModeAnnotationToClassName(rpcAnnotation)}")
            }
        }
    }

    /**
     * registers an internal function from godot-library. Ex: the yield listener method in any Godot Object
     */
    fun registerInternalFunction(classElement: Element.ClassElement, pairOfNameAndFunSpec: Pair<Name, FunSpec>) {
        nativeScriptInitFunctionBuilder.addStatement("%M(\"${getFullClassName(classElement)}\",·\"${pairOfNameAndFunSpec.first.asString()}\",·${pairOfNameAndFunSpec.second.name}())", MemberName("godot.registration", "registerMethod"))
    }

    /**
     * generates the three functions the engine needs to work with the lib. (godot_gdnative_init, godot_gdnative_terminate and godot_nativescript_init)
     */
    fun generateGDNativeBindingFunctions(entryFileSpecBuilder: FileSpec.Builder) {
        entryFileSpecBuilder
                .addFunction(generateGDNativeInitFunction())
                .addFunction(generateGDNativeTerminateFunction())
                .addFunction(nativeScriptInitFunctionBuilder.build())
    }

    /**
     * assembles the arguments needed for registering a signal as string)
     */
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
                append("\"${pair.first}\"·to·${pair.second}")
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

    //left here for reference once we may be able to implement this again
//    /**
//     * assembles the default arguments for a signal if needed
//     */
//    private fun getSignalDefaultArgumentsAsString(element: Element.FunctionElement): String {
//        val defaultValues = element
//                .func
//                .valueParameters
//                .filter { it.hasDefaultValue() }
//                .map {
//                    Pair(
//                            it,
//                            (it.source as KotlinSourceElement).psi.children.last().text
//                    )
//                }
//
//        if (defaultValues.size != element.func.valueParameters.size) {
//            throw IllegalArgumentException("You declared a default value for ${defaultValues.size} arguments but the signal has ${element.func.valueParameters.size} arguments. You either have to define default values for all arguments or for none!")
//        }
//
////        val map = intArrayOf(1, 2).map { Variant(it) }.toTypedArray()
////        gameOver("", *(intArrayOf(1, 2).map { Variant(it) }.toTypedArray()))
//
//
//
//        val signalArgumentsArrayString = buildString {
//            append(",·arrayOf(")
//            defaultValues.forEachIndexed { index, defaultValue ->
//                if (defaultValue.first.isVararg) {
//                    append("*(${defaultValue.second.replace(" ", "·")}.map { Variant(it) }.toTypedArray())")
////                    append("godot.core.Variant(godot.core.GDArray(${defaultValues.size})·{·Variant(${defaultValue.second.replace(" ", "·")}[it])·})")
//                } else {
//                    append("godot.core.Variant(${defaultValue.second.replace(" ", "·")})")
//                }
//                if (index != defaultValues.size - 1) {
//                    append(",·")
//                }
//            }
//            append(")")
//        }
//
//        return if (defaultValues.isNotEmpty()) {
//            signalArgumentsArrayString
//        } else {
//            ""
//        }
//    }

    /**
     * convert bridge functions to string to be able to reference it when registering constructors, functions or getter/setter functions for properties
     */
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

    private fun getFullClassName(element: Element.FunctionElement, isSignal: Boolean = false): String {
        return if (isSignal) {
            element.func.containingDeclaration.containingDeclaration!!.fqNameSafe.asString()
        } else {
            element.func.containingDeclaration.fqNameSafe.asString()
        }
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
                .addStatement("%M(handle)", MemberName("godot.gdnative", "godot_wrapper_nativescript_init"))
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
                .addStatement("%M(options.ptr)", MemberName("godot.gdnative", "godot_wrapper_gdnative_init"))
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
                .addStatement("%M(options.ptr)", MemberName("godot.gdnative", "godot_wrapper_gdnative_terminate"))
                .build()
    }
}