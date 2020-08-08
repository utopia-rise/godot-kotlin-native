package godot

import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.icalls._icall_PoolByteArray_String
import godot.icalls._icall_String_PoolByteArray
import godot.icalls._icall_String_String
import godot.icalls._icall_String_Variant_Boolean
import godot.icalls._icall_Variant_String_Boolean
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object Marshalls : Object() {
  init {
    memScoped {
        val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("Marshalls".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton Marshalls" }
        this@Marshalls.ptr = ptr
    }
  }

  fun base64ToRaw(base64Str: String): PoolByteArray {
    val mb = getMethodBind("_Marshalls","base64_to_raw")
    return _icall_PoolByteArray_String( mb, this.ptr, base64Str)
  }

  fun base64ToUtf8(base64Str: String): String {
    val mb = getMethodBind("_Marshalls","base64_to_utf8")
    return _icall_String_String( mb, this.ptr, base64Str)
  }

  fun base64ToVariant(base64Str: String, allowObjects: Boolean = false): Variant {
    val mb = getMethodBind("_Marshalls","base64_to_variant")
    return _icall_Variant_String_Boolean( mb, this.ptr, base64Str, allowObjects)
  }

  fun rawToBase64(array: PoolByteArray): String {
    val mb = getMethodBind("_Marshalls","raw_to_base64")
    return _icall_String_PoolByteArray( mb, this.ptr, array)
  }

  fun utf8ToBase64(utf8Str: String): String {
    val mb = getMethodBind("_Marshalls","utf8_to_base64")
    return _icall_String_String( mb, this.ptr, utf8Str)
  }

  fun variantToBase64(variant: Variant, fullObjects: Boolean = false): String {
    val mb = getMethodBind("_Marshalls","variant_to_base64")
    return _icall_String_Variant_Boolean( mb, this.ptr, variant, fullObjects)
  }
}
