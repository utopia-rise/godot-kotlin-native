// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.StyleBoxTexture
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Rect2
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Rect2
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Double_Double_Double_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Rect2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class StyleBoxTexture internal constructor(
  _ignore: Any?
) : StyleBox(_ignore) {
  val textureChanged: Signal0 by signal()

  open var axisStretchHorizontal: Long
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_h_axis_stretch_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_h_axis_stretch_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var axisStretchVertical: Long
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_v_axis_stretch_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_v_axis_stretch_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var drawCenter: Boolean
    get() {
      val mb = getMethodBind("StyleBoxTexture","is_draw_center_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_draw_center")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var expandMarginBottom: Double
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_expand_margin_size")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_expand_margin_size")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var expandMarginLeft: Double
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_expand_margin_size")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_expand_margin_size")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var expandMarginRight: Double
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_expand_margin_size")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_expand_margin_size")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var expandMarginTop: Double
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_expand_margin_size")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_expand_margin_size")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var marginBottom: Double
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_margin_size")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_margin_size")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var marginLeft: Double
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_margin_size")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_margin_size")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var marginRight: Double
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_margin_size")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_margin_size")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var marginTop: Double
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_margin_size")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_margin_size")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var modulateColor: Color
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_modulate")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_modulate")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var normalMap: Texture
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_normal_map")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_normal_map")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var regionRect: Rect2
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_region_rect")
      return _icall_Rect2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_region_rect")
      _icall_Unit_Rect2(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("StyleBoxTexture","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxTexture","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("StyleBoxTexture", "StyleBoxTexture")
        }

  }

  open fun modulateColor(schedule: Color.() -> Unit): Color = modulateColor.apply{
      schedule(this)
      modulateColor = this
  }


  open fun regionRect(schedule: Rect2.() -> Unit): Rect2 = regionRect.apply{
      schedule(this)
      regionRect = this
  }


  open fun getExpandMarginSize(margin: Long): Double {
    val mb = getMethodBind("StyleBoxTexture","get_expand_margin_size")
    return _icall_Double_Long( mb, this.ptr, margin)
  }

  open fun getHAxisStretchMode(): StyleBoxTexture.AxisStretchMode {
    val mb = getMethodBind("StyleBoxTexture","get_h_axis_stretch_mode")
    return StyleBoxTexture.AxisStretchMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getMarginSize(margin: Long): Double {
    val mb = getMethodBind("StyleBoxTexture","get_margin_size")
    return _icall_Double_Long( mb, this.ptr, margin)
  }

  open fun getModulate(): Color {
    val mb = getMethodBind("StyleBoxTexture","get_modulate")
    return _icall_Color( mb, this.ptr)
  }

  open fun getNormalMap(): Texture {
    val mb = getMethodBind("StyleBoxTexture","get_normal_map")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getRegionRect(): Rect2 {
    val mb = getMethodBind("StyleBoxTexture","get_region_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("StyleBoxTexture","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getVAxisStretchMode(): StyleBoxTexture.AxisStretchMode {
    val mb = getMethodBind("StyleBoxTexture","get_v_axis_stretch_mode")
    return StyleBoxTexture.AxisStretchMode.from( _icall_Long( mb, this.ptr))
  }

  open fun isDrawCenterEnabled(): Boolean {
    val mb = getMethodBind("StyleBoxTexture","is_draw_center_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setDrawCenter(enable: Boolean) {
    val mb = getMethodBind("StyleBoxTexture","set_draw_center")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setExpandMarginAll(size: Double) {
    val mb = getMethodBind("StyleBoxTexture","set_expand_margin_all")
    _icall_Unit_Double( mb, this.ptr, size)
  }

  open fun setExpandMarginIndividual(
    sizeLeft: Double,
    sizeTop: Double,
    sizeRight: Double,
    sizeBottom: Double
  ) {
    val mb = getMethodBind("StyleBoxTexture","set_expand_margin_individual")
    _icall_Unit_Double_Double_Double_Double( mb, this.ptr, sizeLeft, sizeTop, sizeRight, sizeBottom)
  }

  open fun setExpandMarginSize(margin: Long, size: Double) {
    val mb = getMethodBind("StyleBoxTexture","set_expand_margin_size")
    _icall_Unit_Long_Double( mb, this.ptr, margin, size)
  }

  open fun setHAxisStretchMode(mode: Long) {
    val mb = getMethodBind("StyleBoxTexture","set_h_axis_stretch_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setMarginSize(margin: Long, size: Double) {
    val mb = getMethodBind("StyleBoxTexture","set_margin_size")
    _icall_Unit_Long_Double( mb, this.ptr, margin, size)
  }

  open fun setModulate(color: Color) {
    val mb = getMethodBind("StyleBoxTexture","set_modulate")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setNormalMap(normalMap: Texture) {
    val mb = getMethodBind("StyleBoxTexture","set_normal_map")
    _icall_Unit_Object( mb, this.ptr, normalMap)
  }

  open fun setRegionRect(region: Rect2) {
    val mb = getMethodBind("StyleBoxTexture","set_region_rect")
    _icall_Unit_Rect2( mb, this.ptr, region)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("StyleBoxTexture","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setVAxisStretchMode(mode: Long) {
    val mb = getMethodBind("StyleBoxTexture","set_v_axis_stretch_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class AxisStretchMode(
    id: Long
  ) {
    AXIS_STRETCH_MODE_STRETCH(0),

    AXIS_STRETCH_MODE_TILE(1),

    AXIS_STRETCH_MODE_TILE_FIT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val AXIS_STRETCH_MODE_STRETCH: Long = 0

    final const val AXIS_STRETCH_MODE_TILE: Long = 1

    final const val AXIS_STRETCH_MODE_TILE_FIT: Long = 2
  }
}
