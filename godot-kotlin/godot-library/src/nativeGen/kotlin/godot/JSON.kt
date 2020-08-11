// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot
import godot.core.Variant
import godot.icalls._icall_JSONParseResult_String
import godot.icalls._icall_String_Variant_String_Boolean
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object JSON : Object() {
  init {
    memScoped {
        val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("JSON".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton JSON" }
        this@JSON.ptr = ptr
    }
  }

  fun parse(json: String): JSONParseResult {
    val mb = getMethodBind("_JSON","parse")
    return _icall_JSONParseResult_String( mb, this.ptr, json)
  }

  fun print(
    value: Variant,
    indent: String = "",
    sortKeys: Boolean = false
  ): String {
    val mb = getMethodBind("_JSON","print")
    return _icall_String_Variant_String_Boolean( mb, this.ptr, value, indent, sortKeys)
  }
}
