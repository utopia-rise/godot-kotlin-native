package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_GDNativeLibrary
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Variant_String_String_VariantArray
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class GDNative internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var library: GDNativeLibrary
    get() {
      val mb = getMethodBind("GDNative","get_library")
      return _icall_GDNativeLibrary(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GDNative","set_library")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("GDNative", "GDNative")
        }

  }

  open fun callNative(
    callingType: String,
    procedureName: String,
    arguments: VariantArray
  ): Variant {
    val mb = getMethodBind("GDNative","call_native")
    return _icall_Variant_String_String_VariantArray( mb, this.ptr, callingType, procedureName,
        arguments)
  }

  open fun getLibrary(): GDNativeLibrary {
    val mb = getMethodBind("GDNative","get_library")
    return _icall_GDNativeLibrary( mb, this.ptr)
  }

  open fun initialize(): Boolean {
    val mb = getMethodBind("GDNative","initialize")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setLibrary(library: GDNativeLibrary) {
    val mb = getMethodBind("GDNative","set_library")
    _icall_Unit_Object( mb, this.ptr, library)
  }

  open fun terminate(): Boolean {
    val mb = getMethodBind("GDNative","terminate")
    return _icall_Boolean( mb, this.ptr)
  }
}
