@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Curve : Resource {
    constructor() : super("Curve")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TangentMode(val id: Long) {
        TANGENT_FREE(0),
        TANGENT_LINEAR(1),
        TANGENT_MODE_COUNT(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val RANGE_CHANGED: String = "range_changed"
        }
    }


    companion object {
        infix fun from(other: Resource): Curve = Curve("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Curve = Curve("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Curve = Curve("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Curve = fromVariant(Curve(""), other)


        // Constants
        const val TANGENT_FREE: Long = 0
        const val TANGENT_LINEAR: Long = 1
        const val TANGENT_MODE_COUNT: Long = 2


    }


    // Properties
    open var minValue: Double
        get() = _icall_Double(getMinValueMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMinValueMethodBind, this.rawMemory, value)


    open var maxValue: Double
        get() = _icall_Double(getMaxValueMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMaxValueMethodBind, this.rawMemory, value)


    open var bakeResolution: Long
        get() = _icall_Long(getBakeResolutionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBakeResolutionMethodBind, this.rawMemory, value)




    // Methods
    private val addPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "add_point") }
    open fun addPoint(position: Vector2, leftTangent: Double = 0.0, rightTangent: Double = 0.0, leftMode: Long = 0, rightMode: Long = 0): Long {
        return _icall_Long_Vector2_Double_Double_Long_Long(addPointMethodBind, this.rawMemory, position, leftTangent, rightTangent, leftMode, rightMode)
    }


    private val removePointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "remove_point") }
    open fun removePoint(index: Long) {
        _icall_Unit_Long(removePointMethodBind, this.rawMemory, index)
    }


    private val clearPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "clear_points") }
    open fun clearPoints() {
        _icall_Unit(clearPointsMethodBind, this.rawMemory)
    }


    private val getPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_point_position") }
    open fun getPointPosition(index: Long): Vector2 {
        return _icall_Vector2_Long(getPointPositionMethodBind, this.rawMemory, index)
    }


    private val setPointValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_value") }
    open fun setPointValue(index: Long, y: Double) {
        _icall_Unit_Long_Double(setPointValueMethodBind, this.rawMemory, index, y)
    }


    private val setPointOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_offset") }
    open fun setPointOffset(index: Long, offset: Double): Long {
        return _icall_Long_Long_Double(setPointOffsetMethodBind, this.rawMemory, index, offset)
    }


    private val interpolateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "interpolate") }
    open fun interpolate(offset: Double): Double {
        return _icall_Double_Double(interpolateMethodBind, this.rawMemory, offset)
    }


    private val interpolateBakedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "interpolate_baked") }
    open fun interpolateBaked(offset: Double): Double {
        return _icall_Double_Double(interpolateBakedMethodBind, this.rawMemory, offset)
    }


    private val getPointLeftTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_point_left_tangent") }
    open fun getPointLeftTangent(index: Long): Double {
        return _icall_Double_Long(getPointLeftTangentMethodBind, this.rawMemory, index)
    }


    private val getPointRightTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_point_right_tangent") }
    open fun getPointRightTangent(index: Long): Double {
        return _icall_Double_Long(getPointRightTangentMethodBind, this.rawMemory, index)
    }


    private val getPointLeftModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_point_left_mode") }
    open fun getPointLeftMode(index: Long): Curve.TangentMode {
        return Curve.TangentMode.fromInt(_icall_Long_Long(getPointLeftModeMethodBind, this.rawMemory, index))
    }


    private val getPointRightModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_point_right_mode") }
    open fun getPointRightMode(index: Long): Curve.TangentMode {
        return Curve.TangentMode.fromInt(_icall_Long_Long(getPointRightModeMethodBind, this.rawMemory, index))
    }


    private val setPointLeftTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_left_tangent") }
    open fun setPointLeftTangent(index: Long, tangent: Double) {
        _icall_Unit_Long_Double(setPointLeftTangentMethodBind, this.rawMemory, index, tangent)
    }


    private val setPointRightTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_right_tangent") }
    open fun setPointRightTangent(index: Long, tangent: Double) {
        _icall_Unit_Long_Double(setPointRightTangentMethodBind, this.rawMemory, index, tangent)
    }


    private val setPointLeftModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_left_mode") }
    open fun setPointLeftMode(index: Long, mode: Long) {
        _icall_Unit_Long_Long(setPointLeftModeMethodBind, this.rawMemory, index, mode)
    }


    private val setPointRightModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_right_mode") }
    open fun setPointRightMode(index: Long, mode: Long) {
        _icall_Unit_Long_Long(setPointRightModeMethodBind, this.rawMemory, index, mode)
    }


    private val getMinValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_min_value") }
    open fun getMinValue(): Double {
        return _icall_Double(getMinValueMethodBind, this.rawMemory)
    }


    private val setMinValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_min_value") }
    open fun setMinValue(min: Double) {
        _icall_Unit_Double(setMinValueMethodBind, this.rawMemory, min)
    }


    private val getMaxValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_max_value") }
    open fun getMaxValue(): Double {
        return _icall_Double(getMaxValueMethodBind, this.rawMemory)
    }


    private val setMaxValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_max_value") }
    open fun setMaxValue(max: Double) {
        _icall_Unit_Double(setMaxValueMethodBind, this.rawMemory, max)
    }


    private val cleanDupesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "clean_dupes") }
    open fun cleanDupes() {
        _icall_Unit(cleanDupesMethodBind, this.rawMemory)
    }


    private val bakeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "bake") }
    open fun bake() {
        _icall_Unit(bakeMethodBind, this.rawMemory)
    }


    private val getBakeResolutionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_bake_resolution") }
    open fun getBakeResolution(): Long {
        return _icall_Long(getBakeResolutionMethodBind, this.rawMemory)
    }


    private val setBakeResolutionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_bake_resolution") }
    open fun setBakeResolution(resolution: Long) {
        _icall_Unit_Long(setBakeResolutionMethodBind, this.rawMemory, resolution)
    }


    open fun _get_data(): GDArray {
        throw NotImplementedError("_get_data is not implemented for Curve")
    }


    open fun _set_data(data: GDArray) {
    }


}
