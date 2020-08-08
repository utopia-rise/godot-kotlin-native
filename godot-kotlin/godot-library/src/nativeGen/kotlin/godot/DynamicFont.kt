package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_DynamicFontData
import godot.icalls._icall_DynamicFontData_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Unit

open class DynamicFont internal constructor(
  _ignore: Any?
) : Font(_ignore) {
  open var extraSpacingBottom: Long
    get() {
      val mb = getMethodBind("DynamicFont","get_spacing")
      return _icall_Long_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("DynamicFont","set_spacing")
      _icall_Unit_Long_Long(mb, this.ptr, 1, value)
    }

  open var extraSpacingChar: Long
    get() {
      val mb = getMethodBind("DynamicFont","get_spacing")
      return _icall_Long_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("DynamicFont","set_spacing")
      _icall_Unit_Long_Long(mb, this.ptr, 2, value)
    }

  open var extraSpacingSpace: Long
    get() {
      val mb = getMethodBind("DynamicFont","get_spacing")
      return _icall_Long_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("DynamicFont","set_spacing")
      _icall_Unit_Long_Long(mb, this.ptr, 3, value)
    }

  open var extraSpacingTop: Long
    get() {
      val mb = getMethodBind("DynamicFont","get_spacing")
      return _icall_Long_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("DynamicFont","set_spacing")
      _icall_Unit_Long_Long(mb, this.ptr, 0, value)
    }

  open var fontData: DynamicFontData
    get() {
      val mb = getMethodBind("DynamicFont","get_font_data")
      return _icall_DynamicFontData(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DynamicFont","set_font_data")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var outlineColor: Color
    get() {
      val mb = getMethodBind("DynamicFont","get_outline_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DynamicFont","set_outline_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var outlineSize: Long
    get() {
      val mb = getMethodBind("DynamicFont","get_outline_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DynamicFont","set_outline_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var size: Long
    get() {
      val mb = getMethodBind("DynamicFont","get_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DynamicFont","set_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var useFilter: Boolean
    get() {
      val mb = getMethodBind("DynamicFont","get_use_filter")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DynamicFont","set_use_filter")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var useMipmaps: Boolean
    get() {
      val mb = getMethodBind("DynamicFont","get_use_mipmaps")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DynamicFont","set_use_mipmaps")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("DynamicFont", "DynamicFont")
        }

  }

  open fun outlineColor(schedule: Color.() -> Unit): Color = outlineColor.apply{
      schedule(this)
      outlineColor = this
  }


  open fun addFallback(data: DynamicFontData) {
    val mb = getMethodBind("DynamicFont","add_fallback")
    _icall_Unit_Object( mb, this.ptr, data)
  }

  open fun getFallback(idx: Long): DynamicFontData {
    val mb = getMethodBind("DynamicFont","get_fallback")
    return _icall_DynamicFontData_Long( mb, this.ptr, idx)
  }

  open fun getFallbackCount(): Long {
    val mb = getMethodBind("DynamicFont","get_fallback_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFontData(): DynamicFontData {
    val mb = getMethodBind("DynamicFont","get_font_data")
    return _icall_DynamicFontData( mb, this.ptr)
  }

  open fun getOutlineColor(): Color {
    val mb = getMethodBind("DynamicFont","get_outline_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getOutlineSize(): Long {
    val mb = getMethodBind("DynamicFont","get_outline_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSize(): Long {
    val mb = getMethodBind("DynamicFont","get_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSpacing(type: Long): Long {
    val mb = getMethodBind("DynamicFont","get_spacing")
    return _icall_Long_Long( mb, this.ptr, type)
  }

  open fun getUseFilter(): Boolean {
    val mb = getMethodBind("DynamicFont","get_use_filter")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getUseMipmaps(): Boolean {
    val mb = getMethodBind("DynamicFont","get_use_mipmaps")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun removeFallback(idx: Long) {
    val mb = getMethodBind("DynamicFont","remove_fallback")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun setFallback(idx: Long, data: DynamicFontData) {
    val mb = getMethodBind("DynamicFont","set_fallback")
    _icall_Unit_Long_Object( mb, this.ptr, idx, data)
  }

  open fun setFontData(data: DynamicFontData) {
    val mb = getMethodBind("DynamicFont","set_font_data")
    _icall_Unit_Object( mb, this.ptr, data)
  }

  open fun setOutlineColor(color: Color) {
    val mb = getMethodBind("DynamicFont","set_outline_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setOutlineSize(size: Long) {
    val mb = getMethodBind("DynamicFont","set_outline_size")
    _icall_Unit_Long( mb, this.ptr, size)
  }

  open fun setSize(data: Long) {
    val mb = getMethodBind("DynamicFont","set_size")
    _icall_Unit_Long( mb, this.ptr, data)
  }

  open fun setSpacing(type: Long, value: Long) {
    val mb = getMethodBind("DynamicFont","set_spacing")
    _icall_Unit_Long_Long( mb, this.ptr, type, value)
  }

  open fun setUseFilter(enable: Boolean) {
    val mb = getMethodBind("DynamicFont","set_use_filter")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setUseMipmaps(enable: Boolean) {
    val mb = getMethodBind("DynamicFont","set_use_mipmaps")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  enum class SpacingType(
    id: Long
  ) {
    SPACING_TOP(0),

    SPACING_BOTTOM(1),

    SPACING_CHAR(2),

    SPACING_SPACE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val SPACING_BOTTOM: Long = 1

    final const val SPACING_CHAR: Long = 2

    final const val SPACING_SPACE: Long = 3

    final const val SPACING_TOP: Long = 0
  }
}
