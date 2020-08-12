// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Double_Double_Double_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Long_Long_Long
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class StyleBoxFlat internal constructor(
  _ignore: Any?
) : StyleBox(_ignore) {
  open var antiAliasing: Boolean
    get() {
      val mb = getMethodBind("StyleBoxFlat","is_anti_aliased")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_anti_aliased")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var antiAliasingSize: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_aa_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_aa_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var bgColor: Color
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_bg_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_bg_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var borderBlend: Boolean
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_border_blend")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_border_blend")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var borderColor: Color
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_border_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_border_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var borderWidthBottom: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_border_width")
      return _icall_Long_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_border_width")
      _icall_Unit_Long_Long(mb, this.ptr, 3, value)
    }

  open var borderWidthLeft: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_border_width")
      return _icall_Long_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_border_width")
      _icall_Unit_Long_Long(mb, this.ptr, 0, value)
    }

  open var borderWidthRight: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_border_width")
      return _icall_Long_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_border_width")
      _icall_Unit_Long_Long(mb, this.ptr, 2, value)
    }

  open var borderWidthTop: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_border_width")
      return _icall_Long_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_border_width")
      _icall_Unit_Long_Long(mb, this.ptr, 1, value)
    }

  open var cornerDetail: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_corner_detail")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_corner_detail")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var cornerRadiusBottomLeft: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_corner_radius")
      return _icall_Long_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_corner_radius")
      _icall_Unit_Long_Long(mb, this.ptr, 3, value)
    }

  open var cornerRadiusBottomRight: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_corner_radius")
      return _icall_Long_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_corner_radius")
      _icall_Unit_Long_Long(mb, this.ptr, 2, value)
    }

  open var cornerRadiusTopLeft: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_corner_radius")
      return _icall_Long_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_corner_radius")
      _icall_Unit_Long_Long(mb, this.ptr, 0, value)
    }

  open var cornerRadiusTopRight: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_corner_radius")
      return _icall_Long_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_corner_radius")
      _icall_Unit_Long_Long(mb, this.ptr, 1, value)
    }

  open var drawCenter: Boolean
    get() {
      val mb = getMethodBind("StyleBoxFlat","is_draw_center_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_draw_center")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var expandMarginBottom: Double
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_expand_margin")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_expand_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var expandMarginLeft: Double
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_expand_margin")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_expand_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var expandMarginRight: Double
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_expand_margin")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_expand_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var expandMarginTop: Double
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_expand_margin")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_expand_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var shadowColor: Color
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_shadow_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_shadow_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var shadowOffset: Vector2
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_shadow_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_shadow_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var shadowSize: Long
    get() {
      val mb = getMethodBind("StyleBoxFlat","get_shadow_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxFlat","set_shadow_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("StyleBoxFlat", "StyleBoxFlat")
        }

  }

  open fun bgColor(schedule: Color.() -> Unit): Color = bgColor.apply{
      schedule(this)
      bgColor = this
  }


  open fun borderColor(schedule: Color.() -> Unit): Color = borderColor.apply{
      schedule(this)
      borderColor = this
  }


  open fun shadowColor(schedule: Color.() -> Unit): Color = shadowColor.apply{
      schedule(this)
      shadowColor = this
  }


  open fun shadowOffset(schedule: Vector2.() -> Unit): Vector2 = shadowOffset.apply{
      schedule(this)
      shadowOffset = this
  }


  open fun getAaSize(): Long {
    val mb = getMethodBind("StyleBoxFlat","get_aa_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBgColor(): Color {
    val mb = getMethodBind("StyleBoxFlat","get_bg_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getBorderBlend(): Boolean {
    val mb = getMethodBind("StyleBoxFlat","get_border_blend")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getBorderColor(): Color {
    val mb = getMethodBind("StyleBoxFlat","get_border_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getBorderWidth(margin: Long): Long {
    val mb = getMethodBind("StyleBoxFlat","get_border_width")
    return _icall_Long_Long( mb, this.ptr, margin)
  }

  open fun getBorderWidthMin(): Long {
    val mb = getMethodBind("StyleBoxFlat","get_border_width_min")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCornerDetail(): Long {
    val mb = getMethodBind("StyleBoxFlat","get_corner_detail")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCornerRadius(corner: Long): Long {
    val mb = getMethodBind("StyleBoxFlat","get_corner_radius")
    return _icall_Long_Long( mb, this.ptr, corner)
  }

  open fun getExpandMargin(margin: Long): Double {
    val mb = getMethodBind("StyleBoxFlat","get_expand_margin")
    return _icall_Double_Long( mb, this.ptr, margin)
  }

  open fun getShadowColor(): Color {
    val mb = getMethodBind("StyleBoxFlat","get_shadow_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getShadowOffset(): Vector2 {
    val mb = getMethodBind("StyleBoxFlat","get_shadow_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getShadowSize(): Long {
    val mb = getMethodBind("StyleBoxFlat","get_shadow_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun isAntiAliased(): Boolean {
    val mb = getMethodBind("StyleBoxFlat","is_anti_aliased")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDrawCenterEnabled(): Boolean {
    val mb = getMethodBind("StyleBoxFlat","is_draw_center_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAaSize(size: Long) {
    val mb = getMethodBind("StyleBoxFlat","set_aa_size")
    _icall_Unit_Long( mb, this.ptr, size)
  }

  open fun setAntiAliased(antiAliased: Boolean) {
    val mb = getMethodBind("StyleBoxFlat","set_anti_aliased")
    _icall_Unit_Boolean( mb, this.ptr, antiAliased)
  }

  open fun setBgColor(color: Color) {
    val mb = getMethodBind("StyleBoxFlat","set_bg_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setBorderBlend(blend: Boolean) {
    val mb = getMethodBind("StyleBoxFlat","set_border_blend")
    _icall_Unit_Boolean( mb, this.ptr, blend)
  }

  open fun setBorderColor(color: Color) {
    val mb = getMethodBind("StyleBoxFlat","set_border_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setBorderWidth(margin: Long, width: Long) {
    val mb = getMethodBind("StyleBoxFlat","set_border_width")
    _icall_Unit_Long_Long( mb, this.ptr, margin, width)
  }

  open fun setBorderWidthAll(width: Long) {
    val mb = getMethodBind("StyleBoxFlat","set_border_width_all")
    _icall_Unit_Long( mb, this.ptr, width)
  }

  open fun setCornerDetail(detail: Long) {
    val mb = getMethodBind("StyleBoxFlat","set_corner_detail")
    _icall_Unit_Long( mb, this.ptr, detail)
  }

  open fun setCornerRadius(corner: Long, radius: Long) {
    val mb = getMethodBind("StyleBoxFlat","set_corner_radius")
    _icall_Unit_Long_Long( mb, this.ptr, corner, radius)
  }

  open fun setCornerRadiusAll(radius: Long) {
    val mb = getMethodBind("StyleBoxFlat","set_corner_radius_all")
    _icall_Unit_Long( mb, this.ptr, radius)
  }

  open fun setCornerRadiusIndividual(
    radiusTopLeft: Long,
    radiusTopRight: Long,
    radiusBottomRight: Long,
    radiusBottomLeft: Long
  ) {
    val mb = getMethodBind("StyleBoxFlat","set_corner_radius_individual")
    _icall_Unit_Long_Long_Long_Long( mb, this.ptr, radiusTopLeft, radiusTopRight, radiusBottomRight,
        radiusBottomLeft)
  }

  open fun setDrawCenter(drawCenter: Boolean) {
    val mb = getMethodBind("StyleBoxFlat","set_draw_center")
    _icall_Unit_Boolean( mb, this.ptr, drawCenter)
  }

  open fun setExpandMargin(margin: Long, size: Double) {
    val mb = getMethodBind("StyleBoxFlat","set_expand_margin")
    _icall_Unit_Long_Double( mb, this.ptr, margin, size)
  }

  open fun setExpandMarginAll(size: Double) {
    val mb = getMethodBind("StyleBoxFlat","set_expand_margin_all")
    _icall_Unit_Double( mb, this.ptr, size)
  }

  open fun setExpandMarginIndividual(
    sizeLeft: Double,
    sizeTop: Double,
    sizeRight: Double,
    sizeBottom: Double
  ) {
    val mb = getMethodBind("StyleBoxFlat","set_expand_margin_individual")
    _icall_Unit_Double_Double_Double_Double( mb, this.ptr, sizeLeft, sizeTop, sizeRight, sizeBottom)
  }

  open fun setShadowColor(color: Color) {
    val mb = getMethodBind("StyleBoxFlat","set_shadow_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setShadowOffset(offset: Vector2) {
    val mb = getMethodBind("StyleBoxFlat","set_shadow_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setShadowSize(size: Long) {
    val mb = getMethodBind("StyleBoxFlat","set_shadow_size")
    _icall_Unit_Long( mb, this.ptr, size)
  }
}
