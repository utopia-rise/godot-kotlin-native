// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.TextureRect
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class TextureRect internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  open var expand: Boolean
    get() {
      val mb = getMethodBind("TextureRect","has_expand")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureRect","set_expand")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var flipH: Boolean
    get() {
      val mb = getMethodBind("TextureRect","is_flipped_h")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureRect","set_flip_h")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var flipV: Boolean
    get() {
      val mb = getMethodBind("TextureRect","is_flipped_v")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureRect","set_flip_v")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var stretchMode: Long
    get() {
      val mb = getMethodBind("TextureRect","get_stretch_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureRect","set_stretch_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("TextureRect","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureRect","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("TextureRect", "TextureRect")
        }

  }

  open fun _textureChanged() {
  }

  open fun getStretchMode(): TextureRect.StretchMode {
    val mb = getMethodBind("TextureRect","get_stretch_mode")
    return TextureRect.StretchMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("TextureRect","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun hasExpand(): Boolean {
    val mb = getMethodBind("TextureRect","has_expand")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFlippedH(): Boolean {
    val mb = getMethodBind("TextureRect","is_flipped_h")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFlippedV(): Boolean {
    val mb = getMethodBind("TextureRect","is_flipped_v")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setExpand(enable: Boolean) {
    val mb = getMethodBind("TextureRect","set_expand")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setFlipH(enable: Boolean) {
    val mb = getMethodBind("TextureRect","set_flip_h")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setFlipV(enable: Boolean) {
    val mb = getMethodBind("TextureRect","set_flip_v")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setStretchMode(stretchMode: Long) {
    val mb = getMethodBind("TextureRect","set_stretch_mode")
    _icall_Unit_Long( mb, this.ptr, stretchMode)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("TextureRect","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  enum class StretchMode(
    id: Long
  ) {
    STRETCH_SCALE_ON_EXPAND(0),

    STRETCH_SCALE(1),

    STRETCH_TILE(2),

    STRETCH_KEEP(3),

    STRETCH_KEEP_CENTERED(4),

    STRETCH_KEEP_ASPECT(5),

    STRETCH_KEEP_ASPECT_CENTERED(6),

    STRETCH_KEEP_ASPECT_COVERED(7);

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
