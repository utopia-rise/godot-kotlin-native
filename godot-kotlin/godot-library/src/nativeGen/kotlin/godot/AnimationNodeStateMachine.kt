// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_AnimationNodeStateMachineTransition_Long
import godot.icalls._icall_AnimationNode_String
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_String
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_String_Long
import godot.icalls._icall_String_Object
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Object
import godot.icalls._icall_Unit_String_Object_Vector2
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_String_String_Object
import godot.icalls._icall_Unit_String_Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class AnimationNodeStateMachine internal constructor(
  _ignore: Any?
) : AnimationRootNode(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationNodeStateMachine", "AnimationNodeStateMachine")
        }

  }

  open fun _treeChanged() {
  }

  open fun addNode(
    name: String,
    node: AnimationNode,
    position: Vector2 = Vector2(0.0, 0.0)
  ) {
    val mb = getMethodBind("AnimationNodeStateMachine","add_node")
    _icall_Unit_String_Object_Vector2( mb, this.ptr, name, node, position)
  }

  open fun addTransition(
    from: String,
    to: String,
    transition: AnimationNodeStateMachineTransition
  ) {
    val mb = getMethodBind("AnimationNodeStateMachine","add_transition")
    _icall_Unit_String_String_Object( mb, this.ptr, from, to, transition)
  }

  open fun getEndNode(): String {
    val mb = getMethodBind("AnimationNodeStateMachine","get_end_node")
    return _icall_String( mb, this.ptr)
  }

  open fun getGraphOffset(): Vector2 {
    val mb = getMethodBind("AnimationNodeStateMachine","get_graph_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getNode(name: String): AnimationNode {
    val mb = getMethodBind("AnimationNodeStateMachine","get_node")
    return _icall_AnimationNode_String( mb, this.ptr, name)
  }

  open fun getNodeName(node: AnimationNode): String {
    val mb = getMethodBind("AnimationNodeStateMachine","get_node_name")
    return _icall_String_Object( mb, this.ptr, node)
  }

  open fun getNodePosition(name: String): Vector2 {
    val mb = getMethodBind("AnimationNodeStateMachine","get_node_position")
    return _icall_Vector2_String( mb, this.ptr, name)
  }

  open fun getStartNode(): String {
    val mb = getMethodBind("AnimationNodeStateMachine","get_start_node")
    return _icall_String( mb, this.ptr)
  }

  open fun getTransition(idx: Long): AnimationNodeStateMachineTransition {
    val mb = getMethodBind("AnimationNodeStateMachine","get_transition")
    return _icall_AnimationNodeStateMachineTransition_Long( mb, this.ptr, idx)
  }

  open fun getTransitionCount(): Long {
    val mb = getMethodBind("AnimationNodeStateMachine","get_transition_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTransitionFrom(idx: Long): String {
    val mb = getMethodBind("AnimationNodeStateMachine","get_transition_from")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getTransitionTo(idx: Long): String {
    val mb = getMethodBind("AnimationNodeStateMachine","get_transition_to")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun hasNode(name: String): Boolean {
    val mb = getMethodBind("AnimationNodeStateMachine","has_node")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun hasTransition(from: String, to: String): Boolean {
    val mb = getMethodBind("AnimationNodeStateMachine","has_transition")
    return _icall_Boolean_String_String( mb, this.ptr, from, to)
  }

  open fun removeNode(name: String) {
    val mb = getMethodBind("AnimationNodeStateMachine","remove_node")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun removeTransition(from: String, to: String) {
    val mb = getMethodBind("AnimationNodeStateMachine","remove_transition")
    _icall_Unit_String_String( mb, this.ptr, from, to)
  }

  open fun removeTransitionByIndex(idx: Long) {
    val mb = getMethodBind("AnimationNodeStateMachine","remove_transition_by_index")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun renameNode(name: String, newName: String) {
    val mb = getMethodBind("AnimationNodeStateMachine","rename_node")
    _icall_Unit_String_String( mb, this.ptr, name, newName)
  }

  open fun replaceNode(name: String, node: AnimationNode) {
    val mb = getMethodBind("AnimationNodeStateMachine","replace_node")
    _icall_Unit_String_Object( mb, this.ptr, name, node)
  }

  open fun setEndNode(name: String) {
    val mb = getMethodBind("AnimationNodeStateMachine","set_end_node")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setGraphOffset(offset: Vector2) {
    val mb = getMethodBind("AnimationNodeStateMachine","set_graph_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setNodePosition(name: String, position: Vector2) {
    val mb = getMethodBind("AnimationNodeStateMachine","set_node_position")
    _icall_Unit_String_Vector2( mb, this.ptr, name, position)
  }

  open fun setStartNode(name: String) {
    val mb = getMethodBind("AnimationNodeStateMachine","set_start_node")
    _icall_Unit_String( mb, this.ptr, name)
  }
}
