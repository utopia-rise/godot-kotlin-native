// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.RID
import godot.core.Rect2
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Image
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_RID_Rect2_Boolean_Color_Boolean_nObject
import godot.icalls._icall_Unit_RID_Rect2_Rect2_Color_Boolean_nObject_Boolean
import godot.icalls._icall_Unit_RID_Vector2_Color_Boolean_nObject
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class Texture internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var flags: Long
    get() {
      val mb = getMethodBind("Texture","get_flags")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Texture","set_flags")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun draw(
    canvasItem: RID,
    position: Vector2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null
  ) {
    val mb = getMethodBind("Texture","draw")
    _icall_Unit_RID_Vector2_Color_Boolean_nObject( mb, this.ptr, canvasItem, position, modulate,
        transpose, normalMap)
  }

  open fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null
  ) {
    val mb = getMethodBind("Texture","draw_rect")
    _icall_Unit_RID_Rect2_Boolean_Color_Boolean_nObject( mb, this.ptr, canvasItem, rect, tile,
        modulate, transpose, normalMap)
  }

  open fun drawRectRegion(
    canvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null,
    clipUv: Boolean = true
  ) {
    val mb = getMethodBind("Texture","draw_rect_region")
    _icall_Unit_RID_Rect2_Rect2_Color_Boolean_nObject_Boolean( mb, this.ptr, canvasItem, rect,
        srcRect, modulate, transpose, normalMap, clipUv)
  }

  open fun getData(): Image {
    val mb = getMethodBind("Texture","get_data")
    return _icall_Image( mb, this.ptr)
  }

  open fun getFlags(): Long {
    val mb = getMethodBind("Texture","get_flags")
    return _icall_Long( mb, this.ptr)
  }

  open fun getHeight(): Long {
    val mb = getMethodBind("Texture","get_height")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSize(): Vector2 {
    val mb = getMethodBind("Texture","get_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getWidth(): Long {
    val mb = getMethodBind("Texture","get_width")
    return _icall_Long( mb, this.ptr)
  }

  open fun hasAlpha(): Boolean {
    val mb = getMethodBind("Texture","has_alpha")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setFlags(flags: Long) {
    val mb = getMethodBind("Texture","set_flags")
    _icall_Unit_Long( mb, this.ptr, flags)
  }

  enum class Flags(
    id: Long
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    FLAGS_DEFAULT(7),

    FLAG_ANISOTROPIC_FILTER(8),

    FLAG_CONVERT_TO_LINEAR(16),

    FLAG_MIRRORED_REPEAT(32),

    FLAG_VIDEO_SURFACE(2048);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FLAGS_DEFAULT: Long = 7

    final const val FLAG_ANISOTROPIC_FILTER: Long = 8

    final const val FLAG_CONVERT_TO_LINEAR: Long = 16

    final const val FLAG_FILTER: Long = 4

    final const val FLAG_MIPMAPS: Long = 1

    final const val FLAG_MIRRORED_REPEAT: Long = 32

    final const val FLAG_REPEAT: Long = 2

    final const val FLAG_VIDEO_SURFACE: Long = 2048
  }
}
