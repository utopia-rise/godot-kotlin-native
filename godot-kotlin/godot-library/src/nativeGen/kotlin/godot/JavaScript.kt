// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot
import godot.core.Variant
import godot.icalls._icall_Variant_String_Boolean
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object JavaScript : Object() {
  init {
    memScoped {
        val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("JavaScript".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton JavaScript" }
        this@JavaScript.ptr = ptr
    }
  }

  fun eval(code: String, useGlobalExecutionContext: Boolean = false): Variant {
    val mb = getMethodBind("JavaScript","eval")
    return _icall_Variant_String_Boolean( mb, this.ptr, code, useGlobalExecutionContext)
  }
}
