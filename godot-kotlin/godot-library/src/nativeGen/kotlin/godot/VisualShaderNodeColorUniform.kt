package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class VisualShaderNodeColorUniform internal constructor(
  _ignore: Any?
) : VisualShaderNodeUniform(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeColorUniform",
            "VisualShaderNodeColorUniform")
        }

  }

  companion object
}
