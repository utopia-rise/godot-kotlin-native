// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.SpatialMaterial
import godot.SpriteBase3D
import godot.core.Color
import godot.core.Rect2
import godot.core.Vector2
import godot.core.Vector3
import godot.core.Vector3.Axis
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Color
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Rect2
import godot.icalls._icall_TriangleMesh
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class SpriteBase3D internal constructor() : GeometryInstance() {
  open var alphaCut: Long
    get() {
      val mb = getMethodBind("SpriteBase3D","get_alpha_cut_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_alpha_cut_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var axis: Long
    get() {
      val mb = getMethodBind("SpriteBase3D","get_axis")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_axis")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var billboard: Long
    get() {
      val mb = getMethodBind("SpriteBase3D","get_billboard_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_billboard_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var centered: Boolean
    get() {
      val mb = getMethodBind("SpriteBase3D","is_centered")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_centered")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var doubleSided: Boolean
    get() {
      val mb = getMethodBind("SpriteBase3D","get_draw_flag")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_draw_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var flipH: Boolean
    get() {
      val mb = getMethodBind("SpriteBase3D","is_flipped_h")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_flip_h")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var flipV: Boolean
    get() {
      val mb = getMethodBind("SpriteBase3D","is_flipped_v")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_flip_v")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var modulate: Color
    get() {
      val mb = getMethodBind("SpriteBase3D","get_modulate")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_modulate")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var offset: Vector2
    get() {
      val mb = getMethodBind("SpriteBase3D","get_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var opacity: Double
    get() {
      val mb = getMethodBind("SpriteBase3D","get_opacity")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_opacity")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var pixelSize: Double
    get() {
      val mb = getMethodBind("SpriteBase3D","get_pixel_size")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_pixel_size")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var shaded: Boolean
    get() {
      val mb = getMethodBind("SpriteBase3D","get_draw_flag")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_draw_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var transparent: Boolean
    get() {
      val mb = getMethodBind("SpriteBase3D","get_draw_flag")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("SpriteBase3D","set_draw_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open fun modulate(schedule: Color.() -> Unit): Color = modulate.apply{
      schedule(this)
      modulate = this
  }


  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun _imUpdate() {
  }

  open fun _queueUpdate() {
  }

  open fun generateTriangleMesh(): TriangleMesh {
    val mb = getMethodBind("SpriteBase3D","generate_triangle_mesh")
    return _icall_TriangleMesh( mb, this.ptr)
  }

  open fun getAlphaCutMode(): SpriteBase3D.AlphaCutMode {
    val mb = getMethodBind("SpriteBase3D","get_alpha_cut_mode")
    return SpriteBase3D.AlphaCutMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getAxis(): Vector3.Axis {
    val mb = getMethodBind("SpriteBase3D","get_axis")
    return Vector3.Axis.from( _icall_Long( mb, this.ptr))
  }

  open fun getBillboardMode(): SpatialMaterial.BillboardMode {
    val mb = getMethodBind("SpriteBase3D","get_billboard_mode")
    return SpatialMaterial.BillboardMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getDrawFlag(flag: Long): Boolean {
    val mb = getMethodBind("SpriteBase3D","get_draw_flag")
    return _icall_Boolean_Long( mb, this.ptr, flag)
  }

  open fun getItemRect(): Rect2 {
    val mb = getMethodBind("SpriteBase3D","get_item_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getModulate(): Color {
    val mb = getMethodBind("SpriteBase3D","get_modulate")
    return _icall_Color( mb, this.ptr)
  }

  open fun getOffset(): Vector2 {
    val mb = getMethodBind("SpriteBase3D","get_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getOpacity(): Double {
    val mb = getMethodBind("SpriteBase3D","get_opacity")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPixelSize(): Double {
    val mb = getMethodBind("SpriteBase3D","get_pixel_size")
    return _icall_Double( mb, this.ptr)
  }

  open fun isCentered(): Boolean {
    val mb = getMethodBind("SpriteBase3D","is_centered")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFlippedH(): Boolean {
    val mb = getMethodBind("SpriteBase3D","is_flipped_h")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFlippedV(): Boolean {
    val mb = getMethodBind("SpriteBase3D","is_flipped_v")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAlphaCutMode(mode: Long) {
    val mb = getMethodBind("SpriteBase3D","set_alpha_cut_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setAxis(axis: Long) {
    val mb = getMethodBind("SpriteBase3D","set_axis")
    _icall_Unit_Long( mb, this.ptr, axis)
  }

  open fun setBillboardMode(mode: Long) {
    val mb = getMethodBind("SpriteBase3D","set_billboard_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setCentered(centered: Boolean) {
    val mb = getMethodBind("SpriteBase3D","set_centered")
    _icall_Unit_Boolean( mb, this.ptr, centered)
  }

  open fun setDrawFlag(flag: Long, enabled: Boolean) {
    val mb = getMethodBind("SpriteBase3D","set_draw_flag")
    _icall_Unit_Long_Boolean( mb, this.ptr, flag, enabled)
  }

  open fun setFlipH(flipH: Boolean) {
    val mb = getMethodBind("SpriteBase3D","set_flip_h")
    _icall_Unit_Boolean( mb, this.ptr, flipH)
  }

  open fun setFlipV(flipV: Boolean) {
    val mb = getMethodBind("SpriteBase3D","set_flip_v")
    _icall_Unit_Boolean( mb, this.ptr, flipV)
  }

  open fun setModulate(modulate: Color) {
    val mb = getMethodBind("SpriteBase3D","set_modulate")
    _icall_Unit_Color( mb, this.ptr, modulate)
  }

  open fun setOffset(offset: Vector2) {
    val mb = getMethodBind("SpriteBase3D","set_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setOpacity(opacity: Double) {
    val mb = getMethodBind("SpriteBase3D","set_opacity")
    _icall_Unit_Double( mb, this.ptr, opacity)
  }

  open fun setPixelSize(pixelSize: Double) {
    val mb = getMethodBind("SpriteBase3D","set_pixel_size")
    _icall_Unit_Double( mb, this.ptr, pixelSize)
  }

  enum class DrawFlags(
    id: Long
  ) {
    FLAG_TRANSPARENT(0),

    FLAG_SHADED(1),

    FLAG_DOUBLE_SIDED(2),

    FLAG_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AlphaCutMode(
    id: Long
  ) {
    ALPHA_CUT_DISABLED(0),

    ALPHA_CUT_DISCARD(1),

    ALPHA_CUT_OPAQUE_PREPASS(2);

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
