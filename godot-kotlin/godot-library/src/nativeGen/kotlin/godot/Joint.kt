// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.NodePath
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_NodePath
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_NodePath
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class Joint internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  open var collision_excludeNodes: Boolean
    get() {
      val mb = getMethodBind("Joint","get_exclude_nodes_from_collision")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Joint","set_exclude_nodes_from_collision")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var nodes_nodeA: NodePath
    get() {
      val mb = getMethodBind("Joint","get_node_a")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Joint","set_node_a")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var nodes_nodeB: NodePath
    get() {
      val mb = getMethodBind("Joint","get_node_b")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Joint","set_node_b")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var solver_priority: Long
    get() {
      val mb = getMethodBind("Joint","get_solver_priority")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Joint","set_solver_priority")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun getExcludeNodesFromCollision(): Boolean {
    val mb = getMethodBind("Joint","get_exclude_nodes_from_collision")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getNodeA(): NodePath {
    val mb = getMethodBind("Joint","get_node_a")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getNodeB(): NodePath {
    val mb = getMethodBind("Joint","get_node_b")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getSolverPriority(): Long {
    val mb = getMethodBind("Joint","get_solver_priority")
    return _icall_Long( mb, this.ptr)
  }

  open fun setExcludeNodesFromCollision(enable: Boolean) {
    val mb = getMethodBind("Joint","set_exclude_nodes_from_collision")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setNodeA(node: NodePath) {
    val mb = getMethodBind("Joint","set_node_a")
    _icall_Unit_NodePath( mb, this.ptr, node)
  }

  open fun setNodeB(node: NodePath) {
    val mb = getMethodBind("Joint","set_node_b")
    _icall_Unit_NodePath( mb, this.ptr, node)
  }

  open fun setSolverPriority(priority: Long) {
    val mb = getMethodBind("Joint","set_solver_priority")
    _icall_Unit_Long( mb, this.ptr, priority)
  }
}
