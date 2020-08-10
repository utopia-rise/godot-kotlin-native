package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class VisualScriptComposeArray internal constructor(
  _ignore: Any?
) : VisualScriptLists(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptComposeArray", "VisualScriptComposeArray")
        }

  }
}
