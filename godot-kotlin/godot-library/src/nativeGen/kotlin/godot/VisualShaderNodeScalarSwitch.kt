package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class VisualShaderNodeScalarSwitch internal constructor(
  _ignore: Any?
) : VisualShaderNodeSwitch(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeScalarSwitch",
            "VisualShaderNodeScalarSwitch")
        }

  }
}
