// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.icalls._icall_NodePath
import godot.icalls._icall_Unit_NodePath
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any

open class VisualScriptSceneNode internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var nodePath: NodePath
    get() {
      val mb = getMethodBind("VisualScriptSceneNode","get_node_path")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptSceneNode","set_node_path")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualScriptSceneNode", "VisualScriptSceneNode")
        }

  }

  open fun getNodePath(): NodePath {
    val mb = getMethodBind("VisualScriptSceneNode","get_node_path")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun setNodePath(path: NodePath) {
    val mb = getMethodBind("VisualScriptSceneNode","set_node_path")
    _icall_Unit_NodePath( mb, this.ptr, path)
  }
}
