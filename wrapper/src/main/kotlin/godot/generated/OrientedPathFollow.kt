@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class OrientedPathFollow : Spatial {
    constructor() : super("OrientedPathFollow")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Spatial): OrientedPathFollow = OrientedPathFollow("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): OrientedPathFollow = OrientedPathFollow("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): OrientedPathFollow = OrientedPathFollow("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): OrientedPathFollow = fromVariant(OrientedPathFollow(""), other)


        // Constants


    }


    // Properties
    open var offset: Float
        get() = _icall_Float(getOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setOffsetMethodBind, this.rawMemory, value)


    open var unitOffset: Float
        get() = _icall_Float(getUnitOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setUnitOffsetMethodBind, this.rawMemory, value)


    open var hOffset: Float
        get() = _icall_Float(getHOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setHOffsetMethodBind, this.rawMemory, value)


    open var vOffset: Float
        get() = _icall_Float(getVOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setVOffsetMethodBind, this.rawMemory, value)


    open var cubicInterp: Boolean
        get() = _icall_Boolean(getCubicInterpolationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCubicInterpolationMethodBind, this.rawMemory, value)


    open var loop: Boolean
        get() = _icall_Boolean(hasLoopMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, value)




    // Methods
    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "set_offset") }
    open fun setOffset(offset: Float) {
        _icall_Unit_Float(setOffsetMethodBind, this.rawMemory, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "get_offset") }
    open fun getOffset(): Float {
        return _icall_Float(getOffsetMethodBind, this.rawMemory)
    }


    private val setHOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "set_h_offset") }
    open fun setHOffset(hOffset: Float) {
        _icall_Unit_Float(setHOffsetMethodBind, this.rawMemory, hOffset)
    }


    private val getHOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "get_h_offset") }
    open fun getHOffset(): Float {
        return _icall_Float(getHOffsetMethodBind, this.rawMemory)
    }


    private val setVOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "set_v_offset") }
    open fun setVOffset(vOffset: Float) {
        _icall_Unit_Float(setVOffsetMethodBind, this.rawMemory, vOffset)
    }


    private val getVOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "get_v_offset") }
    open fun getVOffset(): Float {
        return _icall_Float(getVOffsetMethodBind, this.rawMemory)
    }


    private val setUnitOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "set_unit_offset") }
    open fun setUnitOffset(unitOffset: Float) {
        _icall_Unit_Float(setUnitOffsetMethodBind, this.rawMemory, unitOffset)
    }


    private val getUnitOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "get_unit_offset") }
    open fun getUnitOffset(): Float {
        return _icall_Float(getUnitOffsetMethodBind, this.rawMemory)
    }


    private val setCubicInterpolationMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "set_cubic_interpolation") }
    open fun setCubicInterpolation(enable: Boolean) {
        _icall_Unit_Boolean(setCubicInterpolationMethodBind, this.rawMemory, enable)
    }


    private val getCubicInterpolationMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "get_cubic_interpolation") }
    open fun getCubicInterpolation(): Boolean {
        return _icall_Boolean(getCubicInterpolationMethodBind, this.rawMemory)
    }


    private val setLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "set_loop") }
    open fun setLoop(loop: Boolean) {
        _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, loop)
    }


    private val hasLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("OrientedPathFollow", "has_loop") }
    open fun hasLoop(): Boolean {
        return _icall_Boolean(hasLoopMethodBind, this.rawMemory)
    }


}
