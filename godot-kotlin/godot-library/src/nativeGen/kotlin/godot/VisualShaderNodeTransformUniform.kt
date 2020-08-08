package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class VisualShaderNodeTransformUniform internal constructor(
  _ignore: Any?
) : VisualShaderNodeUniform(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeTransformUniform",
            "VisualShaderNodeTransformUniform")
        }

  }

  companion object
}
