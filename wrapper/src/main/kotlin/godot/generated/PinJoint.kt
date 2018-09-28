@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PinJoint : Joint {
    constructor() : super("PinJoint")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Param(val id: Int) {
        PARAM_BIAS(0),
        PARAM_DAMPING(1),
        PARAM_IMPULSE_CLAMP(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Joint): PinJoint = PinJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): PinJoint = PinJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PinJoint = PinJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PinJoint = PinJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PinJoint = fromVariant(PinJoint(""), other)


        // Constants
        const val PARAM_BIAS: Int = 0
        const val PARAM_DAMPING: Int = 1
        const val PARAM_IMPULSE_CLAMP: Int = 2


    }


    // Properties
    open var params_bias: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 0, value)


    open var params_damping: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 1, value)


    open var params_impulseClamp: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 2, value)




    // Methods
    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PinJoint", "set_param") }
    open fun setParam(param: Int, value: Float) {
        _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PinJoint", "get_param") }
    open fun getParam(param: Int): Float {
        return _icall_Float_Int(getParamMethodBind, this.rawMemory, param)
    }


}
