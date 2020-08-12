// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Signal0
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind

open class EditorSelection internal constructor() : Object() {
  val selectionChanged: Signal0 by signal()

  open fun _emitChange() {
  }

  open fun _nodeRemoved(arg0: Node) {
  }

  open fun addNode(node: Node) {
    val mb = getMethodBind("EditorSelection","add_node")
    _icall_Unit_Object( mb, this.ptr, node)
  }

  open fun clear() {
    val mb = getMethodBind("EditorSelection","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun getSelectedNodes(): VariantArray {
    val mb = getMethodBind("EditorSelection","get_selected_nodes")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getTransformableSelectedNodes(): VariantArray {
    val mb = getMethodBind("EditorSelection","get_transformable_selected_nodes")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun removeNode(node: Node) {
    val mb = getMethodBind("EditorSelection","remove_node")
    _icall_Unit_Object( mb, this.ptr, node)
  }
}
