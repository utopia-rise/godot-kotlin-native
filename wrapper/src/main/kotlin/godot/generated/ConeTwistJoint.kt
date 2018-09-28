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

    enum class Param(val id: Int) {
        PARAM_SWING_SPAN(0),
        PARAM_TWIST_SPAN(1),
        PARAM_BIAS(2),
        PARAM_SOFTNESS(3),
        PARAM_RELAXATION(4),
        PARAM_MAX(5),
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
        infix fun from(other: Joint): ConeTwistJoint = ConeTwistJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): ConeTwistJoint = ConeTwistJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ConeTwistJoint = ConeTwistJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ConeTwistJoint = ConeTwistJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ConeTwistJoint = fromVariant(ConeTwistJoint(""), other)


        // Constants
        const val PARAM_SWING_SPAN: Int = 0
        const val PARAM_TWIST_SPAN: Int = 1
        const val PARAM_BIAS: Int = 2
        const val PARAM_SOFTNESS: Int = 3
        const val PARAM_RELAXATION: Int = 4
        const val PARAM_MAX: Int = 5


    }


    // Properties
    open var bias: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 2, value)


    open var softness: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 3, value)


    open var relaxation: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 4, value)




    // Methods
    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConeTwistJoint", "set_param") }
    open fun setParam(param: Int, value: Float) {
        _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConeTwistJoint", "get_param") }
    open fun getParam(param: Int): Float {
        return _icall_Float_Int(getParamMethodBind, this.rawMemory, param)
    }


    open fun _set_swing_span(swingSpan: Float) {
    }


    open fun _get_swing_span(): Float {
        throw NotImplementedError("_get_swing_span is not implemented for ConeTwistJoint")
    }


    open fun _set_twist_span(twistSpan: Float) {
    }


    open fun _get_twist_span(): Float {
        throw NotImplementedError("_get_twist_span is not implemented for ConeTwistJoint")
    }


}
