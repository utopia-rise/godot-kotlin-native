// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.invokeConstructor
import kotlin.Any

open class VSlider internal constructor(
  _ignore: Any?
) : Slider(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VSlider", "VSlider")
        }

  }
}
