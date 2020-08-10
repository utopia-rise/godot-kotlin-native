package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class VSlider internal constructor(
  _ignore: Any?
) : Slider(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VSlider", "VSlider")
        }

  }
}
