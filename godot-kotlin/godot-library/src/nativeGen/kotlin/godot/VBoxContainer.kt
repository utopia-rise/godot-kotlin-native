package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class VBoxContainer internal constructor(
  _ignore: Any?
) : BoxContainer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VBoxContainer", "VBoxContainer")
        }

  }
}
