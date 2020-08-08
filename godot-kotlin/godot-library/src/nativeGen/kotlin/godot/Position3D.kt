package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class Position3D internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Position3D", "Position3D")
        }

  }

  companion object
}
