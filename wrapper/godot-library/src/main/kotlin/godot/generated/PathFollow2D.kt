@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PathFollow2D : Node2D {
    constructor() : super("PathFollow2D")
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
        infix fun from(other: Node2D): PathFollow2D = PathFollow2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): PathFollow2D = PathFollow2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PathFollow2D = PathFollow2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PathFollow2D = PathFollow2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PathFollow2D = fromVariant(PathFollow2D(""), other)


        // Constants


    }


    // Properties
    open var offset: Double
        get() = _icall_Double(getOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setOffsetMethodBind, this.rawMemory, value)


    open var unitOffset: Double
        get() = _icall_Double(getUnitOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setUnitOffsetMethodBind, this.rawMemory, value)


    open var hOffset: Double
        get() = _icall_Double(getHOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setHOffsetMethodBind, this.rawMemory, value)


    open var vOffset: Double
        get() = _icall_Double(getVOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setVOffsetMethodBind, this.rawMemory, value)


    open var rotate: Boolean
        get() = _icall_Boolean(isRotatingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRotateMethodBind, this.rawMemory, value)


    open var cubicInterp: Boolean
        get() = _icall_Boolean(getCubicInterpolationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCubicInterpolationMethodBind, this.rawMemory, value)


    open var loop: Boolean
        get() = _icall_Boolean(hasLoopMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, value)


    open var lookahead: Double
        get() = _icall_Double(getLookaheadMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setLookaheadMethodBind, this.rawMemory, value)




    // Methods
    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "set_offset") }
    open fun setOffset(offset: Double) {
        _icall_Unit_Double(setOffsetMethodBind, this.rawMemory, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "get_offset") }
    open fun getOffset(): Double {
        return _icall_Double(getOffsetMethodBind, this.rawMemory)
    }


    private val setHOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "set_h_offset") }
    open fun setHOffset(hOffset: Double) {
        _icall_Unit_Double(setHOffsetMethodBind, this.rawMemory, hOffset)
    }


    private val getHOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "get_h_offset") }
    open fun getHOffset(): Double {
        return _icall_Double(getHOffsetMethodBind, this.rawMemory)
    }


    private val setVOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "set_v_offset") }
    open fun setVOffset(vOffset: Double) {
        _icall_Unit_Double(setVOffsetMethodBind, this.rawMemory, vOffset)
    }


    private val getVOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "get_v_offset") }
    open fun getVOffset(): Double {
        return _icall_Double(getVOffsetMethodBind, this.rawMemory)
    }


    private val setUnitOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "set_unit_offset") }
    open fun setUnitOffset(unitOffset: Double) {
        _icall_Unit_Double(setUnitOffsetMethodBind, this.rawMemory, unitOffset)
    }


    private val getUnitOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "get_unit_offset") }
    open fun getUnitOffset(): Double {
        return _icall_Double(getUnitOffsetMethodBind, this.rawMemory)
    }


    private val setRotateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "set_rotate") }
    open fun setRotate(enable: Boolean) {
        _icall_Unit_Boolean(setRotateMethodBind, this.rawMemory, enable)
    }


    private val isRotatingMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "is_rotating") }
    open fun isRotating(): Boolean {
        return _icall_Boolean(isRotatingMethodBind, this.rawMemory)
    }


    private val setCubicInterpolationMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "set_cubic_interpolation") }
    open fun setCubicInterpolation(enable: Boolean) {
        _icall_Unit_Boolean(setCubicInterpolationMethodBind, this.rawMemory, enable)
    }


    private val getCubicInterpolationMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "get_cubic_interpolation") }
    open fun getCubicInterpolation(): Boolean {
        return _icall_Boolean(getCubicInterpolationMethodBind, this.rawMemory)
    }


    private val setLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "set_loop") }
    open fun setLoop(loop: Boolean) {
        _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, loop)
    }


    private val hasLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "has_loop") }
    open fun hasLoop(): Boolean {
        return _icall_Boolean(hasLoopMethodBind, this.rawMemory)
    }


    private val setLookaheadMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "set_lookahead") }
    open fun setLookahead(lookahead: Double) {
        _icall_Unit_Double(setLookaheadMethodBind, this.rawMemory, lookahead)
    }


    private val getLookaheadMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow2D", "get_lookahead") }
    open fun getLookahead(): Double {
        return _icall_Double(getLookaheadMethodBind, this.rawMemory)
    }


}
