package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_RegExMatch_String_Long_Long
import godot.icalls._icall_String
import godot.icalls._icall_String_String_String_Boolean_Long_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_VariantArray
import godot.icalls._icall_VariantArray_String_Long_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class RegEx internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("RegEx", "RegEx")
        }

  }

  open fun clear() {
    val mb = getMethodBind("RegEx","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun compile(pattern: String): GodotError {
    val mb = getMethodBind("RegEx","compile")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, pattern).toUInt())
  }

  open fun getGroupCount(): Long {
    val mb = getMethodBind("RegEx","get_group_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNames(): VariantArray {
    val mb = getMethodBind("RegEx","get_names")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getPattern(): String {
    val mb = getMethodBind("RegEx","get_pattern")
    return _icall_String( mb, this.ptr)
  }

  open fun isValid(): Boolean {
    val mb = getMethodBind("RegEx","is_valid")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun search(
    subject: String,
    offset: Long = 0,
    end: Long = -1
  ): RegExMatch {
    val mb = getMethodBind("RegEx","search")
    return _icall_RegExMatch_String_Long_Long( mb, this.ptr, subject, offset, end)
  }

  open fun searchAll(
    subject: String,
    offset: Long = 0,
    end: Long = -1
  ): VariantArray {
    val mb = getMethodBind("RegEx","search_all")
    return _icall_VariantArray_String_Long_Long( mb, this.ptr, subject, offset, end)
  }

  open fun sub(
    subject: String,
    replacement: String,
    all: Boolean = false,
    offset: Long = 0,
    end: Long = -1
  ): String {
    val mb = getMethodBind("RegEx","sub")
    return _icall_String_String_String_Boolean_Long_Long( mb, this.ptr, subject, replacement, all,
        offset, end)
  }

  companion object
}
