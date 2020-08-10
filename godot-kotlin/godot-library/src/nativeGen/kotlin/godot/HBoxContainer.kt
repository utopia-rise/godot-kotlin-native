package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class HBoxContainer internal constructor(
  _ignore: Any?
) : BoxContainer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("HBoxContainer", "HBoxContainer")
        }

  }
}
