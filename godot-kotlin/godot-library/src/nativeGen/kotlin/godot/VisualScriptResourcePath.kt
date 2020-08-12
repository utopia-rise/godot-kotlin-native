// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class VisualScriptResourcePath : VisualScriptNode() {
  open var path: String
    get() {
      val mb = getMethodBind("VisualScriptResourcePath","get_resource_path")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptResourcePath","set_resource_path")
      _icall_Unit_String(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptResourcePath",
      "VisualScriptResourcePath")

  open fun getResourcePath(): String {
    val mb = getMethodBind("VisualScriptResourcePath","get_resource_path")
    return _icall_String( mb, this.ptr)
  }

  open fun setResourcePath(path: String) {
    val mb = getMethodBind("VisualScriptResourcePath","set_resource_path")
    _icall_Unit_String( mb, this.ptr, path)
  }
}
