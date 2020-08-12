// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Object_String_VariantArray
import godot.icalls._icall_Variant_nVariantArray
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String

open class VisualScriptFunctionState internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptFunctionState", "VisualScriptFunctionState")
        }

  }

  open fun _signalCallback(vararg __var_args: Any?): Variant {
    throw NotImplementedError("_signal_callback is not implemented for VisualScriptFunctionState")
  }

  open fun connectToSignal(
    obj: Object,
    signals: String,
    args: VariantArray
  ) {
    val mb = getMethodBind("VisualScriptFunctionState","connect_to_signal")
    _icall_Unit_Object_String_VariantArray( mb, this.ptr, obj, signals, args)
  }

  open fun isValid(): Boolean {
    val mb = getMethodBind("VisualScriptFunctionState","is_valid")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun resume(args: VariantArray? = null): Variant {
    val mb = getMethodBind("VisualScriptFunctionState","resume")
    return _icall_Variant_nVariantArray( mb, this.ptr, args)
  }
}
