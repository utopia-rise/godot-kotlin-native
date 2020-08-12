// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any

open class PHashTranslation internal constructor(
  _ignore: Any?
) : Translation(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("PHashTranslation", "PHashTranslation")
        }

  }

  open fun generate(from: Translation) {
    val mb = getMethodBind("PHashTranslation","generate")
    _icall_Unit_Object( mb, this.ptr, from)
  }
}
