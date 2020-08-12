// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.icalls._icall_Dictionary_Long_String_nVariant
import godot.icalls._icall_Dictionary_String_Variant
import godot.icalls._icall_Dictionary_String_Variant_Variant
import godot.icalls._icall_Dictionary_Variant_Variant
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit_String_Object
import godot.icalls._icall_Variant_Variant_Boolean
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class JSONRPC internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("JSONRPC", "JSONRPC")
        }

  }

  open fun makeNotification(method: String, params: Variant): Dictionary {
    val mb = getMethodBind("JSONRPC","make_notification")
    return _icall_Dictionary_String_Variant( mb, this.ptr, method, params)
  }

  open fun makeRequest(
    method: String,
    params: Variant,
    id: Variant
  ): Dictionary {
    val mb = getMethodBind("JSONRPC","make_request")
    return _icall_Dictionary_String_Variant_Variant( mb, this.ptr, method, params, id)
  }

  open fun makeResponse(result: Variant, id: Variant): Dictionary {
    val mb = getMethodBind("JSONRPC","make_response")
    return _icall_Dictionary_Variant_Variant( mb, this.ptr, result, id)
  }

  open fun makeResponseError(
    code: Long,
    message: String,
    id: Variant? = null
  ): Dictionary {
    val mb = getMethodBind("JSONRPC","make_response_error")
    return _icall_Dictionary_Long_String_nVariant( mb, this.ptr, code, message, id)
  }

  open fun processAction(action: Variant, recurse: Boolean = false): Variant {
    val mb = getMethodBind("JSONRPC","process_action")
    return _icall_Variant_Variant_Boolean( mb, this.ptr, action, recurse)
  }

  open fun processString(action: String): String {
    val mb = getMethodBind("JSONRPC","process_string")
    return _icall_String_String( mb, this.ptr, action)
  }

  open fun setScope(scope: String, target: Object) {
    val mb = getMethodBind("JSONRPC","set_scope")
    _icall_Unit_String_Object( mb, this.ptr, scope, target)
  }

  enum class ErrorCode(
    id: Long
  ) {
    PARSE_ERROR(-32700),

    INTERNAL_ERROR(-32603),

    INVALID_PARAMS(-32602),

    METHOD_NOT_FOUND(-32601),

    INVALID_REQUEST(-32600);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
