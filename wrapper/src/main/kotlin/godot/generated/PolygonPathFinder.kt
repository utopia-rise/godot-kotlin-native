@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PolygonPathFinder : Resource {
    constructor() : super("PolygonPathFinder")
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
        infix fun from(other: Resource): PolygonPathFinder = PolygonPathFinder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PolygonPathFinder = PolygonPathFinder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PolygonPathFinder = PolygonPathFinder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PolygonPathFinder = fromVariant(PolygonPathFinder(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val setupMethodBind: CPointer<godot_method_bind> by lazy { getMB("PolygonPathFinder", "setup") }
    open fun setup(points: PoolVector2Array, connections: PoolIntArray) {
        _icall_Unit_PoolVector2Array_PoolIntArray(setupMethodBind, this.rawMemory, points, connections)
    }


    private val findPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("PolygonPathFinder", "find_path") }
    open fun findPath(from: Vector2, to: Vector2): PoolVector2Array {
        return _icall_PoolVector2Array_Vector2_Vector2(findPathMethodBind, this.rawMemory, from, to)
    }


    private val getIntersectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("PolygonPathFinder", "get_intersections") }
    open fun getIntersections(from: Vector2, to: Vector2): PoolVector2Array {
        return _icall_PoolVector2Array_Vector2_Vector2(getIntersectionsMethodBind, this.rawMemory, from, to)
    }


    private val getClosestPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("PolygonPathFinder", "get_closest_point") }
    open fun getClosestPoint(point: Vector2): Vector2 {
        return _icall_Vector2_Vector2(getClosestPointMethodBind, this.rawMemory, point)
    }


    private val isPointInsideMethodBind: CPointer<godot_method_bind> by lazy { getMB("PolygonPathFinder", "is_point_inside") }
    open fun isPointInside(point: Vector2): Boolean {
        return _icall_Boolean_Vector2(isPointInsideMethodBind, this.rawMemory, point)
    }


    private val setPointPenaltyMethodBind: CPointer<godot_method_bind> by lazy { getMB("PolygonPathFinder", "set_point_penalty") }
    open fun setPointPenalty(idx: Long, penalty: Double) {
        _icall_Unit_Long_Double(setPointPenaltyMethodBind, this.rawMemory, idx, penalty)
    }


    private val getPointPenaltyMethodBind: CPointer<godot_method_bind> by lazy { getMB("PolygonPathFinder", "get_point_penalty") }
    open fun getPointPenalty(idx: Long): Double {
        return _icall_Double_Long(getPointPenaltyMethodBind, this.rawMemory, idx)
    }


    private val getBoundsMethodBind: CPointer<godot_method_bind> by lazy { getMB("PolygonPathFinder", "get_bounds") }
    open fun getBounds(): Rect2 {
        return _icall_Rect2(getBoundsMethodBind, this.rawMemory)
    }


    open fun _set_data(arg0: Dictionary) {
    }


    open fun _get_data(): Dictionary {
        throw NotImplementedError("_get_data is not implemented for PolygonPathFinder")
    }


}
