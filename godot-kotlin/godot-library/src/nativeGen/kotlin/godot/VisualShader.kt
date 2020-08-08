package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolIntArray
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_Boolean_Long_Long_Long_Long_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Long_Long_Long_Long_Long
import godot.icalls._icall_PoolIntArray_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Long_Long_Long_Long
import godot.icalls._icall_Unit_Long_Long_Vector2
import godot.icalls._icall_Unit_Long_Object_Vector2_Long
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_VariantArray_Long
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Long_Long
import godot.icalls._icall_VisualShaderNode_Long_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Unit

open class VisualShader internal constructor(
  _ignore: Any?
) : Shader(_ignore) {
  open var graphOffset: Vector2
    get() {
      val mb = getMethodBind("VisualShader","get_graph_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShader","set_graph_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShader", "VisualShader")
        }

  }

  open fun graphOffset(schedule: Vector2.() -> Unit): Vector2 = graphOffset.apply{
      schedule(this)
      graphOffset = this
  }


  open fun _input_type_changed(arg0: Long, arg1: Long) {
  }

  open fun _queue_update() {
  }

  open fun _update_shader() {
  }

  open fun addNode(
    type: Long,
    node: VisualShaderNode,
    position: Vector2,
    id: Long
  ) {
    val mb = getMethodBind("VisualShader","add_node")
    _icall_Unit_Long_Object_Vector2_Long( mb, this.ptr, type, node, position, id)
  }

  open fun canConnectNodes(
    type: Long,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Boolean {
    val mb = getMethodBind("VisualShader","can_connect_nodes")
    return _icall_Boolean_Long_Long_Long_Long_Long( mb, this.ptr, type, fromNode, fromPort, toNode,
        toPort)
  }

  open fun connectNodes(
    type: Long,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): GodotError {
    val mb = getMethodBind("VisualShader","connect_nodes")
    return GodotError.byValue( _icall_Long_Long_Long_Long_Long_Long( mb, this.ptr, type, fromNode,
        fromPort, toNode, toPort).toUInt())
  }

  open fun connectNodesForced(
    type: Long,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ) {
    val mb = getMethodBind("VisualShader","connect_nodes_forced")
    _icall_Unit_Long_Long_Long_Long_Long( mb, this.ptr, type, fromNode, fromPort, toNode, toPort)
  }

  open fun disconnectNodes(
    type: Long,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ) {
    val mb = getMethodBind("VisualShader","disconnect_nodes")
    _icall_Unit_Long_Long_Long_Long_Long( mb, this.ptr, type, fromNode, fromPort, toNode, toPort)
  }

  open fun getGraphOffset(): Vector2 {
    val mb = getMethodBind("VisualShader","get_graph_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getNode(type: Long, id: Long): VisualShaderNode {
    val mb = getMethodBind("VisualShader","get_node")
    return _icall_VisualShaderNode_Long_Long( mb, this.ptr, type, id)
  }

  open fun getNodeConnections(type: Long): VariantArray {
    val mb = getMethodBind("VisualShader","get_node_connections")
    return _icall_VariantArray_Long( mb, this.ptr, type)
  }

  open fun getNodeList(type: Long): PoolIntArray {
    val mb = getMethodBind("VisualShader","get_node_list")
    return _icall_PoolIntArray_Long( mb, this.ptr, type)
  }

  open fun getNodePosition(type: Long, id: Long): Vector2 {
    val mb = getMethodBind("VisualShader","get_node_position")
    return _icall_Vector2_Long_Long( mb, this.ptr, type, id)
  }

  open fun getValidNodeId(type: Long): Long {
    val mb = getMethodBind("VisualShader","get_valid_node_id")
    return _icall_Long_Long( mb, this.ptr, type)
  }

  open fun isNodeConnection(
    type: Long,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Boolean {
    val mb = getMethodBind("VisualShader","is_node_connection")
    return _icall_Boolean_Long_Long_Long_Long_Long( mb, this.ptr, type, fromNode, fromPort, toNode,
        toPort)
  }

  open fun removeNode(type: Long, id: Long) {
    val mb = getMethodBind("VisualShader","remove_node")
    _icall_Unit_Long_Long( mb, this.ptr, type, id)
  }

  open fun setGraphOffset(offset: Vector2) {
    val mb = getMethodBind("VisualShader","set_graph_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setMode(mode: Long) {
    val mb = getMethodBind("VisualShader","set_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setNodePosition(
    type: Long,
    id: Long,
    position: Vector2
  ) {
    val mb = getMethodBind("VisualShader","set_node_position")
    _icall_Unit_Long_Long_Vector2( mb, this.ptr, type, id, position)
  }

  enum class Type(
    id: Long
  ) {
    TYPE_VERTEX(0),

    TYPE_FRAGMENT(1),

    TYPE_LIGHT(2),

    TYPE_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val NODE_ID_INVALID: Long = -1

    final const val NODE_ID_OUTPUT: Long = 0

    final const val TYPE_FRAGMENT: Long = 1

    final const val TYPE_LIGHT: Long = 2

    final const val TYPE_MAX: Long = 3

    final const val TYPE_VERTEX: Long = 0
  }
}
