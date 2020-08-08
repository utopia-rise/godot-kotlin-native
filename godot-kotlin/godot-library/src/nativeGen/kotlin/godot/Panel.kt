package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class Panel internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Panel", "Panel")
        }

  }

  companion object
}
