package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class VisualShaderNodeCubeMapUniform internal constructor(
  _ignore: Any?
) : VisualShaderNodeTextureUniform(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeCubeMapUniform",
            "VisualShaderNodeCubeMapUniform")
        }

  }
}
