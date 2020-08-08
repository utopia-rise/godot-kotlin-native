package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class ARVRCamera internal constructor(
  _ignore: Any?
) : Camera(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ARVRCamera", "ARVRCamera")
        }

  }

  companion object
}
