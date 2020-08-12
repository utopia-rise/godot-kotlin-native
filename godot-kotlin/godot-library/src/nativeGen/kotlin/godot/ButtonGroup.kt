// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.VariantArray
import godot.icalls._icall_BaseButton
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any

open class ButtonGroup internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("ButtonGroup", "ButtonGroup")
        }

  }

  open fun getButtons(): VariantArray {
    val mb = getMethodBind("ButtonGroup","get_buttons")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getPressedButton(): BaseButton {
    val mb = getMethodBind("ButtonGroup","get_pressed_button")
    return _icall_BaseButton( mb, this.ptr)
  }
}
