@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PathFollow : Spatial {
    constructor() : super("PathFollow")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class RotationMode(val id: Long) {
        ROTATION_NONE(0),
        ROTATION_Y(1),
        ROTATION_XY(2),
        ROTATION_XYZ(3),
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
        infix fun from(other: Spatial): PathFollow = PathFollow("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PathFollow = PathFollow("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PathFollow = PathFollow("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PathFollow = fromVariant(PathFollow(""), other)


        // Constants
        const val ROTATION_NONE: Long = 0
        const val ROTATION_Y: Long = 1
        const val ROTATION_XY: Long = 2
        const val ROTATION_XYZ: Long = 3


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


    open var rotationMode: Long
        get() = _icall_Long(getRotationModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRotationModeMethodBind, this.rawMemory, value)


    open var cubicInterp: Boolean
        get() = _icall_Boolean(getCubicInterpolationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCubicInterpolationMethodBind, this.rawMemory, value)


    open var loop: Boolean
        get() = _icall_Boolean(hasLoopMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, value)




    // Methods
    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "set_offset") }
    open fun setOffset(offset: Double) {
        _icall_Unit_Double(setOffsetMethodBind, this.rawMemory, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "get_offset") }
    open fun getOffset(): Double {
        return _icall_Double(getOffsetMethodBind, this.rawMemory)
    }


    private val setHOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "set_h_offset") }
    open fun setHOffset(hOffset: Double) {
        _icall_Unit_Double(setHOffsetMethodBind, this.rawMemory, hOffset)
    }


    private val getHOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "get_h_offset") }
    open fun getHOffset(): Double {
        return _icall_Double(getHOffsetMethodBind, this.rawMemory)
    }


    private val setVOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "set_v_offset") }
    open fun setVOffset(vOffset: Double) {
        _icall_Unit_Double(setVOffsetMethodBind, this.rawMemory, vOffset)
    }


    private val getVOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "get_v_offset") }
    open fun getVOffset(): Double {
        return _icall_Double(getVOffsetMethodBind, this.rawMemory)
    }


    private val setUnitOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "set_unit_offset") }
    open fun setUnitOffset(unitOffset: Double) {
        _icall_Unit_Double(setUnitOffsetMethodBind, this.rawMemory, unitOffset)
    }


    private val getUnitOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "get_unit_offset") }
    open fun getUnitOffset(): Double {
        return _icall_Double(getUnitOffsetMethodBind, this.rawMemory)
    }


    private val setRotationModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "set_rotation_mode") }
    open fun setRotationMode(rotationMode: Long) {
        _icall_Unit_Long(setRotationModeMethodBind, this.rawMemory, rotationMode)
    }


    private val getRotationModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "get_rotation_mode") }
    open fun getRotationMode(): PathFollow.RotationMode {
        return PathFollow.RotationMode.fromInt(_icall_Long(getRotationModeMethodBind, this.rawMemory))
    }


    private val setCubicInterpolationMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "set_cubic_interpolation") }
    open fun setCubicInterpolation(enable: Boolean) {
        _icall_Unit_Boolean(setCubicInterpolationMethodBind, this.rawMemory, enable)
    }


    private val getCubicInterpolationMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "get_cubic_interpolation") }
    open fun getCubicInterpolation(): Boolean {
        return _icall_Boolean(getCubicInterpolationMethodBind, this.rawMemory)
    }


    private val setLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "set_loop") }
    open fun setLoop(loop: Boolean) {
        _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, loop)
    }


    private val hasLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("PathFollow", "has_loop") }
    open fun hasLoop(): Boolean {
        return _icall_Boolean(hasLoopMethodBind, this.rawMemory)
    }


}
