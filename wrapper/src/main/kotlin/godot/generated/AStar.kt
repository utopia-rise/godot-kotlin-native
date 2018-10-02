@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AStar : Reference {
    constructor() : super("AStar")
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
        infix fun from(other: Reference): AStar = AStar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AStar = AStar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AStar = fromVariant(AStar(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _estimate_cost(fromId: Long, toId: Long): Double {
        throw NotImplementedError("_estimate_cost is not implemented for AStar")
    }


    open fun _compute_cost(fromId: Long, toId: Long): Double {
        throw NotImplementedError("_compute_cost is not implemented for AStar")
    }


    private val getAvailablePointIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_available_point_id") }
    open fun getAvailablePointId(): Long {
        return _icall_Long(getAvailablePointIdMethodBind, this.rawMemory)
    }


    private val addPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "add_point") }
    open fun addPoint(id: Long, position: Vector3, weightScale: Double = 1.0) {
        _icall_Unit_Long_Vector3_Double(addPointMethodBind, this.rawMemory, id, position, weightScale)
    }


    private val getPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_point_position") }
    open fun getPointPosition(id: Long): Vector3 {
        return _icall_Vector3_Long(getPointPositionMethodBind, this.rawMemory, id)
    }


    private val setPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "set_point_position") }
    open fun setPointPosition(id: Long, position: Vector3) {
        _icall_Unit_Long_Vector3(setPointPositionMethodBind, this.rawMemory, id, position)
    }


    private val getPointWeightScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_point_weight_scale") }
    open fun getPointWeightScale(id: Long): Double {
        return _icall_Double_Long(getPointWeightScaleMethodBind, this.rawMemory, id)
    }


    private val setPointWeightScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "set_point_weight_scale") }
    open fun setPointWeightScale(id: Long, weightScale: Double) {
        _icall_Unit_Long_Double(setPointWeightScaleMethodBind, this.rawMemory, id, weightScale)
    }


    private val removePointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "remove_point") }
    open fun removePoint(id: Long) {
        _icall_Unit_Long(removePointMethodBind, this.rawMemory, id)
    }


    private val hasPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "has_point") }
    open fun hasPoint(id: Long): Boolean {
        return _icall_Boolean_Long(hasPointMethodBind, this.rawMemory, id)
    }


    private val getPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_points") }
    open fun getPoints(): GDArray {
        return _icall_GDArray(getPointsMethodBind, this.rawMemory)
    }


    private val getPointConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_point_connections") }
    open fun getPointConnections(id: Long): PoolIntArray {
        return _icall_PoolIntArray_Long(getPointConnectionsMethodBind, this.rawMemory, id)
    }


    private val connectPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "connect_points") }
    open fun connectPoints(id: Long, toId: Long, bidirectional: Boolean = true) {
        _icall_Unit_Long_Long_Boolean(connectPointsMethodBind, this.rawMemory, id, toId, bidirectional)
    }


    private val disconnectPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "disconnect_points") }
    open fun disconnectPoints(id: Long, toId: Long) {
        _icall_Unit_Long_Long(disconnectPointsMethodBind, this.rawMemory, id, toId)
    }


    private val arePointsConnectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "are_points_connected") }
    open fun arePointsConnected(id: Long, toId: Long): Boolean {
        return _icall_Boolean_Long_Long(arePointsConnectedMethodBind, this.rawMemory, id, toId)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val getClosestPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_closest_point") }
    open fun getClosestPoint(toPosition: Vector3): Long {
        return _icall_Long_Vector3(getClosestPointMethodBind, this.rawMemory, toPosition)
    }


    private val getClosestPositionInSegmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_closest_position_in_segment") }
    open fun getClosestPositionInSegment(toPosition: Vector3): Vector3 {
        return _icall_Vector3_Vector3(getClosestPositionInSegmentMethodBind, this.rawMemory, toPosition)
    }


    private val getPointPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_point_path") }
    open fun getPointPath(fromId: Long, toId: Long): PoolVector3Array {
        return _icall_PoolVector3Array_Long_Long(getPointPathMethodBind, this.rawMemory, fromId, toId)
    }


    private val getIdPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_id_path") }
    open fun getIdPath(fromId: Long, toId: Long): PoolIntArray {
        return _icall_PoolIntArray_Long_Long(getIdPathMethodBind, this.rawMemory, fromId, toId)
    }


}
