// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Variant
import godot.icalls._icall_Variant
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class WeakRef : Reference() {
  override fun __new(): COpaquePointer = invokeConstructor("WeakRef", "WeakRef")

  open fun getRef(): Variant {
    val mb = getMethodBind("WeakRef","get_ref")
    return _icall_Variant( mb, this.ptr)
  }
}
