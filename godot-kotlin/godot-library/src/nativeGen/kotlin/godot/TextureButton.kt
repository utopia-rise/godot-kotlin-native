// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.TextureButton
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_BitMap
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

open class TextureButton internal constructor(
  _ignore: Any?
) : BaseButton(_ignore) {
  open var expand: Boolean
    get() {
      val mb = getMethodBind("TextureButton","get_expand")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureButton","set_expand")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var stretchMode: Long
    get() {
      val mb = getMethodBind("TextureButton","get_stretch_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureButton","set_stretch_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var textureClickMask: BitMap
    get() {
      val mb = getMethodBind("TextureButton","get_click_mask")
      return _icall_BitMap(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureButton","set_click_mask")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var textureDisabled: Texture
    get() {
      val mb = getMethodBind("TextureButton","get_disabled_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureButton","set_disabled_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var textureFocused: Texture
    get() {
      val mb = getMethodBind("TextureButton","get_focused_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureButton","set_focused_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var textureHover: Texture
    get() {
      val mb = getMethodBind("TextureButton","get_hover_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureButton","set_hover_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var textureNormal: Texture
    get() {
      val mb = getMethodBind("TextureButton","get_normal_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureButton","set_normal_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var texturePressed: Texture
    get() {
      val mb = getMethodBind("TextureButton","get_pressed_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureButton","set_pressed_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("TextureButton", "TextureButton")
        }

  }

  open fun getClickMask(): BitMap {
    val mb = getMethodBind("TextureButton","get_click_mask")
    return _icall_BitMap( mb, this.ptr)
  }

  open fun getDisabledTexture(): Texture {
    val mb = getMethodBind("TextureButton","get_disabled_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getExpand(): Boolean {
    val mb = getMethodBind("TextureButton","get_expand")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getFocusedTexture(): Texture {
    val mb = getMethodBind("TextureButton","get_focused_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getHoverTexture(): Texture {
    val mb = getMethodBind("TextureButton","get_hover_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getNormalTexture(): Texture {
    val mb = getMethodBind("TextureButton","get_normal_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getPressedTexture(): Texture {
    val mb = getMethodBind("TextureButton","get_pressed_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getStretchMode(): TextureButton.StretchMode {
    val mb = getMethodBind("TextureButton","get_stretch_mode")
    return TextureButton.StretchMode.from( _icall_Long( mb, this.ptr))
  }

  open fun setClickMask(mask: BitMap) {
    val mb = getMethodBind("TextureButton","set_click_mask")
    _icall_Unit_Object( mb, this.ptr, mask)
  }

  open fun setDisabledTexture(texture: Texture) {
    val mb = getMethodBind("TextureButton","set_disabled_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setExpand(pExpand: Boolean) {
    val mb = getMethodBind("TextureButton","set_expand")
    _icall_Unit_Boolean( mb, this.ptr, pExpand)
  }

  open fun setFocusedTexture(texture: Texture) {
    val mb = getMethodBind("TextureButton","set_focused_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setHoverTexture(texture: Texture) {
    val mb = getMethodBind("TextureButton","set_hover_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setNormalTexture(texture: Texture) {
    val mb = getMethodBind("TextureButton","set_normal_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setPressedTexture(texture: Texture) {
    val mb = getMethodBind("TextureButton","set_pressed_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setStretchMode(pMode: Long) {
    val mb = getMethodBind("TextureButton","set_stretch_mode")
    _icall_Unit_Long( mb, this.ptr, pMode)
  }

  enum class StretchMode(
    id: Long
  ) {
    STRETCH_SCALE(0),

    STRETCH_TILE(1),

    STRETCH_KEEP(2),

    STRETCH_KEEP_CENTERED(3),

    STRETCH_KEEP_ASPECT(4),

    STRETCH_KEEP_ASPECT_CENTERED(5),

    STRETCH_KEEP_ASPECT_COVERED(6);

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
