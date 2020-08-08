package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class JNISingleton internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("JNISingleton", "JNISingleton")
        }

  }

  companion object
}
