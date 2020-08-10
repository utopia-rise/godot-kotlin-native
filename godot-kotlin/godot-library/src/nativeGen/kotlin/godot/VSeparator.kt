package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class VSeparator internal constructor(
  _ignore: Any?
) : Separator(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VSeparator", "VSeparator")
        }

  }
}
