package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class PopupPanel internal constructor(
  _ignore: Any?
) : Popup(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PopupPanel", "PopupPanel")
        }

  }
}
