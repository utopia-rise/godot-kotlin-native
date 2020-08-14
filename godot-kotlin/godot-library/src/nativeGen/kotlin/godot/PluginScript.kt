// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Variant
import godot.icalls._icall_varargs
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlinx.cinterop.COpaquePointer

open class PluginScript : Script() {
  override fun __new(): COpaquePointer = invokeConstructor("PluginScript", "PluginScript")

  open fun new(vararg __var_args: Any?): Variant {
    val mb = getMethodBind("PluginScript","new")
    return _icall_varargs( mb, this.ptr, __var_args)
  }
}
