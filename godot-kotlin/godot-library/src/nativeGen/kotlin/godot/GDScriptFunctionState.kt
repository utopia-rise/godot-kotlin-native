package godot

import godot.core.Signal1
import godot.core.Variant
import godot.core.signal
import godot.icalls._icall_Boolean_Boolean
import godot.icalls._icall_Variant_nVariant
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError

open class GDScriptFunctionState internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  val completed: Signal1<Variant> by signal("result")

  internal constructor() : this(null)

  open fun _signal_callback(vararg __var_args: Any?): Variant {
    throw NotImplementedError("_signal_callback is not implemented for GDScriptFunctionState")
  }

  open fun isValid(extendedCheck: Boolean = false): Boolean {
    val mb = getMethodBind("GDScriptFunctionState","is_valid")
    return _icall_Boolean_Boolean( mb, this.ptr, extendedCheck)
  }

  open fun resume(arg: Variant? = null): Variant {
    val mb = getMethodBind("GDScriptFunctionState","resume")
    return _icall_Variant_nVariant( mb, this.ptr, arg)
  }

  companion object
}
