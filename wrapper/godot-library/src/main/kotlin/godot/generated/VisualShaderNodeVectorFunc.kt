@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeVectorFunc : VisualShaderNode {
    constructor() : super("VisualShaderNodeVectorFunc")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Function(val id: Long) {
        FUNC_NORMALIZE(0),
        FUNC_SATURATE(1),
        FUNC_NEGATE(2),
        FUNC_RECIPROCAL(3),
        FUNC_RGB2HSV(4),
        FUNC_HSV2RGB(5),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: VisualShaderNode): VisualShaderNodeVectorFunc = VisualShaderNodeVectorFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeVectorFunc = VisualShaderNodeVectorFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeVectorFunc = VisualShaderNodeVectorFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeVectorFunc = VisualShaderNodeVectorFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeVectorFunc = fromVariant(VisualShaderNodeVectorFunc(""), other)


        // Constants
        const val FUNC_NORMALIZE: Long = 0
        const val FUNC_SATURATE: Long = 1
        const val FUNC_NEGATE: Long = 2
        const val FUNC_RECIPROCAL: Long = 3
        const val FUNC_RGB2HSV: Long = 4
        const val FUNC_HSV2RGB: Long = 5


    }


    // Properties
    open var function: Long
        get() = _icall_Long(getFunctionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFunctionMethodBind, this.rawMemory, value)




    // Methods
    private val setFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeVectorFunc", "set_function") }
    open fun setFunction(func: Long) {
        _icall_Unit_Long(setFunctionMethodBind, this.rawMemory, func)
    }


    private val getFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeVectorFunc", "get_function") }
    open fun getFunction(): VisualShaderNodeVectorFunc.Function {
        return VisualShaderNodeVectorFunc.Function.fromInt(_icall_Long(getFunctionMethodBind, this.rawMemory))
    }


}
