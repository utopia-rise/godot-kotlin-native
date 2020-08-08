package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class AnimationNodeTimeSeek internal constructor(
  _ignore: Any?
) : AnimationNode(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationNodeTimeSeek", "AnimationNodeTimeSeek")
        }

  }

  companion object
}
