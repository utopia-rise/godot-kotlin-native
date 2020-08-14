// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.NodePath
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_NodePath
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_NodePath
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double

open class Joint2D internal constructor() : Node2D() {
  open var bias: Double
    get() {
      val mb = getMethodBind("Joint2D","get_bias")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Joint2D","set_bias")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var disableCollision: Boolean
    get() {
      val mb = getMethodBind("Joint2D","get_exclude_nodes_from_collision")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Joint2D","set_exclude_nodes_from_collision")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var nodeA: NodePath
    get() {
      val mb = getMethodBind("Joint2D","get_node_a")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Joint2D","set_node_a")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var nodeB: NodePath
    get() {
      val mb = getMethodBind("Joint2D","get_node_b")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Joint2D","set_node_b")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open fun getBias(): Double {
    val mb = getMethodBind("Joint2D","get_bias")
    return _icall_Double( mb, this.ptr)
  }

  open fun getExcludeNodesFromCollision(): Boolean {
    val mb = getMethodBind("Joint2D","get_exclude_nodes_from_collision")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getNodeA(): NodePath {
    val mb = getMethodBind("Joint2D","get_node_a")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getNodeB(): NodePath {
    val mb = getMethodBind("Joint2D","get_node_b")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun setBias(bias: Double) {
    val mb = getMethodBind("Joint2D","set_bias")
    _icall_Unit_Double( mb, this.ptr, bias)
  }

  open fun setExcludeNodesFromCollision(enable: Boolean) {
    val mb = getMethodBind("Joint2D","set_exclude_nodes_from_collision")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setNodeA(node: NodePath) {
    val mb = getMethodBind("Joint2D","set_node_a")
    _icall_Unit_NodePath( mb, this.ptr, node)
  }

  open fun setNodeB(node: NodePath) {
    val mb = getMethodBind("Joint2D","set_node_b")
    _icall_Unit_NodePath( mb, this.ptr, node)
  }
}
