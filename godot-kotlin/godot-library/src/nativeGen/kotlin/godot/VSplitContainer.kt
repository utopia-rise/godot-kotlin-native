package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class VSplitContainer internal constructor(
  _ignore: Any?
) : SplitContainer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VSplitContainer", "VSplitContainer")
        }

  }

  companion object
}
