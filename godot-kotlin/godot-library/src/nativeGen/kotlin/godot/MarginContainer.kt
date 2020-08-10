package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class MarginContainer internal constructor(
  _ignore: Any?
) : Container(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MarginContainer", "MarginContainer")
        }

  }
}
