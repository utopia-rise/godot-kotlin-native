// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Rect2
import godot.core.Signal0
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Rect2
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Rect2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class Sprite : Node2D() {
  val frameChanged: Signal0 by signal()

  val textureChanged: Signal0 by signal()

  open var centered: Boolean
    get() {
      val mb = getMethodBind("Sprite","is_centered")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_centered")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var flipH: Boolean
    get() {
      val mb = getMethodBind("Sprite","is_flipped_h")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_flip_h")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var flipV: Boolean
    get() {
      val mb = getMethodBind("Sprite","is_flipped_v")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_flip_v")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var frame: Long
    get() {
      val mb = getMethodBind("Sprite","get_frame")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_frame")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var frameCoords: Vector2
    get() {
      val mb = getMethodBind("Sprite","get_frame_coords")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_frame_coords")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var hframes: Long
    get() {
      val mb = getMethodBind("Sprite","get_hframes")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_hframes")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var normalMap: Texture
    get() {
      val mb = getMethodBind("Sprite","get_normal_map")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_normal_map")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var offset: Vector2
    get() {
      val mb = getMethodBind("Sprite","get_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var regionEnabled: Boolean
    get() {
      val mb = getMethodBind("Sprite","is_region")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_region")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var regionFilterClip: Boolean
    get() {
      val mb = getMethodBind("Sprite","is_region_filter_clip_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_region_filter_clip")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var regionRect: Rect2
    get() {
      val mb = getMethodBind("Sprite","get_region_rect")
      return _icall_Rect2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_region_rect")
      _icall_Unit_Rect2(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("Sprite","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var vframes: Long
    get() {
      val mb = getMethodBind("Sprite","get_vframes")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite","set_vframes")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("Sprite", "Sprite")

  open fun frameCoords(schedule: Vector2.() -> Unit): Vector2 = frameCoords.apply{
      schedule(this)
      frameCoords = this
  }


  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun regionRect(schedule: Rect2.() -> Unit): Rect2 = regionRect.apply{
      schedule(this)
      regionRect = this
  }


  open fun _textureChanged() {
  }

  open fun getFrame(): Long {
    val mb = getMethodBind("Sprite","get_frame")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFrameCoords(): Vector2 {
    val mb = getMethodBind("Sprite","get_frame_coords")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getHframes(): Long {
    val mb = getMethodBind("Sprite","get_hframes")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNormalMap(): Texture {
    val mb = getMethodBind("Sprite","get_normal_map")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getOffset(): Vector2 {
    val mb = getMethodBind("Sprite","get_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getRect(): Rect2 {
    val mb = getMethodBind("Sprite","get_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getRegionRect(): Rect2 {
    val mb = getMethodBind("Sprite","get_region_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("Sprite","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getVframes(): Long {
    val mb = getMethodBind("Sprite","get_vframes")
    return _icall_Long( mb, this.ptr)
  }

  open fun isCentered(): Boolean {
    val mb = getMethodBind("Sprite","is_centered")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFlippedH(): Boolean {
    val mb = getMethodBind("Sprite","is_flipped_h")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFlippedV(): Boolean {
    val mb = getMethodBind("Sprite","is_flipped_v")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPixelOpaque(pos: Vector2): Boolean {
    val mb = getMethodBind("Sprite","is_pixel_opaque")
    return _icall_Boolean_Vector2( mb, this.ptr, pos)
  }

  open fun isRegion(): Boolean {
    val mb = getMethodBind("Sprite","is_region")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRegionFilterClipEnabled(): Boolean {
    val mb = getMethodBind("Sprite","is_region_filter_clip_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setCentered(centered: Boolean) {
    val mb = getMethodBind("Sprite","set_centered")
    _icall_Unit_Boolean( mb, this.ptr, centered)
  }

  open fun setFlipH(flipH: Boolean) {
    val mb = getMethodBind("Sprite","set_flip_h")
    _icall_Unit_Boolean( mb, this.ptr, flipH)
  }

  open fun setFlipV(flipV: Boolean) {
    val mb = getMethodBind("Sprite","set_flip_v")
    _icall_Unit_Boolean( mb, this.ptr, flipV)
  }

  open fun setFrame(frame: Long) {
    val mb = getMethodBind("Sprite","set_frame")
    _icall_Unit_Long( mb, this.ptr, frame)
  }

  open fun setFrameCoords(coords: Vector2) {
    val mb = getMethodBind("Sprite","set_frame_coords")
    _icall_Unit_Vector2( mb, this.ptr, coords)
  }

  open fun setHframes(hframes: Long) {
    val mb = getMethodBind("Sprite","set_hframes")
    _icall_Unit_Long( mb, this.ptr, hframes)
  }

  open fun setNormalMap(normalMap: Texture) {
    val mb = getMethodBind("Sprite","set_normal_map")
    _icall_Unit_Object( mb, this.ptr, normalMap)
  }

  open fun setOffset(offset: Vector2) {
    val mb = getMethodBind("Sprite","set_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setRegion(enabled: Boolean) {
    val mb = getMethodBind("Sprite","set_region")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setRegionFilterClip(enabled: Boolean) {
    val mb = getMethodBind("Sprite","set_region_filter_clip")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setRegionRect(rect: Rect2) {
    val mb = getMethodBind("Sprite","set_region_rect")
    _icall_Unit_Rect2( mb, this.ptr, rect)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("Sprite","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setVframes(vframes: Long) {
    val mb = getMethodBind("Sprite","set_vframes")
    _icall_Unit_Long( mb, this.ptr, vframes)
  }
}
