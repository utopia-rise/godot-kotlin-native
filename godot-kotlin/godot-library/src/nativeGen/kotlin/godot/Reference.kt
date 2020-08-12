// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlinx.cinterop.COpaquePointer

open class Reference : Object() {
  override fun __new(): COpaquePointer = invokeConstructor("Reference", "Reference")

  open fun initRef(): Boolean {
    val mb = getMethodBind("Reference","init_ref")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun reference(): Boolean {
    val mb = getMethodBind("Reference","reference")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun unreference(): Boolean {
    val mb = getMethodBind("Reference","unreference")
    return _icall_Boolean( mb, this.ptr)
  }
}
