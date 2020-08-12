// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
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
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Unit

open class Sprite3D internal constructor(
  _ignore: Any?
) : SpriteBase3D(_ignore) {
  val frameChanged: Signal0 by signal()

  open var frame: Long
    get() {
      val mb = getMethodBind("Sprite3D","get_frame")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite3D","set_frame")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var frameCoords: Vector2
    get() {
      val mb = getMethodBind("Sprite3D","get_frame_coords")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite3D","set_frame_coords")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var hframes: Long
    get() {
      val mb = getMethodBind("Sprite3D","get_hframes")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite3D","set_hframes")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var regionEnabled: Boolean
    get() {
      val mb = getMethodBind("Sprite3D","is_region")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite3D","set_region")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var regionRect: Rect2
    get() {
      val mb = getMethodBind("Sprite3D","get_region_rect")
      return _icall_Rect2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite3D","set_region_rect")
      _icall_Unit_Rect2(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("Sprite3D","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite3D","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var vframes: Long
    get() {
      val mb = getMethodBind("Sprite3D","get_vframes")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Sprite3D","set_vframes")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Sprite3D", "Sprite3D")
        }

  }

  open fun frameCoords(schedule: Vector2.() -> Unit): Vector2 = frameCoords.apply{
      schedule(this)
      frameCoords = this
  }


  open fun regionRect(schedule: Rect2.() -> Unit): Rect2 = regionRect.apply{
      schedule(this)
      regionRect = this
  }


  open fun getFrame(): Long {
    val mb = getMethodBind("Sprite3D","get_frame")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFrameCoords(): Vector2 {
    val mb = getMethodBind("Sprite3D","get_frame_coords")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getHframes(): Long {
    val mb = getMethodBind("Sprite3D","get_hframes")
    return _icall_Long( mb, this.ptr)
  }

  open fun getRegionRect(): Rect2 {
    val mb = getMethodBind("Sprite3D","get_region_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("Sprite3D","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getVframes(): Long {
    val mb = getMethodBind("Sprite3D","get_vframes")
    return _icall_Long( mb, this.ptr)
  }

  open fun isRegion(): Boolean {
    val mb = getMethodBind("Sprite3D","is_region")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setFrame(frame: Long) {
    val mb = getMethodBind("Sprite3D","set_frame")
    _icall_Unit_Long( mb, this.ptr, frame)
  }

  open fun setFrameCoords(coords: Vector2) {
    val mb = getMethodBind("Sprite3D","set_frame_coords")
    _icall_Unit_Vector2( mb, this.ptr, coords)
  }

  open fun setHframes(hframes: Long) {
    val mb = getMethodBind("Sprite3D","set_hframes")
    _icall_Unit_Long( mb, this.ptr, hframes)
  }

  open fun setRegion(enabled: Boolean) {
    val mb = getMethodBind("Sprite3D","set_region")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setRegionRect(rect: Rect2) {
    val mb = getMethodBind("Sprite3D","set_region_rect")
    _icall_Unit_Rect2( mb, this.ptr, rect)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("Sprite3D","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setVframes(vframes: Long) {
    val mb = getMethodBind("Sprite3D","set_vframes")
    _icall_Unit_Long( mb, this.ptr, vframes)
  }
}
