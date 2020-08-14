// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Dictionary
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Variant
import godot.icalls._icall_String
import godot.icalls._icall_String_Variant
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class RegExMatch : Reference() {
  open val names: Dictionary
    get() {
      val mb = getMethodBind("RegExMatch","get_names")
      return _icall_Dictionary(mb, this.ptr)
    }

  open val strings: VariantArray
    get() {
      val mb = getMethodBind("RegExMatch","get_strings")
      return _icall_VariantArray(mb, this.ptr)
    }

  open val subject: String
    get() {
      val mb = getMethodBind("RegExMatch","get_subject")
      return _icall_String(mb, this.ptr)
    }

  override fun __new(): COpaquePointer = invokeConstructor("RegExMatch", "RegExMatch")

  open fun getEnd(name: Variant = Variant(0)): Long {
    val mb = getMethodBind("RegExMatch","get_end")
    return _icall_Long_Variant( mb, this.ptr, name)
  }

  open fun getGroupCount(): Long {
    val mb = getMethodBind("RegExMatch","get_group_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNames(): Dictionary {
    val mb = getMethodBind("RegExMatch","get_names")
    return _icall_Dictionary( mb, this.ptr)
  }

  open fun getStart(name: Variant = Variant(0)): Long {
    val mb = getMethodBind("RegExMatch","get_start")
    return _icall_Long_Variant( mb, this.ptr, name)
  }

  open fun getString(name: Variant = Variant(0)): String {
    val mb = getMethodBind("RegExMatch","get_string")
    return _icall_String_Variant( mb, this.ptr, name)
  }

  open fun getStrings(): VariantArray {
    val mb = getMethodBind("RegExMatch","get_strings")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getSubject(): String {
    val mb = getMethodBind("RegExMatch","get_subject")
    return _icall_String( mb, this.ptr)
  }
}
