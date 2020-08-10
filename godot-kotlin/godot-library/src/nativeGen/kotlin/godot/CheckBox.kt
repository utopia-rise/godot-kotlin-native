package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class CheckBox internal constructor(
  _ignore: Any?
) : Button(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CheckBox", "CheckBox")
        }

  }
}
