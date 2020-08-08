package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class SpotLight internal constructor(
  _ignore: Any?
) : Light(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SpotLight", "SpotLight")
        }

  }

  companion object
}
