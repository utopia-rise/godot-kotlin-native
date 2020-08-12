// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.invokeConstructor
import kotlin.Any

open class SpotLight internal constructor(
  _ignore: Any?
) : Light(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("SpotLight", "SpotLight")
        }

  }
}
