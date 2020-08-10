// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolByteArray
import godot.core.Variant
import godot.icalls._icall_PoolByteArray
import godot.icalls._icall_varargs
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class GDScript internal constructor(
  _ignore: Any?
) : Script(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("GDScript", "GDScript")
        }

  }

  open fun getAsByteCode(): PoolByteArray {
    val mb = getMethodBind("GDScript","get_as_byte_code")
    return _icall_PoolByteArray( mb, this.ptr)
  }

  open fun new(vararg __var_args: Any?): Variant {
    val mb = getMethodBind("GDScript","new")
    return _icall_varargs( mb, this.ptr, __var_args)
  }
}
