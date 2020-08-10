package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class AnimationNodeTimeScale internal constructor(
  _ignore: Any?
) : AnimationNode(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationNodeTimeScale", "AnimationNodeTimeScale")
        }

  }
}
