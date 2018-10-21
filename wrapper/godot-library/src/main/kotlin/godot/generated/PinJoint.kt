@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PinJoint : Joint {
    constructor() : super("PinJoint")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Param(val id: Long) {
        PARAM_BIAS(0),
        PARAM_DAMPING(1),
        PARAM_IMPULSE_CLAMP(2),
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
        infix fun from(other: Joint): PinJoint = PinJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): PinJoint = PinJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PinJoint = PinJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PinJoint = PinJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PinJoint = fromVariant(PinJoint(""), other)


        // Constants
        const val PARAM_BIAS: Long = 0
        const val PARAM_DAMPING: Long = 1
        const val PARAM_IMPULSE_CLAMP: Long = 2


    }


    // Properties
    open var params_bias: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 0, value)


    open var params_damping: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 1, value)


    open var params_impulseClamp: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 2, value)




    // Methods
    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PinJoint", "set_param") }
    open fun setParam(param: Long, value: Double) {
        _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PinJoint", "get_param") }
    open fun getParam(param: Long): Double {
        return _icall_Double_Long(getParamMethodBind, this.rawMemory, param)
    }


}
