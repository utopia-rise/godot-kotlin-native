package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class HScrollBar internal constructor(
  _ignore: Any?
) : ScrollBar(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("HScrollBar", "HScrollBar")
        }

  }

  companion object
}
