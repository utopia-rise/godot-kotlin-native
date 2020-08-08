package godot

import godot.DynamicFontData
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class DynamicFontData internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var antialiased: Boolean
    get() {
      val mb = getMethodBind("DynamicFontData","is_antialiased")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DynamicFontData","set_antialiased")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var fontPath: String
    get() {
      val mb = getMethodBind("DynamicFontData","get_font_path")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DynamicFontData","set_font_path")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var hinting: Long
    get() {
      val mb = getMethodBind("DynamicFontData","get_hinting")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DynamicFontData","set_hinting")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("DynamicFontData", "DynamicFontData")
        }

  }

  open fun getFontPath(): String {
    val mb = getMethodBind("DynamicFontData","get_font_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getHinting(): DynamicFontData.Hinting {
    val mb = getMethodBind("DynamicFontData","get_hinting")
    return DynamicFontData.Hinting.from( _icall_Long( mb, this.ptr))
  }

  open fun isAntialiased(): Boolean {
    val mb = getMethodBind("DynamicFontData","is_antialiased")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAntialiased(antialiased: Boolean) {
    val mb = getMethodBind("DynamicFontData","set_antialiased")
    _icall_Unit_Boolean( mb, this.ptr, antialiased)
  }

  open fun setFontPath(path: String) {
    val mb = getMethodBind("DynamicFontData","set_font_path")
    _icall_Unit_String( mb, this.ptr, path)
  }

  open fun setHinting(mode: Long) {
    val mb = getMethodBind("DynamicFontData","set_hinting")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class Hinting(
    id: Long
  ) {
    HINTING_NONE(0),

    HINTING_LIGHT(1),

    HINTING_NORMAL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val HINTING_LIGHT: Long = 1

    final const val HINTING_NONE: Long = 0

    final const val HINTING_NORMAL: Long = 2
  }
}
