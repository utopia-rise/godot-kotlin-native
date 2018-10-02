@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ConeTwistJoint : Joint {
    constructor() : super("ConeTwistJoint")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Param(val id: Long) {
        PARAM_SWING_SPAN(0),
        PARAM_TWIST_SPAN(1),
        PARAM_BIAS(2),
        PARAM_SOFTNESS(3),
        PARAM_RELAXATION(4),
        PARAM_MAX(5),
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
        infix fun from(other: Joint): ConeTwistJoint = ConeTwistJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): ConeTwistJoint = ConeTwistJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ConeTwistJoint = ConeTwistJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ConeTwistJoint = ConeTwistJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ConeTwistJoint = fromVariant(ConeTwistJoint(""), other)


        // Constants
        const val PARAM_SWING_SPAN: Long = 0
        const val PARAM_TWIST_SPAN: Long = 1
        const val PARAM_BIAS: Long = 2
        const val PARAM_SOFTNESS: Long = 3
        const val PARAM_RELAXATION: Long = 4
        const val PARAM_MAX: Long = 5


    }


    // Properties
    open var bias: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 2, value)


    open var softness: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 3, value)


    open var relaxation: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 4, value)




    // Methods
    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConeTwistJoint", "set_param") }
    open fun setParam(param: Long, value: Double) {
        _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConeTwistJoint", "get_param") }
    open fun getParam(param: Long): Double {
        return _icall_Double_Long(getParamMethodBind, this.rawMemory, param)
    }


    open fun _set_swing_span(swingSpan: Double) {
    }


    open fun _get_swing_span(): Double {
        throw NotImplementedError("_get_swing_span is not implemented for ConeTwistJoint")
    }


    open fun _set_twist_span(twistSpan: Double) {
    }


    open fun _get_twist_span(): Double {
        throw NotImplementedError("_get_twist_span is not implemented for ConeTwistJoint")
    }


}
