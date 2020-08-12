// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Button
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class Button internal constructor(
  _ignore: Any?
) : BaseButton(_ignore) {
  open var align: Long
    get() {
      val mb = getMethodBind("Button","get_text_align")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Button","set_text_align")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var clipText: Boolean
    get() {
      val mb = getMethodBind("Button","get_clip_text")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Button","set_clip_text")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var expandIcon: Boolean
    get() {
      val mb = getMethodBind("Button","is_expand_icon")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Button","set_expand_icon")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var flat: Boolean
    get() {
      val mb = getMethodBind("Button","is_flat")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Button","set_flat")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var icon: Texture
    get() {
      val mb = getMethodBind("Button","get_button_icon")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Button","set_button_icon")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var text: String
    get() {
      val mb = getMethodBind("Button","get_text")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Button","set_text")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Button", "Button")
        }

  }

  open fun getButtonIcon(): Texture {
    val mb = getMethodBind("Button","get_button_icon")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getClipText(): Boolean {
    val mb = getMethodBind("Button","get_clip_text")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getText(): String {
    val mb = getMethodBind("Button","get_text")
    return _icall_String( mb, this.ptr)
  }

  open fun getTextAlign(): Button.TextAlign {
    val mb = getMethodBind("Button","get_text_align")
    return Button.TextAlign.from( _icall_Long( mb, this.ptr))
  }

  open fun isExpandIcon(): Boolean {
    val mb = getMethodBind("Button","is_expand_icon")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFlat(): Boolean {
    val mb = getMethodBind("Button","is_flat")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setButtonIcon(texture: Texture) {
    val mb = getMethodBind("Button","set_button_icon")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setClipText(enabled: Boolean) {
    val mb = getMethodBind("Button","set_clip_text")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setExpandIcon(arg0: Boolean) {
    val mb = getMethodBind("Button","set_expand_icon")
    _icall_Unit_Boolean( mb, this.ptr, arg0)
  }

  open fun setFlat(enabled: Boolean) {
    val mb = getMethodBind("Button","set_flat")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setText(text: String) {
    val mb = getMethodBind("Button","set_text")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun setTextAlign(align: Long) {
    val mb = getMethodBind("Button","set_text_align")
    _icall_Unit_Long( mb, this.ptr, align)
  }

  enum class TextAlign(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);

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
