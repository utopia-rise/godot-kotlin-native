// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class TextureProgress : Range() {
  open var fillMode: Long
    get() {
      val mb = getMethodBind("TextureProgress","get_fill_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_fill_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var ninePatchStretch: Boolean
    get() {
      val mb = getMethodBind("TextureProgress","get_nine_patch_stretch")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_nine_patch_stretch")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var radialCenterOffset: Vector2
    get() {
      val mb = getMethodBind("TextureProgress","get_radial_center_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_radial_center_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var radialFillDegrees: Double
    get() {
      val mb = getMethodBind("TextureProgress","get_fill_degrees")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_fill_degrees")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var radialInitialAngle: Double
    get() {
      val mb = getMethodBind("TextureProgress","get_radial_initial_angle")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_radial_initial_angle")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var stretchMarginBottom: Long
    get() {
      val mb = getMethodBind("TextureProgress","get_stretch_margin")
      return _icall_Long_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_stretch_margin")
      _icall_Unit_Long_Long(mb, this.ptr, 3, value)
    }

  open var stretchMarginLeft: Long
    get() {
      val mb = getMethodBind("TextureProgress","get_stretch_margin")
      return _icall_Long_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_stretch_margin")
      _icall_Unit_Long_Long(mb, this.ptr, 0, value)
    }

  open var stretchMarginRight: Long
    get() {
      val mb = getMethodBind("TextureProgress","get_stretch_margin")
      return _icall_Long_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_stretch_margin")
      _icall_Unit_Long_Long(mb, this.ptr, 2, value)
    }

  open var stretchMarginTop: Long
    get() {
      val mb = getMethodBind("TextureProgress","get_stretch_margin")
      return _icall_Long_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_stretch_margin")
      _icall_Unit_Long_Long(mb, this.ptr, 1, value)
    }

  open var textureOver: Texture
    get() {
      val mb = getMethodBind("TextureProgress","get_over_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_over_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var textureProgress: Texture
    get() {
      val mb = getMethodBind("TextureProgress","get_progress_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_progress_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var textureUnder: Texture
    get() {
      val mb = getMethodBind("TextureProgress","get_under_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_under_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var tintOver: Color
    get() {
      val mb = getMethodBind("TextureProgress","get_tint_over")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_tint_over")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var tintProgress: Color
    get() {
      val mb = getMethodBind("TextureProgress","get_tint_progress")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_tint_progress")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var tintUnder: Color
    get() {
      val mb = getMethodBind("TextureProgress","get_tint_under")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureProgress","set_tint_under")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("TextureProgress", "TextureProgress")

  open fun radialCenterOffset(schedule: Vector2.() -> Unit): Vector2 = radialCenterOffset.apply{
      schedule(this)
      radialCenterOffset = this
  }


  open fun tintOver(schedule: Color.() -> Unit): Color = tintOver.apply{
      schedule(this)
      tintOver = this
  }


  open fun tintProgress(schedule: Color.() -> Unit): Color = tintProgress.apply{
      schedule(this)
      tintProgress = this
  }


  open fun tintUnder(schedule: Color.() -> Unit): Color = tintUnder.apply{
      schedule(this)
      tintUnder = this
  }


  open fun getFillDegrees(): Double {
    val mb = getMethodBind("TextureProgress","get_fill_degrees")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFillMode(): Long {
    val mb = getMethodBind("TextureProgress","get_fill_mode")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNinePatchStretch(): Boolean {
    val mb = getMethodBind("TextureProgress","get_nine_patch_stretch")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getOverTexture(): Texture {
    val mb = getMethodBind("TextureProgress","get_over_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getProgressTexture(): Texture {
    val mb = getMethodBind("TextureProgress","get_progress_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getRadialCenterOffset(): Vector2 {
    val mb = getMethodBind("TextureProgress","get_radial_center_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getRadialInitialAngle(): Double {
    val mb = getMethodBind("TextureProgress","get_radial_initial_angle")
    return _icall_Double( mb, this.ptr)
  }

  open fun getStretchMargin(margin: Long): Long {
    val mb = getMethodBind("TextureProgress","get_stretch_margin")
    return _icall_Long_Long( mb, this.ptr, margin)
  }

  open fun getTintOver(): Color {
    val mb = getMethodBind("TextureProgress","get_tint_over")
    return _icall_Color( mb, this.ptr)
  }

  open fun getTintProgress(): Color {
    val mb = getMethodBind("TextureProgress","get_tint_progress")
    return _icall_Color( mb, this.ptr)
  }

  open fun getTintUnder(): Color {
    val mb = getMethodBind("TextureProgress","get_tint_under")
    return _icall_Color( mb, this.ptr)
  }

  open fun getUnderTexture(): Texture {
    val mb = getMethodBind("TextureProgress","get_under_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun setFillDegrees(mode: Double) {
    val mb = getMethodBind("TextureProgress","set_fill_degrees")
    _icall_Unit_Double( mb, this.ptr, mode)
  }

  open fun setFillMode(mode: Long) {
    val mb = getMethodBind("TextureProgress","set_fill_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setNinePatchStretch(stretch: Boolean) {
    val mb = getMethodBind("TextureProgress","set_nine_patch_stretch")
    _icall_Unit_Boolean( mb, this.ptr, stretch)
  }

  open fun setOverTexture(tex: Texture) {
    val mb = getMethodBind("TextureProgress","set_over_texture")
    _icall_Unit_Object( mb, this.ptr, tex)
  }

  open fun setProgressTexture(tex: Texture) {
    val mb = getMethodBind("TextureProgress","set_progress_texture")
    _icall_Unit_Object( mb, this.ptr, tex)
  }

  open fun setRadialCenterOffset(mode: Vector2) {
    val mb = getMethodBind("TextureProgress","set_radial_center_offset")
    _icall_Unit_Vector2( mb, this.ptr, mode)
  }

  open fun setRadialInitialAngle(mode: Double) {
    val mb = getMethodBind("TextureProgress","set_radial_initial_angle")
    _icall_Unit_Double( mb, this.ptr, mode)
  }

  open fun setStretchMargin(margin: Long, value: Long) {
    val mb = getMethodBind("TextureProgress","set_stretch_margin")
    _icall_Unit_Long_Long( mb, this.ptr, margin, value)
  }

  open fun setTintOver(tint: Color) {
    val mb = getMethodBind("TextureProgress","set_tint_over")
    _icall_Unit_Color( mb, this.ptr, tint)
  }

  open fun setTintProgress(tint: Color) {
    val mb = getMethodBind("TextureProgress","set_tint_progress")
    _icall_Unit_Color( mb, this.ptr, tint)
  }

  open fun setTintUnder(tint: Color) {
    val mb = getMethodBind("TextureProgress","set_tint_under")
    _icall_Unit_Color( mb, this.ptr, tint)
  }

  open fun setUnderTexture(tex: Texture) {
    val mb = getMethodBind("TextureProgress","set_under_texture")
    _icall_Unit_Object( mb, this.ptr, tex)
  }

  enum class FillMode(
    id: Long
  ) {
    FILL_LEFT_TO_RIGHT(0),

    FILL_RIGHT_TO_LEFT(1),

    FILL_TOP_TO_BOTTOM(2),

    FILL_BOTTOM_TO_TOP(3),

    FILL_CLOCKWISE(4),

    FILL_COUNTER_CLOCKWISE(5),

    FILL_BILINEAR_LEFT_AND_RIGHT(6),

    FILL_BILINEAR_TOP_AND_BOTTOM(7),

    FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
