@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Curve3D : Resource {
    constructor() : super("Curve3D")
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
        infix fun from(other: Resource): Curve3D = Curve3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Curve3D = Curve3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Curve3D = Curve3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Curve3D = fromVariant(Curve3D(""), other)


        // Constants


    }


    // Properties
    open var bakeInterval: Double
        get() = _icall_Double(getBakeIntervalMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBakeIntervalMethodBind, this.rawMemory, value)


    open var upVectorEnabled: Boolean
        get() = _icall_Boolean(isUpVectorEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUpVectorEnabledMethodBind, this.rawMemory, value)




    // Methods
    private val getPointCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_point_count") }
    open fun getPointCount(): Long {
        return _icall_Long(getPointCountMethodBind, this.rawMemory)
    }


    private val addPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "add_point") }
    open fun addPoint(position: Vector3, _in: Vector3 = Vector3(0, 0, 0), out: Vector3 = Vector3(0, 0, 0), atPosition: Long = -1) {
        _icall_Unit_Vector3_Vector3_Vector3_Long(addPointMethodBind, this.rawMemory, position, _in, out, atPosition)
    }


    private val setPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "set_point_position") }
    open fun setPointPosition(idx: Long, position: Vector3) {
        _icall_Unit_Long_Vector3(setPointPositionMethodBind, this.rawMemory, idx, position)
    }


    private val getPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_point_position") }
    open fun getPointPosition(idx: Long): Vector3 {
        return _icall_Vector3_Long(getPointPositionMethodBind, this.rawMemory, idx)
    }


    private val setPointTiltMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "set_point_tilt") }
    open fun setPointTilt(idx: Long, tilt: Double) {
        _icall_Unit_Long_Double(setPointTiltMethodBind, this.rawMemory, idx, tilt)
    }


    private val getPointTiltMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_point_tilt") }
    open fun getPointTilt(idx: Long): Double {
        return _icall_Double_Long(getPointTiltMethodBind, this.rawMemory, idx)
    }


    private val setPointInMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "set_point_in") }
    open fun setPointIn(idx: Long, position: Vector3) {
        _icall_Unit_Long_Vector3(setPointInMethodBind, this.rawMemory, idx, position)
    }


    private val getPointInMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_point_in") }
    open fun getPointIn(idx: Long): Vector3 {
        return _icall_Vector3_Long(getPointInMethodBind, this.rawMemory, idx)
    }


    private val setPointOutMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "set_point_out") }
    open fun setPointOut(idx: Long, position: Vector3) {
        _icall_Unit_Long_Vector3(setPointOutMethodBind, this.rawMemory, idx, position)
    }


    private val getPointOutMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_point_out") }
    open fun getPointOut(idx: Long): Vector3 {
        return _icall_Vector3_Long(getPointOutMethodBind, this.rawMemory, idx)
    }


    private val removePointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "remove_point") }
    open fun removePoint(idx: Long) {
        _icall_Unit_Long(removePointMethodBind, this.rawMemory, idx)
    }


    private val clearPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "clear_points") }
    open fun clearPoints() {
        _icall_Unit(clearPointsMethodBind, this.rawMemory)
    }


    private val interpolateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "interpolate") }
    open fun interpolate(idx: Long, t: Double): Vector3 {
        return _icall_Vector3_Long_Double(interpolateMethodBind, this.rawMemory, idx, t)
    }


    private val interpolatefMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "interpolatef") }
    open fun interpolatef(fofs: Double): Vector3 {
        return _icall_Vector3_Double(interpolatefMethodBind, this.rawMemory, fofs)
    }


    private val setBakeIntervalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "set_bake_interval") }
    open fun setBakeInterval(distance: Double) {
        _icall_Unit_Double(setBakeIntervalMethodBind, this.rawMemory, distance)
    }


    private val getBakeIntervalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_bake_interval") }
    open fun getBakeInterval(): Double {
        return _icall_Double(getBakeIntervalMethodBind, this.rawMemory)
    }


    private val setUpVectorEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "set_up_vector_enabled") }
    open fun setUpVectorEnabled(enable: Boolean) {
        _icall_Unit_Boolean(setUpVectorEnabledMethodBind, this.rawMemory, enable)
    }


    private val isUpVectorEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "is_up_vector_enabled") }
    open fun isUpVectorEnabled(): Boolean {
        return _icall_Boolean(isUpVectorEnabledMethodBind, this.rawMemory)
    }


    private val getBakedLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_baked_length") }
    open fun getBakedLength(): Double {
        return _icall_Double(getBakedLengthMethodBind, this.rawMemory)
    }


    private val interpolateBakedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "interpolate_baked") }
    open fun interpolateBaked(offset: Double, cubic: Boolean = false): Vector3 {
        return _icall_Vector3_Double_Boolean(interpolateBakedMethodBind, this.rawMemory, offset, cubic)
    }


    private val interpolateBakedUpVectorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "interpolate_baked_up_vector") }
    open fun interpolateBakedUpVector(offset: Double, applyTilt: Boolean = false): Vector3 {
        return _icall_Vector3_Double_Boolean(interpolateBakedUpVectorMethodBind, this.rawMemory, offset, applyTilt)
    }


    private val getBakedPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_baked_points") }
    open fun getBakedPoints(): PoolVector3Array {
        return _icall_PoolVector3Array(getBakedPointsMethodBind, this.rawMemory)
    }


    private val getBakedTiltsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_baked_tilts") }
    open fun getBakedTilts(): PoolRealArray {
        return _icall_PoolRealArray(getBakedTiltsMethodBind, this.rawMemory)
    }


    private val getBakedUpVectorsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_baked_up_vectors") }
    open fun getBakedUpVectors(): PoolVector3Array {
        return _icall_PoolVector3Array(getBakedUpVectorsMethodBind, this.rawMemory)
    }


    private val getClosestPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_closest_point") }
    open fun getClosestPoint(toPoint: Vector3): Vector3 {
        return _icall_Vector3_Vector3(getClosestPointMethodBind, this.rawMemory, toPoint)
    }


    private val getClosestOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "get_closest_offset") }
    open fun getClosestOffset(toPoint: Vector3): Double {
        return _icall_Double_Vector3(getClosestOffsetMethodBind, this.rawMemory, toPoint)
    }


    private val tessellateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Curve3D", "tessellate") }
    open fun tessellate(maxStages: Long = 5, toleranceDegrees: Double = 4.0): PoolVector3Array {
        return _icall_PoolVector3Array_Long_Double(tessellateMethodBind, this.rawMemory, maxStages, toleranceDegrees)
    }


    open fun _get_data(): Dictionary {
        throw NotImplementedError("_get_data is not implemented for Curve3D")
    }


    open fun _set_data(arg0: Dictionary) {
    }


}
