// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.Variant
import godot.icalls._icall_Long
import godot.icalls._icall_Object
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Variant
import godot.icalls._icall_Variant
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.String

open class JSONParseResult internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var error: Object
    get() {
      val mb = getMethodBind("JSONParseResult","get_error")
      return _icall_Object(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("JSONParseResult","set_error")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var errorLine: Long
    get() {
      val mb = getMethodBind("JSONParseResult","get_error_line")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("JSONParseResult","set_error_line")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var errorString: String
    get() {
      val mb = getMethodBind("JSONParseResult","get_error_string")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("JSONParseResult","set_error_string")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var result: Variant
    get() {
      val mb = getMethodBind("JSONParseResult","get_result")
      return _icall_Variant(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("JSONParseResult","set_result")
      _icall_Unit_Variant(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("JSONParseResult", "JSONParseResult")
        }

  }

  open fun getError(): GodotError {
    val mb = getMethodBind("JSONParseResult","get_error")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun getErrorLine(): Long {
    val mb = getMethodBind("JSONParseResult","get_error_line")
    return _icall_Long( mb, this.ptr)
  }

  open fun getErrorString(): String {
    val mb = getMethodBind("JSONParseResult","get_error_string")
    return _icall_String( mb, this.ptr)
  }

  open fun getResult(): Variant {
    val mb = getMethodBind("JSONParseResult","get_result")
    return _icall_Variant( mb, this.ptr)
  }

  open fun setError(error: Long) {
    val mb = getMethodBind("JSONParseResult","set_error")
    _icall_Unit_Long( mb, this.ptr, error)
  }

  open fun setErrorLine(errorLine: Long) {
    val mb = getMethodBind("JSONParseResult","set_error_line")
    _icall_Unit_Long( mb, this.ptr, errorLine)
  }

  open fun setErrorString(errorString: String) {
    val mb = getMethodBind("JSONParseResult","set_error_string")
    _icall_Unit_String( mb, this.ptr, errorString)
  }

  open fun setResult(result: Variant) {
    val mb = getMethodBind("JSONParseResult","set_result")
    _icall_Unit_Variant( mb, this.ptr, result)
  }
}
