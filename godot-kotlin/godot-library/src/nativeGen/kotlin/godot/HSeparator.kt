package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class HSeparator internal constructor(
  _ignore: Any?
) : Separator(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("HSeparator", "HSeparator")
        }

  }
}
