package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class AudioEffectHighShelfFilter internal constructor(
  _ignore: Any?
) : AudioEffectFilter(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectHighShelfFilter", "AudioEffectHighShelfFilter")
        }

  }
}
