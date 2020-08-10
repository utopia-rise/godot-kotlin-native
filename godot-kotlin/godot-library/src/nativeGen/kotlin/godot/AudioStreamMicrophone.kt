// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class AudioStreamMicrophone internal constructor(
  _ignore: Any?
) : AudioStream(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioStreamMicrophone", "AudioStreamMicrophone")
        }

  }
}
