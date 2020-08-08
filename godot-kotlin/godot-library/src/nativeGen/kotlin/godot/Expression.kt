package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long_String_PoolStringArray
import godot.icalls._icall_String
import godot.icalls._icall_Variant_VariantArray_nObject_Boolean
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class Expression internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Expression", "Expression")
        }

  }

  open fun execute(
    inputs: VariantArray = VariantArray(),
    baseInstance: Object? = null,
    showError: Boolean = true
  ): Variant {
    val mb = getMethodBind("Expression","execute")
    return _icall_Variant_VariantArray_nObject_Boolean( mb, this.ptr, inputs, baseInstance,
        showError)
  }

  open fun getErrorText(): String {
    val mb = getMethodBind("Expression","get_error_text")
    return _icall_String( mb, this.ptr)
  }

  open fun hasExecuteFailed(): Boolean {
    val mb = getMethodBind("Expression","has_execute_failed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun parse(expression: String, inputNames: PoolStringArray = PoolStringArray()): GodotError {
    val mb = getMethodBind("Expression","parse")
    return GodotError.byValue( _icall_Long_String_PoolStringArray( mb, this.ptr, expression,
        inputNames).toUInt())
  }

  companion object
}
