package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String

open class VisualScriptResourcePath internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var path: String
    get() {
      val mb = getMethodBind("VisualScriptResourcePath","get_resource_path")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptResourcePath","set_resource_path")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptResourcePath", "VisualScriptResourcePath")
        }

  }

  open fun getResourcePath(): String {
    val mb = getMethodBind("VisualScriptResourcePath","get_resource_path")
    return _icall_String( mb, this.ptr)
  }

  open fun setResourcePath(path: String) {
    val mb = getMethodBind("VisualScriptResourcePath","set_resource_path")
    _icall_Unit_String( mb, this.ptr, path)
  }

  companion object
}
