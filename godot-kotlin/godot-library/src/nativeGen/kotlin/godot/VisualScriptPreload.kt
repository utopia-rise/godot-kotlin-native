package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Resource
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class VisualScriptPreload internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var resource: Resource
    get() {
      val mb = getMethodBind("VisualScriptPreload","get_preload")
      return _icall_Resource(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPreload","set_preload")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptPreload", "VisualScriptPreload")
        }

  }

  open fun getPreload(): Resource {
    val mb = getMethodBind("VisualScriptPreload","get_preload")
    return _icall_Resource( mb, this.ptr)
  }

  open fun setPreload(resource: Resource) {
    val mb = getMethodBind("VisualScriptPreload","set_preload")
    _icall_Unit_Object( mb, this.ptr, resource)
  }
}
