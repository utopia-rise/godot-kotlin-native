package godot

import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.icalls._icall_NodePath
import godot.icalls._icall_Unit_NodePath
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class ViewportTexture internal constructor(
  _ignore: Any?
) : Texture(_ignore) {
  open var viewportPath: NodePath
    get() {
      val mb = getMethodBind("ViewportTexture","get_viewport_path_in_scene")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ViewportTexture","set_viewport_path_in_scene")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ViewportTexture", "ViewportTexture")
        }

  }

  open fun getViewportPathInScene(): NodePath {
    val mb = getMethodBind("ViewportTexture","get_viewport_path_in_scene")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun setViewportPathInScene(path: NodePath) {
    val mb = getMethodBind("ViewportTexture","set_viewport_path_in_scene")
    _icall_Unit_NodePath( mb, this.ptr, path)
  }

  companion object
}
