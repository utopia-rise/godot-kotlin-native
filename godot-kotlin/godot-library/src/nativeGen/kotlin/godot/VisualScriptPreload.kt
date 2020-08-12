// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Resource
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class VisualScriptPreload : VisualScriptNode() {
  open var resource: Resource
    get() {
      val mb = getMethodBind("VisualScriptPreload","get_preload")
      return _icall_Resource(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPreload","set_preload")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptPreload",
      "VisualScriptPreload")

  open fun getPreload(): Resource {
    val mb = getMethodBind("VisualScriptPreload","get_preload")
    return _icall_Resource( mb, this.ptr)
  }

  open fun setPreload(resource: Resource) {
    val mb = getMethodBind("VisualScriptPreload","set_preload")
    _icall_Unit_Object( mb, this.ptr, resource)
  }
}
