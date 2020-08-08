package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class AudioEffectEQ10 internal constructor(
  _ignore: Any?
) : AudioEffectEQ(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectEQ10", "AudioEffectEQ10")
        }

  }

  companion object
}
