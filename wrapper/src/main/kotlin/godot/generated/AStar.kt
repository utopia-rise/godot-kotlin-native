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
    open fun _estimate_cost(fromId: Int, toId: Int): Float {
        throw NotImplementedError("_estimate_cost is not implemented for AStar")
    }


    open fun _compute_cost(fromId: Int, toId: Int): Float {
        throw NotImplementedError("_compute_cost is not implemented for AStar")
    }


    private val getAvailablePointIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_available_point_id") }
    open fun getAvailablePointId(): Int {
        return _icall_Int(getAvailablePointIdMethodBind, this.rawMemory)
    }


    private val addPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "add_point") }
    open fun addPoint(id: Int, position: Vector3, weightScale: Float = 1f) {
        _icall_Unit_Int_Vector3_Float(addPointMethodBind, this.rawMemory, id, position, weightScale)
    }


    private val getPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_point_position") }
    open fun getPointPosition(id: Int): Vector3 {
        return _icall_Vector3_Int(getPointPositionMethodBind, this.rawMemory, id)
    }


    private val setPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "set_point_position") }
    open fun setPointPosition(id: Int, position: Vector3) {
        _icall_Unit_Int_Vector3(setPointPositionMethodBind, this.rawMemory, id, position)
    }


    private val getPointWeightScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_point_weight_scale") }
    open fun getPointWeightScale(id: Int): Float {
        return _icall_Float_Int(getPointWeightScaleMethodBind, this.rawMemory, id)
    }


    private val setPointWeightScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "set_point_weight_scale") }
    open fun setPointWeightScale(id: Int, weightScale: Float) {
        _icall_Unit_Int_Float(setPointWeightScaleMethodBind, this.rawMemory, id, weightScale)
    }


    private val removePointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "remove_point") }
    open fun removePoint(id: Int) {
        _icall_Unit_Int(removePointMethodBind, this.rawMemory, id)
    }


    private val hasPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "has_point") }
    open fun hasPoint(id: Int): Boolean {
        return _icall_Boolean_Int(hasPointMethodBind, this.rawMemory, id)
    }


    private val getPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_points") }
    open fun getPoints(): GDArray {
        return _icall_GDArray(getPointsMethodBind, this.rawMemory)
    }


    private val getPointConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_point_connections") }
    open fun getPointConnections(id: Int): PoolIntArray {
        return _icall_PoolIntArray_Int(getPointConnectionsMethodBind, this.rawMemory, id)
    }


    private val connectPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "connect_points") }
    open fun connectPoints(id: Int, toId: Int, bidirectional: Boolean = true) {
        _icall_Unit_Int_Int_Boolean(connectPointsMethodBind, this.rawMemory, id, toId, bidirectional)
    }


    private val disconnectPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "disconnect_points") }
    open fun disconnectPoints(id: Int, toId: Int) {
        _icall_Unit_Int_Int(disconnectPointsMethodBind, this.rawMemory, id, toId)
    }


    private val arePointsConnectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "are_points_connected") }
    open fun arePointsConnected(id: Int, toId: Int): Boolean {
        return _icall_Boolean_Int_Int(arePointsConnectedMethodBind, this.rawMemory, id, toId)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val getClosestPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_closest_point") }
    open fun getClosestPoint(toPosition: Vector3): Int {
        return _icall_Int_Vector3(getClosestPointMethodBind, this.rawMemory, toPosition)
    }


    private val getClosestPositionInSegmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_closest_position_in_segment") }
    open fun getClosestPositionInSegment(toPosition: Vector3): Vector3 {
        return _icall_Vector3_Vector3(getClosestPositionInSegmentMethodBind, this.rawMemory, toPosition)
    }


    private val getPointPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_point_path") }
    open fun getPointPath(fromId: Int, toId: Int): PoolVector3Array {
        return _icall_PoolVector3Array_Int_Int(getPointPathMethodBind, this.rawMemory, fromId, toId)
    }


    private val getIdPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AStar", "get_id_path") }
    open fun getIdPath(fromId: Int, toId: Int): PoolIntArray {
        return _icall_PoolIntArray_Int_Int(getIdPathMethodBind, this.rawMemory, fromId, toId)
    }


}
