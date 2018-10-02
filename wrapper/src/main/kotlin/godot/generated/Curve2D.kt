@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Curve2D : Resource {
    constructor() : super("Curve2D")
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
        infix fun from(other: Resource): Curve2D = Curve2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Curve2D = Curve2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Curve2D = Curve2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Curve2D = fromVariant(Curve2D(""), other)


        // Constants


    }


    // Properties
    open var bakeInterval: Float
        get() = _icall_Float(getBakeIntervalMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setBakeIntervalMethodBind, this.rawMemory, value)




    // Methods
    private val getPointCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "get_point_count") }
    open fun getPointCount(): Int {
        return _icall_Int(getPointCountMethodBind, this.rawMemory)
    }


    private val addPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "add_point") }
    open fun addPoint(position: Vector2, _in: Vector2 = Vector2(0, 0), out: Vector2 = Vector2(0, 0), atPosition: Int = -1) {
        _icall_Unit_Vector2_Vector2_Vector2_Int(addPointMethodBind, this.rawMemory, position, _in, out, atPosition)
    }


    private val setPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "set_point_position") }
    open fun setPointPosition(idx: Int, position: Vector2) {
        _icall_Unit_Int_Vector2(setPointPositionMethodBind, this.rawMemory, idx, position)
    }


    private val getPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "get_point_position") }
    open fun getPointPosition(idx: Int): Vector2 {
        return _icall_Vector2_Int(getPointPositionMethodBind, this.rawMemory, idx)
    }


    private val setPointInMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "set_point_in") }
    open fun setPointIn(idx: Int, position: Vector2) {
        _icall_Unit_Int_Vector2(setPointInMethodBind, this.rawMemory, idx, position)
    }


    private val getPointInMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "get_point_in") }
    open fun getPointIn(idx: Int): Vector2 {
        return _icall_Vector2_Int(getPointInMethodBind, this.rawMemory, idx)
    }


    private val setPointOutMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "set_point_out") }
    open fun setPointOut(idx: Int, position: Vector2) {
        _icall_Unit_Int_Vector2(setPointOutMethodBind, this.rawMemory, idx, position)
    }


    private val getPointOutMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "get_point_out") }
    open fun getPointOut(idx: Int): Vector2 {
        return _icall_Vector2_Int(getPointOutMethodBind, this.rawMemory, idx)
    }


    private val removePointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "remove_point") }
    open fun removePoint(idx: Int) {
        _icall_Unit_Int(removePointMethodBind, this.rawMemory, idx)
    }


    private val clearPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "clear_points") }
    open fun clearPoints() {
        _icall_Unit(clearPointsMethodBind, this.rawMemory)
    }


    private val interpolateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "interpolate") }
    open fun interpolate(idx: Int, t: Float): Vector2 {
        return _icall_Vector2_Int_Float(interpolateMethodBind, this.rawMemory, idx, t)
    }


    private val interpolatefMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "interpolatef") }
    open fun interpolatef(fofs: Float): Vector2 {
        return _icall_Vector2_Float(interpolatefMethodBind, this.rawMemory, fofs)
    }


    private val setBakeIntervalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "set_bake_interval") }
    open fun setBakeInterval(distance: Float) {
        _icall_Unit_Float(setBakeIntervalMethodBind, this.rawMemory, distance)
    }


    private val getBakeIntervalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "get_bake_interval") }
    open fun getBakeInterval(): Float {
        return _icall_Float(getBakeIntervalMethodBind, this.rawMemory)
    }


    private val getBakedLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "get_baked_length") }
    open fun getBakedLength(): Float {
        return _icall_Float(getBakedLengthMethodBind, this.rawMemory)
    }


    private val interpolateBakedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "interpolate_baked") }
    open fun interpolateBaked(offset: Float, cubic: Boolean = false): Vector2 {
        return _icall_Vector2_Float_Boolean(interpolateBakedMethodBind, this.rawMemory, offset, cubic)
    }


    private val getBakedPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "get_baked_points") }
    open fun getBakedPoints(): PoolVector2Array {
        return _icall_PoolVector2Array(getBakedPointsMethodBind, this.rawMemory)
    }


    private val getClosestPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "get_closest_point") }
    open fun getClosestPoint(toPoint: Vector2): Vector2 {
        return _icall_Vector2_Vector2(getClosestPointMethodBind, this.rawMemory, toPoint)
    }


    private val getClosestOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "get_closest_offset") }
    open fun getClosestOffset(toPoint: Vector2): Float {
        return _icall_Float_Vector2(getClosestOffsetMethodBind, this.rawMemory, toPoint)
    }


    private val tessellateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve2D", "tessellate") }
    open fun tessellate(maxStages: Int = 5, toleranceDegrees: Float = 4f): PoolVector2Array {
        return _icall_PoolVector2Array_Int_Float(tessellateMethodBind, this.rawMemory, maxStages, toleranceDegrees)
    }


    open fun _get_data(): Dictionary {
        throw NotImplementedError("_get_data is not implemented for Curve2D")
    }


    open fun _set_data(arg0: Dictionary) {
    }


}
