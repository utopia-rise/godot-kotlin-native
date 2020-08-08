package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class AudioEffectEQ21 internal constructor(
  _ignore: Any?
) : AudioEffectEQ(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectEQ21", "AudioEffectEQ21")
        }

  }

  companion object
}
