// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_AnimationNode_String
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_Unit_String_Long_String
import godot.icalls._icall_Unit_String_Object_Vector2
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_String_Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Unit

open class AnimationNodeBlendTree internal constructor(
  _ignore: Any?
) : AnimationRootNode(_ignore) {
  open var graphOffset: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendTree","get_graph_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendTree","set_graph_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("AnimationNodeBlendTree", "AnimationNodeBlendTree")
        }

  }

  open fun graphOffset(schedule: Vector2.() -> Unit): Vector2 = graphOffset.apply{
      schedule(this)
      graphOffset = this
  }


  open fun _nodeChanged(node: String) {
  }

  open fun _treeChanged() {
  }

  open fun addNode(
    name: String,
    node: AnimationNode,
    position: Vector2 = Vector2(0.0, 0.0)
  ) {
    val mb = getMethodBind("AnimationNodeBlendTree","add_node")
    _icall_Unit_String_Object_Vector2( mb, this.ptr, name, node, position)
  }

  open fun connectNode(
    inputNode: String,
    inputIndex: Long,
    outputNode: String
  ) {
    val mb = getMethodBind("AnimationNodeBlendTree","connect_node")
    _icall_Unit_String_Long_String( mb, this.ptr, inputNode, inputIndex, outputNode)
  }

  open fun disconnectNode(inputNode: String, inputIndex: Long) {
    val mb = getMethodBind("AnimationNodeBlendTree","disconnect_node")
    _icall_Unit_String_Long( mb, this.ptr, inputNode, inputIndex)
  }

  open fun getGraphOffset(): Vector2 {
    val mb = getMethodBind("AnimationNodeBlendTree","get_graph_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getNode(name: String): AnimationNode {
    val mb = getMethodBind("AnimationNodeBlendTree","get_node")
    return _icall_AnimationNode_String( mb, this.ptr, name)
  }

  open fun getNodePosition(name: String): Vector2 {
    val mb = getMethodBind("AnimationNodeBlendTree","get_node_position")
    return _icall_Vector2_String( mb, this.ptr, name)
  }

  open fun hasNode(name: String): Boolean {
    val mb = getMethodBind("AnimationNodeBlendTree","has_node")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun removeNode(name: String) {
    val mb = getMethodBind("AnimationNodeBlendTree","remove_node")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun renameNode(name: String, newName: String) {
    val mb = getMethodBind("AnimationNodeBlendTree","rename_node")
    _icall_Unit_String_String( mb, this.ptr, name, newName)
  }

  open fun setGraphOffset(offset: Vector2) {
    val mb = getMethodBind("AnimationNodeBlendTree","set_graph_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setNodePosition(name: String, position: Vector2) {
    val mb = getMethodBind("AnimationNodeBlendTree","set_node_position")
    _icall_Unit_String_Vector2( mb, this.ptr, name, position)
  }

  companion object {
    final const val CONNECTION_ERROR_CONNECTION_EXISTS: Long = 5

    final const val CONNECTION_ERROR_NO_INPUT: Long = 1

    final const val CONNECTION_ERROR_NO_INPUT_INDEX: Long = 2

    final const val CONNECTION_ERROR_NO_OUTPUT: Long = 3

    final const val CONNECTION_ERROR_SAME_NODE: Long = 4

    final const val CONNECTION_OK: Long = 0
  }
}
