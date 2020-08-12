// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.LinkButton
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Long
import kotlin.String

open class LinkButton internal constructor(
  _ignore: Any?
) : BaseButton(_ignore) {
  open var text: String
    get() {
      val mb = getMethodBind("LinkButton","get_text")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LinkButton","set_text")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var underline: Long
    get() {
      val mb = getMethodBind("LinkButton","get_underline_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LinkButton","set_underline_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("LinkButton", "LinkButton")
        }

  }

  open fun getText(): String {
    val mb = getMethodBind("LinkButton","get_text")
    return _icall_String( mb, this.ptr)
  }

  open fun getUnderlineMode(): LinkButton.UnderlineMode {
    val mb = getMethodBind("LinkButton","get_underline_mode")
    return LinkButton.UnderlineMode.from( _icall_Long( mb, this.ptr))
  }

  open fun setText(text: String) {
    val mb = getMethodBind("LinkButton","set_text")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun setUnderlineMode(underlineMode: Long) {
    val mb = getMethodBind("LinkButton","set_underline_mode")
    _icall_Unit_Long( mb, this.ptr, underlineMode)
  }

  enum class UnderlineMode(
    id: Long
  ) {
    UNDERLINE_MODE_ALWAYS(0),

    UNDERLINE_MODE_ON_HOVER(1),

    UNDERLINE_MODE_NEVER(2);

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
