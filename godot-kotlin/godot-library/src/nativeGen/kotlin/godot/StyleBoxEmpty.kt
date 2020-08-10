package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class StyleBoxEmpty internal constructor(
  _ignore: Any?
) : StyleBox(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("StyleBoxEmpty", "StyleBoxEmpty")
        }

  }
}
