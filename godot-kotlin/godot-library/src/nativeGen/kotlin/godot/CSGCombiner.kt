package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class CSGCombiner internal constructor(
  _ignore: Any?
) : CSGShape(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CSGCombiner", "CSGCombiner")
        }

  }

  companion object
}
