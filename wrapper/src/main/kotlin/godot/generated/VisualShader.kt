@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShader : Shader {
    constructor() : super("VisualShader")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Type(val id: Int) {
        TYPE_VERTEX(0),
        TYPE_FRAGMENT(1),
        TYPE_LIGHT(2),
        TYPE_MAX(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Shader): VisualShader = VisualShader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShader = VisualShader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShader = VisualShader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShader = VisualShader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShader = fromVariant(VisualShader(""), other)


        // Constants
        const val TYPE_VERTEX: Int = 0
        const val TYPE_FRAGMENT: Int = 1
        const val TYPE_LIGHT: Int = 2
        const val TYPE_MAX: Int = 3
        const val NODE_ID_INVALID: Int = -1
        const val NODE_ID_OUTPUT: Int = 0


    }


    // Properties
    open var graphOffset: Vector2
        get() = _icall_Vector2(getGraphOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setGraphOffsetMethodBind, this.rawMemory, value)
    open fun graphOffset(shedule: (Vector2) -> Unit): Vector2 = graphOffset.apply {
        shedule(this)
        graphOffset = this
    }




    // Methods
    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "set_mode") }
    open fun setMode(mode: Int) {
        _icall_Unit_Int(setModeMethodBind, this.rawMemory, mode)
    }


    private val addNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "add_node") }
    open fun addNode(type: Int, node: VisualShaderNode, position: Vector2, id: Int) {
        _icall_Unit_Int_Object_Vector2_Int(addNodeMethodBind, this.rawMemory, type, node, position, id)
    }


    private val setNodePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "set_node_position") }
    open fun setNodePosition(type: Int, id: Int, position: Vector2) {
        _icall_Unit_Int_Int_Vector2(setNodePositionMethodBind, this.rawMemory, type, id, position)
    }


    private val getNodePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "get_node_position") }
    open fun getNodePosition(type: Int, id: Int): Vector2 {
        return _icall_Vector2_Int_Int(getNodePositionMethodBind, this.rawMemory, type, id)
    }


    private val getNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "get_node") }
    open fun getNode(type: Int, arg1: Int): VisualShaderNode {
        return _icall_VisualShaderNode_Int_Int(getNodeMethodBind, this.rawMemory, type, arg1)
    }


    private val getNodeListMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "get_node_list") }
    open fun getNodeList(type: Int): PoolIntArray {
        return _icall_PoolIntArray_Int(getNodeListMethodBind, this.rawMemory, type)
    }


    private val getValidNodeIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "get_valid_node_id") }
    open fun getValidNodeId(type: Int): Int {
        return _icall_Int_Int(getValidNodeIdMethodBind, this.rawMemory, type)
    }


    private val removeNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "remove_node") }
    open fun removeNode(type: Int, id: Int) {
        _icall_Unit_Int_Int(removeNodeMethodBind, this.rawMemory, type, id)
    }


    private val isNodeConnectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "is_node_connection") }
    open fun isNodeConnection(type: Int, fromNode: Int, fromPort: Int, toNode: Int, toPort: Int): Boolean {
        return _icall_Boolean_Int_Int_Int_Int_Int(isNodeConnectionMethodBind, this.rawMemory, type, fromNode, fromPort, toNode, toPort)
    }


    private val canConnectNodesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "can_connect_nodes") }
    open fun canConnectNodes(type: Int, fromNode: Int, fromPort: Int, toNode: Int, toPort: Int): Boolean {
        return _icall_Boolean_Int_Int_Int_Int_Int(canConnectNodesMethodBind, this.rawMemory, type, fromNode, fromPort, toNode, toPort)
    }


    private val connectNodesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "connect_nodes") }
    open fun connectNodes(type: Int, fromNode: Int, fromPort: Int, toNode: Int, toPort: Int): GodotError {
        return GodotError.fromInt(_icall_Int_Int_Int_Int_Int_Int(connectNodesMethodBind, this.rawMemory, type, fromNode, fromPort, toNode, toPort))
    }


    private val disconnectNodesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "disconnect_nodes") }
    open fun disconnectNodes(type: Int, fromNode: Int, fromPort: Int, toNode: Int, toPort: Int) {
        _icall_Unit_Int_Int_Int_Int_Int(disconnectNodesMethodBind, this.rawMemory, type, fromNode, fromPort, toNode, toPort)
    }


    private val getNodeConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "get_node_connections") }
    open fun getNodeConnections(type: Int): GDArray {
        return _icall_GDArray_Int(getNodeConnectionsMethodBind, this.rawMemory, type)
    }


    private val setGraphOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "set_graph_offset") }
    open fun setGraphOffset(offset: Vector2) {
        _icall_Unit_Vector2(setGraphOffsetMethodBind, this.rawMemory, offset)
    }


    private val getGraphOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShader", "get_graph_offset") }
    open fun getGraphOffset(): Vector2 {
        return _icall_Vector2(getGraphOffsetMethodBind, this.rawMemory)
    }


    open fun _queue_update() {
    }


    open fun _update_shader() {
    }


    open fun _input_type_changed(arg0: Int, arg1: Int) {
    }


}
