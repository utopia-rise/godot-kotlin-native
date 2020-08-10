// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.NinePatchRect
import godot.core.Godot.shouldInitPtr
import godot.core.Rect2
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Rect2
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Rect2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Unit

open class NinePatchRect internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val textureChanged: Signal0 by signal()

  open var axisStretchHorizontal: Long
    get() {
      val mb = getMethodBind("NinePatchRect","get_h_axis_stretch_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NinePatchRect","set_h_axis_stretch_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var axisStretchVertical: Long
    get() {
      val mb = getMethodBind("NinePatchRect","get_v_axis_stretch_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NinePatchRect","set_v_axis_stretch_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var drawCenter: Boolean
    get() {
      val mb = getMethodBind("NinePatchRect","is_draw_center_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NinePatchRect","set_draw_center")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var patchMarginBottom: Long
    get() {
      val mb = getMethodBind("NinePatchRect","get_patch_margin")
      return _icall_Long_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("NinePatchRect","set_patch_margin")
      _icall_Unit_Long_Long(mb, this.ptr, 3, value)
    }

  open var patchMarginLeft: Long
    get() {
      val mb = getMethodBind("NinePatchRect","get_patch_margin")
      return _icall_Long_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("NinePatchRect","set_patch_margin")
      _icall_Unit_Long_Long(mb, this.ptr, 0, value)
    }

  open var patchMarginRight: Long
    get() {
      val mb = getMethodBind("NinePatchRect","get_patch_margin")
      return _icall_Long_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("NinePatchRect","set_patch_margin")
      _icall_Unit_Long_Long(mb, this.ptr, 2, value)
    }

  open var patchMarginTop: Long
    get() {
      val mb = getMethodBind("NinePatchRect","get_patch_margin")
      return _icall_Long_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("NinePatchRect","set_patch_margin")
      _icall_Unit_Long_Long(mb, this.ptr, 1, value)
    }

  open var regionRect: Rect2
    get() {
      val mb = getMethodBind("NinePatchRect","get_region_rect")
      return _icall_Rect2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NinePatchRect","set_region_rect")
      _icall_Unit_Rect2(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("NinePatchRect","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NinePatchRect","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("NinePatchRect", "NinePatchRect")
        }

  }

  open fun regionRect(schedule: Rect2.() -> Unit): Rect2 = regionRect.apply{
      schedule(this)
      regionRect = this
  }


  open fun getHAxisStretchMode(): NinePatchRect.AxisStretchMode {
    val mb = getMethodBind("NinePatchRect","get_h_axis_stretch_mode")
    return NinePatchRect.AxisStretchMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getPatchMargin(margin: Long): Long {
    val mb = getMethodBind("NinePatchRect","get_patch_margin")
    return _icall_Long_Long( mb, this.ptr, margin)
  }

  open fun getRegionRect(): Rect2 {
    val mb = getMethodBind("NinePatchRect","get_region_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("NinePatchRect","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getVAxisStretchMode(): NinePatchRect.AxisStretchMode {
    val mb = getMethodBind("NinePatchRect","get_v_axis_stretch_mode")
    return NinePatchRect.AxisStretchMode.from( _icall_Long( mb, this.ptr))
  }

  open fun isDrawCenterEnabled(): Boolean {
    val mb = getMethodBind("NinePatchRect","is_draw_center_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setDrawCenter(drawCenter: Boolean) {
    val mb = getMethodBind("NinePatchRect","set_draw_center")
    _icall_Unit_Boolean( mb, this.ptr, drawCenter)
  }

  open fun setHAxisStretchMode(mode: Long) {
    val mb = getMethodBind("NinePatchRect","set_h_axis_stretch_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setPatchMargin(margin: Long, value: Long) {
    val mb = getMethodBind("NinePatchRect","set_patch_margin")
    _icall_Unit_Long_Long( mb, this.ptr, margin, value)
  }

  open fun setRegionRect(rect: Rect2) {
    val mb = getMethodBind("NinePatchRect","set_region_rect")
    _icall_Unit_Rect2( mb, this.ptr, rect)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("NinePatchRect","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setVAxisStretchMode(mode: Long) {
    val mb = getMethodBind("NinePatchRect","set_v_axis_stretch_mode")
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
