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

    enum class TangentMode(val id: Int) {
        TANGENT_FREE(0),
        TANGENT_LINEAR(1),
        TANGENT_MODE_COUNT(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val TANGENT_FREE: Int = 0
        const val TANGENT_LINEAR: Int = 1
        const val TANGENT_MODE_COUNT: Int = 2


    }


    // Properties
    open var minValue: Float
        get() = _icall_Float(getMinValueMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMinValueMethodBind, this.rawMemory, value)


    open var maxValue: Float
        get() = _icall_Float(getMaxValueMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMaxValueMethodBind, this.rawMemory, value)


    open var bakeResolution: Int
        get() = _icall_Int(getBakeResolutionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setBakeResolutionMethodBind, this.rawMemory, value)




    // Methods
    private val addPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "add_point") }
    open fun addPoint(position: Vector2, leftTangent: Float = 0f, rightTangent: Float = 0f, leftMode: Int = 0, rightMode: Int = 0): Int {
        return _icall_Int_Vector2_Float_Float_Int_Int(addPointMethodBind, this.rawMemory, position, leftTangent, rightTangent, leftMode, rightMode)
    }


    private val removePointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "remove_point") }
    open fun removePoint(index: Int) {
        _icall_Unit_Int(removePointMethodBind, this.rawMemory, index)
    }


    private val clearPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "clear_points") }
    open fun clearPoints() {
        _icall_Unit(clearPointsMethodBind, this.rawMemory)
    }


    private val getPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_point_position") }
    open fun getPointPosition(index: Int): Vector2 {
        return _icall_Vector2_Int(getPointPositionMethodBind, this.rawMemory, index)
    }


    private val setPointValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_value") }
    open fun setPointValue(index: Int, y: Float) {
        _icall_Unit_Int_Float(setPointValueMethodBind, this.rawMemory, index, y)
    }


    private val setPointOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_offset") }
    open fun setPointOffset(index: Int, offset: Float): Int {
        return _icall_Int_Int_Float(setPointOffsetMethodBind, this.rawMemory, index, offset)
    }


    private val interpolateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "interpolate") }
    open fun interpolate(offset: Float): Float {
        return _icall_Float_Float(interpolateMethodBind, this.rawMemory, offset)
    }


    private val interpolateBakedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "interpolate_baked") }
    open fun interpolateBaked(offset: Float): Float {
        return _icall_Float_Float(interpolateBakedMethodBind, this.rawMemory, offset)
    }


    private val getPointLeftTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_point_left_tangent") }
    open fun getPointLeftTangent(index: Int): Float {
        return _icall_Float_Int(getPointLeftTangentMethodBind, this.rawMemory, index)
    }


    private val getPointRightTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_point_right_tangent") }
    open fun getPointRightTangent(index: Int): Float {
        return _icall_Float_Int(getPointRightTangentMethodBind, this.rawMemory, index)
    }


    private val getPointLeftModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_point_left_mode") }
    open fun getPointLeftMode(index: Int): Curve.TangentMode {
        return Curve.TangentMode.fromInt(_icall_Int_Int(getPointLeftModeMethodBind, this.rawMemory, index))
    }


    private val getPointRightModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_point_right_mode") }
    open fun getPointRightMode(index: Int): Curve.TangentMode {
        return Curve.TangentMode.fromInt(_icall_Int_Int(getPointRightModeMethodBind, this.rawMemory, index))
    }


    private val setPointLeftTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_left_tangent") }
    open fun setPointLeftTangent(index: Int, tangent: Float) {
        _icall_Unit_Int_Float(setPointLeftTangentMethodBind, this.rawMemory, index, tangent)
    }


    private val setPointRightTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_right_tangent") }
    open fun setPointRightTangent(index: Int, tangent: Float) {
        _icall_Unit_Int_Float(setPointRightTangentMethodBind, this.rawMemory, index, tangent)
    }


    private val setPointLeftModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_left_mode") }
    open fun setPointLeftMode(index: Int, mode: Int) {
        _icall_Unit_Int_Int(setPointLeftModeMethodBind, this.rawMemory, index, mode)
    }


    private val setPointRightModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_point_right_mode") }
    open fun setPointRightMode(index: Int, mode: Int) {
        _icall_Unit_Int_Int(setPointRightModeMethodBind, this.rawMemory, index, mode)
    }


    private val getMinValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_min_value") }
    open fun getMinValue(): Float {
        return _icall_Float(getMinValueMethodBind, this.rawMemory)
    }


    private val setMinValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_min_value") }
    open fun setMinValue(min: Float) {
        _icall_Unit_Float(setMinValueMethodBind, this.rawMemory, min)
    }


    private val getMaxValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "get_max_value") }
    open fun getMaxValue(): Float {
        return _icall_Float(getMaxValueMethodBind, this.rawMemory)
    }


    private val setMaxValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_max_value") }
    open fun setMaxValue(max: Float) {
        _icall_Unit_Float(setMaxValueMethodBind, this.rawMemory, max)
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
    open fun getBakeResolution(): Int {
        return _icall_Int(getBakeResolutionMethodBind, this.rawMemory)
    }


    private val setBakeResolutionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve", "set_bake_resolution") }
    open fun setBakeResolution(resolution: Int) {
        _icall_Unit_Int(setBakeResolutionMethodBind, this.rawMemory, resolution)
    }


    open fun _get_data(): GDArray {
        throw NotImplementedError("_get_data is not implemented for Curve")
    }


    open fun _set_data(data: GDArray) {
    }


}
