package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class VisualScriptIterator internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptIterator", "VisualScriptIterator")
        }

  }
}
