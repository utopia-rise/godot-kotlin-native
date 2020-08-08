package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class TextureArray internal constructor(
  _ignore: Any?
) : TextureLayered(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("TextureArray", "TextureArray")
        }

  }

  companion object
}
